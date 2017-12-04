package ServerSocket;
import java.net.*;
import java.io.*;
public class Basic {
public static void main(String args[])
{ServerSocket  server=null;
	try
	{
		InetAddress host=InetAddress.getLocalHost();
	 server=new ServerSocket(12345,20,host);
	int port=server.getLocalPort();
	System.out.println(port);
	InetAddress host1=server.getInetAddress();
	System.out.println(host1);
	while(true)
	{
		Socket socket=server.accept();
		OutputStreamWriter osw=new OutputStreamWriter(socket.getOutputStream());
        osw.write("hello client");
        osw.close();
        socket.close();
	}
	}catch(Exception e)
	{
		e.printStackTrace();
	}finally
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
