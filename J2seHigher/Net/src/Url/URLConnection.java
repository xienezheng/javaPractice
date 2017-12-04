package Url;
import java.net.*;
public class URLConnection {
public static void main(String args[])
{
	try
	{
		URL url=new URL("http://www.cugxuan.cn/index.html");
		URLConnection conn= url.openConnection();
		conn.connect();
	}catch(MalformedURLException e)
	{
		e.printStackTrace();
	}
	
}
}
