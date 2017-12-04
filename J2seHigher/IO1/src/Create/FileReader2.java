package Create;
import java.io.*;
public class FileReader2 {
public static void main(String args[])
{
	try
	{
	File f=new File("H:\\write.txt");
	FileReader fcin=new FileReader(f);
	String s=new String();
	s=fcin.readLine();
	
	System.out.println(s);
	
}catch(Exception e)
{
e.printStackTrace();
}
}
}
