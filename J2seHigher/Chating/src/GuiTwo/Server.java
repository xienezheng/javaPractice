package GuiTwo;
import java.io.*;
import java.net.*;
public class Server {
public static void main(String args[])
{
	ServerSocket server=null;
	try
	{
		server=new ServerSocket(12347);
		System.out.println("����������");
		while(true)
		{
			Socket socket=server.accept();
			System.out.println("�ͻ�������");
			BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));
			BufferedReader is=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter os=new PrintWriter(socket.getOutputStream());
		String line;
		for(int i=0;i<100;i++)
		{
			line=is.readLine();
			System.out.println("�յ���"+line);
			os.println(sin.readLine());
			os.flush();
			
		}
		is.close();
		os.close();
		socket.close();
		}
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		try
		{
		server.close();	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
}
