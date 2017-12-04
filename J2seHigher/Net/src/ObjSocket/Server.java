package ObjSocket;

import java.io.ObjectInputStream;  
import java.io.ObjectOutputStream;  
import java.net.ServerSocket;  
import java.net.Socket;  
import java.util.ArrayList;  
import java.util.List;  
  
public class Server {  
  
    public static void main(String[] arg) throws Exception {  
        //创建服务器端的Socket，并监听端口6688  
        ServerSocket socketConnection = new ServerSocket(6688);  
        System.out.println("服务器已经开启，等待连接。");  
        //接收客户端连接，并返回一个socket对象  
        Socket scoket = socketConnection.accept();  
        //对象数据的输入与输出，需要用ObjectInputStream和ObjectOutputStream进行  
        ObjectInputStream in = new ObjectInputStream(scoket.getInputStream());  
        ObjectOutputStream out = new ObjectOutputStream(scoket.getOutputStream());  
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
}  
