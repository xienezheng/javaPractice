package IP;
import java.net.*;//���ݿ�����������������쳣������
public class try1 {
public static void main(String args[])
{
	try
	{
	InetAddress local=InetAddress.getLocalHost();
	InetAddress local1=InetAddress.getByName("www.baidu.com");
	System.out.println(local1);
	
	System.out.println(local1.getHostAddress());
	System.out.println(local1.getHostName());
	}catch(UnknownHostException e)
	{
		
	}
}
}
