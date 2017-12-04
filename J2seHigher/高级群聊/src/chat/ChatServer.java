
package chat;




import java.io.DataInputStream; 
import java.io.DataOutputStream; 
import java.io.EOFException; 
import java.io.IOException; 
import java.net.BindException; 
import java.net.ServerSocket; 
import java.net.Socket; 
import java.net.SocketException; 
import java.util.ArrayList; 
import java.util.List; 
  
/** 
 * javaʹ��socket��awt����Լ����̼߳�ʵ���������칦�ܷ���� �� 
 * ʵ�ַ���˰ѽ��յ��Ŀͻ�����Ϣת�����������ӵĿͻ��ˣ������ÿͻ��˶�ȡ����Щ��Ϣ����ʾ��������ʾ�����С� 
 * 
 * @author tuzongxun123 
 * 
 */
public class ChatServer { 
  
  public static void main(String[] args) { 
    new ChatServer().start(); 
  } 
  
  // �Ƿ�ɹ���������� 
  private boolean isStart = false; 
  // �����socket 
  private ServerSocket ss = null; 
  // �ͻ���socket 
  private Socket socket = null; 
  // ����ͻ��˼��� 
  List<Client> clients = new ArrayList<Client>(); 
  
  public void start() { 
    try { 
      // ���������� 
      ss = new ServerSocket(8912); 
    } catch (BindException e) { 
      System.out.println("�˿�����ʹ����"); 
      // �رճ��� 
      System.exit(0); 
    } catch (Exception e) { 
      e.printStackTrace(); 
    } 
  
    try { 
      isStart = true; 
      while (isStart) { 
        // �������� 
        socket = ss.accept(); 
        System.out.println("one client connect"); 
        // �����ͻ����߳� 
        Client client = new Client(socket); 
  
        new Thread(client).start(); 
        clients.add(client); 
      } 
    } catch (Exception e) { 
      e.printStackTrace(); 
    } finally { 
      // �رշ��� 
      try { 
        ss.close(); 
      } catch (IOException e) { 
        e.printStackTrace(); 
      } 
    } 
  
  } 
  
  /** 
   * �ͻ����߳� 
   * 
   * @author tuzongxun123 
   * 
   */
  private class Client implements Runnable { 
    // �ͻ���socket 
    private Socket socket = null; 
    // �ͻ��������� 
    private DataInputStream dataInputStream = null; 
    // �ͻ�������� 
    private DataOutputStream dataOutputStream = null; 
    private boolean isConnect = false; 
  
    public Client(Socket socket) { 
      this.socket = socket; 
      try { 
        isConnect = true; 
        // ��ȡ�ͻ��������� 
        dataInputStream = new DataInputStream(socket.getInputStream()); 
        // ��ȡ�ͻ�������� 
        dataOutputStream = new DataOutputStream( 
            socket.getOutputStream()); 
      } catch (IOException e) { 
        e.printStackTrace(); 
      } 
    } 
  
    /** 
     * ��ͻ���Ⱥ����ת�������� 
     * 
     * @author��tuzongxun 
     * @Title: sendMessageToClients 
     * @param @param message 
     * @return void 
     * @date May 18, 2016 11:28:10 AM 
     * @throws 
     */
    public void sendMessageToClients(String message) { 
      try { 
        dataOutputStream.writeUTF(message); 
      } catch (SocketException e) { 
  
      } catch (IOException e) { 
        e.printStackTrace(); 
      } 
    } 
  
    
    public void run() { 
      isConnect = true; 
      Client c = null; 
      try { 
        while (isConnect) { 
          // ��ȡ�ͻ��˴��ݵ����� 
          String message = dataInputStream.readUTF(); 
          System.out.println("�ͻ���˵��" + message); 
          for (int i = 0; i < clients.size(); i++) { 
            c = clients.get(i); 
  
            c.sendMessageToClients(message); 
          } 
  
        } 
      } catch (EOFException e) { 
        System.out.println("client closed!"); 
      } catch (SocketException e) { 
        if (c != null) { 
          clients.remove(c); 
        } 
        System.out.println("Client is Closed!!!!"); 
      } catch (Exception e) { 
        e.printStackTrace(); 
      } finally { 
        // �ر������Դ 
        try { 
          if (dataInputStream != null) { 
            dataInputStream.close(); 
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
  } 
  
} 