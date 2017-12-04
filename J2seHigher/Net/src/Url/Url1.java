package Url;
//网络包
import java.net.*;

public class Url1 {
	public static void main(String args[])
	{
		try//try里边可用
		{
			URL url1=new URL("http://news.sohu.com/20080729/n258439735.shtml");
			URL url2=new URL("http://www.cugxuan.cn/index.html");
			URL url3=new URL("http","www.baidu.com",81,"/index.html");
			System.out.println(url2.getAuthority());
			System.out.println(url2.getDefaultPort());
			System.out.println(url2.getFile());
			System.out.println(url2.getHost());
			System.out.println(url2.getPath());
			System.out.println(url2.getPort());
			System.out.println(url2.getProtocol());
			System.out.println(url2.getQuery());
			System.out.println(url2.getRef());
		}catch(MalformedURLException e)
		{
			e.printStackTrace();
		}
		
	

	}
}
