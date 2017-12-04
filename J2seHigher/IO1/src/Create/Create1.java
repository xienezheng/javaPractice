package Create;
import java.io.*;
public class Create1 {
	public static void main(String args[])
	{
	File f1=new File("H:\\");
	File f2=new File("H:\\create1.txt");
	if(f1.isDirectory())
	{
		System.out.println("f1对象表示的是目录");
	}
	 if(f1.isFile())
	{
		System.out.println("f1对象表示的是文件");
	}
	if(f2.isDirectory())
	{
		System.out.println("f2对象是目录");
	}
	 if(f2.isFile())
	{
		System.out.println("f2对象是文件");
	}
	 System.out.println(f1.listFiles());
	
}
}