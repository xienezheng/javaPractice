package ObjSocket;

import java.io.ObjectInputStream;  
import java.io.ObjectOutputStream;  
import java.net.InetAddress;  
import java.net.Socket;  
import java.util.ArrayList;  
import java.util.List;  
  
public class Client {  
  
    public static void main(String[] arg) throws Exception {  
        //��װһ������ʵ��  
        City city = new City();  
        List list = new ArrayList();  
        list.add("����");  
        list.add("�Ϻ�");  
        list.add("���");  
        list.add("����");  
        city.setCityList(list);  
        //���ӵ���������  
        Socket socketConnection = new Socket(InetAddress.getLocalHost(), 6688);  
        //ʹ��ObjectOutputStream��ObjectInputStream���ж������ݴ���  
        ObjectOutputStream out = new ObjectOutputStream(socketConnection.getOutputStream());  
        ObjectInputStream in = new ObjectInputStream(socketConnection.getInputStream());  
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
    }  
}  