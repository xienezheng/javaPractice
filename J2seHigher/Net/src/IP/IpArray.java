package IP;
import java.net.*;
public class IpArray {
public static void main(String args[])
{
	try
	{
		InetAddress[] addr=InetAddress.getAllByName("www.baidu.com");
		for(int i=0;i<addr.length;i++)
		{
			System.out.println(addr[i]);
		}
	}catch(Exception e)
	{
		
	}
}
}
