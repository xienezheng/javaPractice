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
	System.out.println("����������");
	x=in1.next();
	System.out.println("����������");
	y=in1.nextInt();
	System.out.println("����������");
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
       //���ͻ��˵Ķ����������������������ȥ  
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
