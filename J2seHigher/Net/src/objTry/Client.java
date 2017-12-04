package objTry;
import java.net.*;
import java.io.*;
import java.util.Scanner;
public class Client {
public static void main(String args[])
{
	String x;
	int y;
	String z[]=new String[5];
	Scanner in1=new Scanner(System.in);
	System.out.println("请输入姓名");
	x=in1.next();
	System.out.println("请输入年龄");
	y=in1.nextInt();
	System.out.println("请输入亲戚");
	for(int i=0;i<5;i++)
	{
		z[i]=in1.next();
	}
	Student s=new Student(x,y,z);
	try
	{
	Socket socket=new Socket("localhost",12345);
	   ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());  
       ObjectInputStream in = new ObjectInputStream(socket.getInputStream());  
       //将客户端的对象数据流输出到服务器端去  
       out.writeObject(s);  
       out.flush();  
       out.close();  
       in.close();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
