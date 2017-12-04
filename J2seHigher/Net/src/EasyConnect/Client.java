package EasyConnect;
import java.net.*;
import java.util.*;
import java.io.*;
import java.lang.Integer;
public class Client {
public static void main(String args[])
{
	 City city = new City();  
     List list = new ArrayList();  
     list.add("北京");  
     list.add("上海");  
     list.add("天津");  
     list.add("重庆");  
	try
	{
		Socket socket=new Socket("localhost",12358);
		 ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());  
	        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());  
	        //将客户端的对象数据流输出到服务器端去  
	        out.writeObject(city);  
	        out.flush();  
	        //读取服务器端返回的对象数据流  
	        City cityBack = (City) in.readObject();  
	        List backList = cityBack.getCityList();  
	        for (int i = 0; i < backList.size(); i++) {  
	            System.out.println("客户端得到返回城市数据：" + backList.get(i).toString());  
	        }
	        out.close();
	        in.close();
	        socket.close();



	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
