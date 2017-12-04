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
	System.out.println("服务器启动"+server.getInetAddress()+server.getLocalPort());
	  Socket scoket = server.accept();  
      //对象数据的输入与输出，需要用ObjectInputStream和ObjectOutputStream进行  
      ObjectInputStream in = new ObjectInputStream(scoket.getInputStream());  
      ObjectOutputStream out = new ObjectOutputStream(scoket.getOutputStream());  
      //读取客户端的对象数据流  
      Student s3 = (Student) in.readObject();  
  re=s3.getRela();
  name1=s3.getName();
  System.out.println("服务器端得到姓名数据："+name1);
      for (int i = 0; i <5; i++) {  
          System.out.println("服务器端得到亲戚数据：" +re[i]);  
      }  
      in.close();  
      out.close();  
}catch(Exception e)
{
	e.printStackTrace();
}
}
}
