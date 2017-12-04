package EasyConnect;
import java.io.*;
import java.util.*;
import java.net.*;
public class Server {
public static void main(String args[])
{
	ServerSocket server=null;
	try
	{
		server=new ServerSocket(12358);
		System.out.println("服务器启动"+server.getInetAddress().getHostAddress()+":"+server.getLocalPort());
		while(true)
		{
			Socket socket=server.accept();
			System.out.println("客户端连接"+socket.getInetAddress().getHostAddress()+":"+socket.getPort());
			  //对象数据的输入与输出，需要用ObjectInputStream和ObjectOutputStream进行  
	        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());  
	        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());  
	        //读取客户端的对象数据流  
	        City city = (City) in.readObject();  
	        List cityList = city.getCityList();  
	        for (int i = 0; i < cityList.size(); i++) {  
	            System.out.println("服务器端得到城市数据：" + cityList.get(i).toString());  
	        }  
	        //返回给客户端的对象  
	        City cityBack = new City();  
	        List list = new ArrayList();  
	        list.add("广州");  
	        list.add("深圳");  
	        cityBack.setCityList(list);  
	        out.writeObject(cityBack);  
	        out.flush();  
	        in.close();  
	        out.close();  
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
