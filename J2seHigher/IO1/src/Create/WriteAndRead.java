package Create;
import java.io.*;
public class WriteAndRead {
public static void main(String args[])throws IOException
{
	File f1=new File("H:\\create1.txt");
	File f2=new File("H:\\write.txt");
	FileInputStream fcin=new FileInputStream(f1);
	FileOutputStream fcout=new FileOutputStream(f2);
	byte b[]=new byte[(int)f1.length()];
	fcin.read(b);
	for(int i=0;i<f1.length();i++)
	{
		
		System.out.println((char)b[i]);
	}
}
}
