package Create;
import java.io.*;
import java.util.Scanner;
public class Filereader {
	public static void main(String args[])
	{//�ļ��Ḳ�ǣ�����Ӧ��һ���Դ���
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


