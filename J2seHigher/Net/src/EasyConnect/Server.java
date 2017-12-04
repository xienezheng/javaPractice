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
		System.out.println("����������"+server.getInetAddress().getHostAddress()+":"+server.getLocalPort());
		while(true)
		{
			Socket socket=server.accept();
			System.out.println("�ͻ�������"+socket.getInetAddress().getHostAddress()+":"+socket.getPort());
			  //�������ݵ��������������Ҫ��ObjectInputStream��ObjectOutputStream����  
	        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());  
	        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());  
	        //��ȡ�ͻ��˵Ķ���������  
	        City city = (City) in.readObject();  
	        List cityList = city.getCityList();  
	        for (int i = 0; i < cityList.size(); i++) {  
	            System.out.println("�������˵õ��������ݣ�" + cityList.get(i).toString());  
	        }  
	        //���ظ��ͻ��˵Ķ���  
	        City cityBack = new City();  
	        List list = new ArrayList();  
	        list.add("����");  
	        list.add("����");  
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
