package ObjSocket;

import java.io.ObjectInputStream;  
import java.io.ObjectOutputStream;  
import java.net.InetAddress;  
import java.net.Socket;  
import java.util.ArrayList;  
import java.util.List;  
  
public class Client {  
  
    public static void main(String[] arg) throws Exception {  
        //封装一个对象实例  
        City city = new City();  
        List list = new ArrayList();  
        list.add("北京");  
        list.add("上海");  
        list.add("天津");  
        list.add("重庆");  
        city.setCityList(list);  
        //连接到服务器端  
        Socket socketConnection = new Socket(InetAddress.getLocalHost(), 6688);  
        //使用ObjectOutputStream和ObjectInputStream进行对象数据传输  
        ObjectOutputStream out = new ObjectOutputStream(socketConnection.getOutputStream());  
        ObjectInputStream in = new ObjectInputStream(socketConnection.getInputStream());  
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
    }  
}  