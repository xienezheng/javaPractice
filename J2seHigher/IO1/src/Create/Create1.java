package Create;
import java.io.*;
public class Create1 {
	public static void main(String args[])
	{
	File f1=new File("H:\\");
	File f2=new File("H:\\create1.txt");
	if(f1.isDirectory())
	{
		System.out.println("f1�����ʾ����Ŀ¼");
	}
	 if(f1.isFile())
	{
		System.out.println("f1�����ʾ�����ļ�");
	}
	if(f2.isDirectory())
	{
		System.out.println("f2������Ŀ¼");
	}
	 if(f2.isFile())
	{
		System.out.println("f2�������ļ�");
	}
	 System.out.println(f1.listFiles());
	
}
}