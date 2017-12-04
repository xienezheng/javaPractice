

package chat;

import java.awt.BorderLayout; 
import java.awt.Frame; 
import java.awt.TextArea; 
import java.awt.TextField; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.awt.event.WindowAdapter; 
import java.awt.event.WindowEvent; 
import java.io.DataInputStream; 
import java.io.DataOutputStream; 
import java.io.IOException; 
import java.net.Socket; 
import java.net.UnknownHostException; 
import java.util.Random; 
  
/** 
 * ��������ͻ��� ���裺 
 
 *1������ͼ�δ��ڽ������� 
 
 *2��Ϊ������ӹر��¼� 
 
 *3���������м����������������չʾ���� 
 
 *4��Ϊ����������ӻس��¼� 
 * 5��������������Ӳ��������� 
 * 
 * @author tuzongxun123 
 * 
 */
public class ChatClient1 extends Frame { 
  /** 
   * 
   */
  private static final long serialVersionUID = 1L; 
  // �û��������� 
  private TextField tfTxt = new TextField(); 
  // ����չʾ���� 
  private TextArea tarea = new TextArea(); 
  private Socket socket = null; 
  // ��������� 
  private DataOutputStream dataOutputStream = null; 
  // ���������� 
  private DataInputStream dataInputStream = null; 
  private boolean isConnect = false; 
  Thread tReceive = new Thread(new ReceiveThread()); 
  String name = ""; 
  
  public static void main(String[] args) { 
    ChatClient1 chatClient = new ChatClient1(); 
    chatClient.createName(); 
    chatClient.launcFrame(); 
  
  } 
  
  /** 
   * ����һ���򵥵�ͼ�λ����� 
   * 
   * @author��tuzongxun 
   * @Title: launcFrame 
   * @param 
   * @return void 
   * @date May 18, 2016 9:57:00 AM 
   * @throws 
   */
  public void launcFrame() { 
	  setLocation(300, 200); 
	    this.setSize(200, 400); 
    add(tfTxt, BorderLayout.SOUTH); 
    add(tarea, BorderLayout.NORTH); 
    // ���ݴ�������Ĳ��ּ������preferedSize��ȷ��frame����Ѵ�С 
    pack(); 
    // ����ͼ�ν��洰�ڵĹر��¼� 
    this.addWindowListener(new WindowAdapter() { 
  
     
      public void windowClosing(WindowEvent e) { 
        System.exit(0); 
        disConnect(); 
      } 
    }); 
    tfTxt.addActionListener(new TFLister()); 
    // ���ô��ڿɼ� 
    setVisible(true); 
    connect(); 
    // ����������Ϣ���߳� 
    tReceive.start(); 
  } 
  
  /** 
   * ���ӷ����� 
   * 
   * @author��tuzongxun 
   * @Title: connect 
   * @param 
   * @return void 
   * @date May 18, 2016 9:56:49 AM 
   * @throws 
   */
  public void connect() { 
    try { 
      // �½���������� 
      socket = new Socket("127.0.0.1", 8912); 
      // ��ȡ�ͻ�������� 
      dataOutputStream = new DataOutputStream(socket.getOutputStream()); 
      dataInputStream = new DataInputStream(socket.getInputStream()); 
      System.out.println("���Ϸ����"); 
      isConnect = true; 
    } catch (UnknownHostException e) { 
      e.printStackTrace(); 
    } catch (IOException e) { 
      e.printStackTrace(); 
    } 
  } 
  
  // ��������Ŀͻ������� 
  public void createName() { 
    String[] str1 = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", 
        "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", 
        "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", 
        "9", "0", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", 
        "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", 
        "W", "X", "Y", "Z" }; 
    Random ran = new Random(); 
  
    for (int i = 0; i < 6; i++) { 
      // long num = Math.round(Math.random() * (str1.length - 0) + 0); 
      // int n = (int) num; 
      int n = ran.nextInt(str1.length); 
      if (n < str1.length) { 
        String str = str1[n]; 
        name = name + str; 
        System.out.println(name); 
      } else { 
        i--; 
        continue; 
      } 
  
    } 
    this.setTitle(name); 
  } 
  
  /** 
   * �رտͻ�����Դ 
   * 
   * @author��tuzongxun 
   * @Title: disConnect 
   * @param 
   * @return void 
   * @date May 18, 2016 9:57:46 AM 
   * @throws 
   */
  public void disConnect() { 
    try { 
      isConnect = false; 
      // ֹͣ�߳� 
      tReceive.join(); 
    } catch (InterruptedException e) { 
      e.printStackTrace(); 
    } finally { 
      try { 
        if (dataOutputStream != null) { 
          dataOutputStream.close(); 
        } 
        if (socket != null) { 
          socket.close(); 
          socket = null; 
        } 
  
      } catch (IOException e) { 
        e.printStackTrace(); 
      } 
    } 
  } 
  
  /** 
   * �����˷�����Ϣ 
   * 
   * @author��tuzongxun 
   * @Title: sendMessage 
   * @param @param text 
   * @return void 
   * @date May 18, 2016 9:57:56 AM 
   * @throws 
   */
  private void sendMessage(String text) { 
    try { 
      dataOutputStream.writeUTF(name + ":" + text); 
      dataOutputStream.flush(); 
    } catch (IOException e1) { 
      e1.printStackTrace(); 
    } 
  } 
  
  /** 
   * ͼ�δ���������������س��¼� 
   * 
   * @author tuzongxun123 
   * 
   */
  private class TFLister implements ActionListener { 
  
    
    public void actionPerformed(ActionEvent e) { 
      String text = tfTxt.getText().trim(); 
      // �������������Ϣ 
      tfTxt.setText(""); 
      // �س��������ݵ������� 
      sendMessage(text); 
    } 
  
  } 
  
  private class ReceiveThread implements Runnable { 
  
   
    public void run() { 
      try { 
        while (isConnect) { 
          String message = dataInputStream.readUTF(); 
          System.out.println(message); 
          String txt = tarea.getText(); 
          if (txt != null && !"".equals(txt.trim())) { 
            message = tarea.getText() + "\n" + message; 
          } 
          tarea.setText(message); 
        } 
      } catch (IOException e) { 
        e.printStackTrace(); 
      } 
    } 
  
  } 
} 