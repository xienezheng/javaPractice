package IP;
import java.net.*;
public class IpType {
public static void main(String args[])
{
	try
	{
		InetAddress local=InetAddress.getLocalHost();
		byte[]addr=local.getAddress();//byte���飬int������4��
		//byte,��byte�����һ��byte��������λͬʮ��������Ḻ
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
