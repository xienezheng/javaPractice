package Create;
import java.io.*;
import java.util.Scanner;
public class Write {
public static void main(String args[])throws IOException
{
	File f1=new File("H:\\write.txt");
	FileOutputStream fcout=new FileOutputStream(f1);
	String s=new String();
	Scanner cin=new Scanner(System.in);
	for(int i='a';i<'z';i++)
	{
		
		fcout.write(i);
	}
	s=cin.nextLine();
	System.out.print(s);
	
}
}
