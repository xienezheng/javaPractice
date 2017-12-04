package IP;
import java.net.*;
public class IpType {
public static void main(String args[])
{
	try
	{
		InetAddress local=InetAddress.getLocalHost();
		byte[]addr=local.getAddress();//byte数组，int数组是4个
		//byte,而byte数组存一个byte，二进八位同十进，溢出会负
	if(addr.length==4)
	{
		System.out.println("IPV4");
	}
	int first=addr[0];
	if(first<0)
	{
		first=first+256;
	}
	
	}catch(Exception e)
	{
		
	}
	
}
}
