package objTry;
import java.io.*;
import java.net.*;
import java.util.List;

import ObjSocket.City;
public class Server {
public static void main(String args[])
{ServerSocket server=null;
String re[]=new String[5];
int age1;
String name1;

try
{
	 server=new ServerSocket(12345);
	System.out.println("����������"+server.getInetAddress()+server.getLocalPort());
	  Socket scoket = server.accept();  
      //�������ݵ��������������Ҫ��ObjectInputStream��ObjectOutputStream����  
      ObjectInputStream in = new ObjectInputStream(scoket.getInputStream());  
      ObjectOutputStream out = new ObjectOutputStream(scoket.getOutputStream());  
      //��ȡ�ͻ��˵Ķ���������  
      Student s3 = (Student) in.readObject();  
  re=s3.getRela();
  name1=s3.getName();
  System.out.println("�������˵õ��������ݣ�"+name1);
      for (int i = 0; i <5; i++) {  
          System.out.println("�������˵õ��������ݣ�" +re[i]);  
      }  
      in.close();  
      out.close();  
}catch(Exception e)
{
	e.printStackTrace();
}
}
}
