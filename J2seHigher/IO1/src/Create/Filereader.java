package Create;
import java.io.*;
import java.util.Scanner;
public class Filereader {
	public static void main(String args[])
	{//文件会覆盖，所以应该一次性存入
		File f=new File("H:\\write.txt");
		Scanner cin=new Scanner(System.in);
		String s=new String(" dd");
		
		try
		{
			if(!f.exists())
			{
				f.createNewFile();
			}
			FileWriter fout=new FileWriter(f);
			fout.write(s);
			fout.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	}


