package ManyClient;
import java.io.*;
import java.net.*;
public class Server {
public static void main(String args[])
{ServerSocket server=null;

try
{
	server=new ServerSocket(56789);
	System.out.println("����������"+server.getInetAddress().getHostAddress()+":"+server.getLocalPort());
while(true)
{
	Socket socket=server.accept();
	System.out.println("�ͻ�������"+socket.getInetAddress().getHostAddress()+socket.getLocalPort());
	new ServerThread(socket).start();
}

}
catch(Exception e)
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