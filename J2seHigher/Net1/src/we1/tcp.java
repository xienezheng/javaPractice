package we1;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.Vector;

public class tcp {
	
	try{
		Vector<Double> v1=new Vector<Double>();
		Vector<Double> v2=new Vector<Double>();
		Vector<Double> v3=new Vector<Double>();
		Vector<Double> v4=new Vector<Double>();
            Socket q=new Socket("127.0.0.1",5432);
            String s2=a.getText();
            StringTokenizer tokens2=new StringTokenizer(s2);
            //ʹ��Ĭ�ϵķָ������ϣ��ո񡢻��С�Tab���ϻس����ָ���
            int w=tokens2.countTokens(),x;
            for(x=0;x<=w-1;x++){
              String temp2=tokens2.nextToken();//���ı���ȡ��һ������
              v3.add(Double.parseDouble(temp2));
            } 
            String s3=c.getText();
            StringTokenizer tokens3=new StringTokenizer(s3);
            //ʹ��Ĭ�ϵķָ������ϣ��ո񡢻��С�Tab���ϻس����ָ���
            int z=tokens3.countTokens(),l;
            for(l=0;l<=z-1;l++){
              String temp3=tokens3.nextToken();//���ı���ȡ��һ������
              v3.add(Double.parseDouble(temp3));
            } 
          	 String s=b.getText();
             StringTokenizer tokens=new StringTokenizer(s);
             //ʹ��Ĭ�ϵķָ������ϣ��ո񡢻��С�Tab���ϻس����ָ���
             int n=tokens.countTokens(),i;
             for(i=0;i<=n-1;i++){
               String temp=tokens.nextToken();//���ı���ȡ��һ������
               v1.add(Double.parseDouble(temp));
             } 
          	 String s1=d.getText();
             StringTokenizer tokens1=new StringTokenizer(s1);
             //ʹ��Ĭ�ϵķָ������ϣ��ո񡢻��С�Tab���ϻس����ָ���
             int t=tokens1.countTokens(),j;
             for(j=0;j<=t-1;j++){
               String temp1=tokens1.nextToken();//���ı���ȡ��һ������
               v2.add(Double.parseDouble(temp1));
             } 
             OutputStream   out =q.getOutputStream();	
             ObjectOutputStream dout= new ObjectOutputStream(out);
             dout.writeObject(v3);
               dout.writeObject(v1);
               dout.writeObject(v2);
              InputStream in=q.getInputStream();
              ObjectInputStream din= new ObjectInputStream(in);
                 double col = din.readDouble();
                  v4=(Vector)din.readObject();
           for(int v=0;v<v4.size();v++){
        	  int  result =v4.get(v).intValue();
            f.append(" "+result);
          if((v+1)%col==0){
        	  f.append("\r\n");
           }
           }  
               out.close();
               in.close();
               q.close();
		}catch (IOException ex)
		{
			System.out.println(ex);
		}catch (ClassNotFoundException ev)
		{
			System.out.println(ev);
		}

		 }
	if(cmd.equals("�˳�")){
		System.exit(0);
	}
	 

}
