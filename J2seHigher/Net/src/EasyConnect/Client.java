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
     list.add("����");  
     list.add("�Ϻ�");  
     list.add("���");  
     list.add("����");  
	try
	{
		Socket socket=new Socket("localhost",12358);
		 ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());  
	        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());  
	        //���ͻ��˵Ķ����������������������ȥ  
	        out.writeObject(city);  
	        out.flush();  
	        //��ȡ�������˷��صĶ���������  
	        City cityBack = (City) in.readObject();  
	        List backList = cityBack.getCityList();  
	        for (int i = 0; i < backList.size(); i++) {  
	            System.out.println("�ͻ��˵õ����س������ݣ�" + backList.get(i).toString());  
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
