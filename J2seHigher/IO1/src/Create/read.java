package Create;
import java.io.*;
public class read {
	public static void main(String args[])throws Exception
	{//加异常处理//关闭文件
		File f1=new File("H:\\create1.txt");
		FileInputStream fis=new FileInputStream(f1);
		char ch='0';
		char b[]=new char[(int)f1.length()];
		for(int i=0;i<f1.length();i++)
		{
			ch=(char)fis.read();
		b[i]=ch;
		 System.out.println(b[i]);
		}
		fis.close();
	}

}
