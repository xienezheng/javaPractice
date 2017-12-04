package Socket;
import java.net.*;
import java.io.*;
public class try1 {
	public static void main(String args[])
	{
		try
		{
		Socket socket=new Socket("www.baidu.com",80);
		int port=socket.getPort();
		System.out.println(port);
		int LocalPort=socket.getLocalPort();
		System.out.println(LocalPort);
		InetAddress host=socket.getInetAddress();
		
		System.out.println(host);
InetAddress localhost=socket.getLocalAddress();
		InputStream is=socket.getInputStream();
		BufferedInputStream bis=new BufferedInputStream(is);
		bis.close();
		is.close();
		System.out.println(localhost);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
