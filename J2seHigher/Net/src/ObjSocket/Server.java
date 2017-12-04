package ObjSocket;

import java.io.ObjectInputStream;  
import java.io.ObjectOutputStream;  
import java.net.ServerSocket;  
import java.net.Socket;  
import java.util.ArrayList;  
import java.util.List;  
  
public class Server {  
  
    public static void main(String[] arg) throws Exception {  
        //�����������˵�Socket���������˿�6688  
        ServerSocket socketConnection = new ServerSocket(6688);  
        System.out.println("�������Ѿ��������ȴ����ӡ�");  
        //���տͻ������ӣ�������һ��socket����  
        Socket scoket = socketConnection.accept();  
        //�������ݵ��������������Ҫ��ObjectInputStream��ObjectOutputStream����  
        ObjectInputStream in = new ObjectInputStream(scoket.getInputStream());  
        ObjectOutputStream out = new ObjectOutputStream(scoket.getOutputStream());  
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
}  
