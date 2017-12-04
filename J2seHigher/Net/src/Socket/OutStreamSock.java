package Socket;
import java.io.*;
import java.net.*;
public class OutStreamSock {
public static void main(String args[])
{ Socket socket1=null;
	try
{
	socket1=new Socket("localhost",12345);
	OutputStream os=socket1.getOutputStream();
	OutputStreamWriter osw=new OutputStreamWriter(os);
	osw.write("hello");
	osw.close();
	os.close();
}catch(Exception e)
{
	e.printStackTrace();
}finally
{
	if(socket1!=null)
	{
	try
	{
		socket1.close();
	}catch(Exception e)
	{
	e.printStackTrace();	
	}
	}
}
}
}
