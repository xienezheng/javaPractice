package Applet;
import java.net.Socket;
import java.io.*;
import java.net.Socket;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
//import java.io.DataOutputStream;
//import java.io.IOException;
import javax.swing.*;
public class SwingApplet  {
	public static void main(String[] args)throws IOException{
	JFrame f=new JFrame("Simple swing application");
		Container contentPane=f.getContentPane();
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(0,1));
		final JLabel  r1=new JLabel("欢迎进入矩阵运算界面");
		r1.setBounds(10, 10, 10, 10);
		r1.setFont(new Font("黑体", Font.BOLD, 20));
		r1.setForeground(Color.red);
		r1.setHorizontalAlignment(SwingConstants.CENTER);
		p1.add(r1);
		p1.setPreferredSize(new Dimension(100, 100));
		JPanel p2=new JPanel();
		GridLayout layout = new GridLayout(0,2); 
		p2.setLayout(layout);
		JButton button1=new JButton("计算 ");
		JButton button2=new JButton("退出");
		JTextArea sm1=new JTextArea();
		JTextArea sm2=new JTextArea();
		//final JLabel lable1=new JLabel("矩阵输入");
		final JLabel lable2=new JLabel("矩阵1输入行列");
		final JLabel lable3=new JLabel("矩阵2输入行列");
		final JLabel lable6=new JLabel("矩阵1输入");
		final JLabel lable7=new JLabel("矩阵2输入");
		final JLabel lable8=new JLabel("矩阵1*矩阵2=");
		JTextArea sm3=new JTextArea();
		JTextArea sm4=new JTextArea();
		JTextArea sm5=new JTextArea();
		f.setBackground(Color.gray);
		p2.add(lable2);
		p2.add(sm1);
		p2.add(lable6);
		p2.add(sm2);
		p2.add(lable3);
		p2.add(sm3);
		p2.add(lable7);
		p2.add(sm4);
		p2.add(lable8);
		p2.add(sm5);
		p2.setPreferredSize(new Dimension(200, 200));
		JPanel p3=new JPanel();
		p3.setLayout(new GridLayout(0,2));
		p3.add(button1);
		p3.add(button2);
		p3.setPreferredSize(new Dimension(50, 50));
		contentPane.add(p1,BorderLayout.NORTH);
		contentPane.add(p2,BorderLayout.CENTER);
		contentPane.add(p3,BorderLayout.SOUTH);
		Calelistener a= new Calelistener(sm1,sm2,sm3,sm4,sm5);
		button1.addActionListener(a);
		button2.addActionListener(a);
		f.setTitle("矩阵运算");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}}
class Calelistener implements ActionListener{
      private  JTextArea a, b, c,d,f;
	public Calelistener(JTextArea a,JTextArea b,JTextArea c,JTextArea d,JTextArea f){
    	  this.a=a;
    	  this.b=b;
    	  this.c=c;
    	  this.d=d;
    	  this.f=f;
      }
	 public void actionPerformed(ActionEvent e){
		 String cmd=e.getActionCommand();
		 if(cmd.equals("计算")){
		try{
		Vector<Double> v1=new Vector<Double>();
		Vector<Double> v2=new Vector<Double>();
		Vector<Double> v3=new Vector<Double>();
		Vector<Double> v4=new Vector<Double>();
            Socket q=new Socket("127.0.0.1",5432);
            String s2=a.getText();
            StringTokenizer tokens2=new StringTokenizer(s2);
            //使用默认的分隔符集合：空格、换行、Tab符合回车作分隔符
            int w=tokens2.countTokens(),x;
            for(x=0;x<=w-1;x++){
              String temp2=tokens2.nextToken();//从文本区取下一个数据
              v3.add(Double.parseDouble(temp2));
            } 
            String s3=c.getText();
            StringTokenizer tokens3=new StringTokenizer(s3);
            //使用默认的分隔符集合：空格、换行、Tab符合回车作分隔符
            int z=tokens3.countTokens(),l;
            for(l=0;l<=z-1;l++){
              String temp3=tokens3.nextToken();//从文本区取下一个数据
              v3.add(Double.parseDouble(temp3));
            } 
          	 String s=b.getText();
             StringTokenizer tokens=new StringTokenizer(s);
             //使用默认的分隔符集合：空格、换行、Tab符合回车作分隔符
             int n=tokens.countTokens(),i;
             for(i=0;i<=n-1;i++){
               String temp=tokens.nextToken();//从文本区取下一个数据
               v1.add(Double.parseDouble(temp));
             } 
          	 String s1=d.getText();
             StringTokenizer tokens1=new StringTokenizer(s1);
             //使用默认的分隔符集合：空格、换行、Tab符合回车作分隔符
             int t=tokens1.countTokens(),j;
             for(j=0;j<=t-1;j++){
               String temp1=tokens1.nextToken();//从文本区取下一个数据
               v2.add(Double.parseDouble(temp1));
             } 
             OutputStream   out =q.getOutputStream();	
             ObjectOutputStream dout= new ObjectOutputStream(out);
             dout.writeObject(v3);
               dout.writeObject(v1);
               dout.writeObject(v2);
              InputStream in=q.getInputStream();
              ObjectInputStream din= new ObjectInputStream(in);
                 double col = din.readDouble();
                  v4=(Vector)din.readObject();
           for(int v=0;v<v4.size();v++){
        	  int  result =v4.get(v).intValue();
            f.append(" "+result);
          if((v+1)%col==0){
        	  f.append("\r\n");
           }
           }  
               out.close();
               in.close();
               q.close();
		}catch (IOException ex)
		{
			System.out.println(ex);
		}catch (ClassNotFoundException ev)
		{
			System.out.println(ev);
		}

		 }
	if(cmd.equals("退出")){
		System.exit(0);
	}
	 
	 }  
}
