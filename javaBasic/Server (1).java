package Applet;
import java.io.*;
import java.util.*;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {
public static void main(String args[]){
	ServerSocket s=null;
	int k,i,j,x;
	try { 
	  s= new ServerSocket(5432);
}catch (IOException e){
	System.out.println(e);
	System.exit(1);
}
	while (true){
		try{
		  Socket cs=s.accept();
		  Vector<Double>a=new Vector<Double>();
		  Vector<Double>b=new Vector<Double>();
		  Vector<Double>c=new Vector<Double>();
		  Vector<Double>d=new Vector<Double>();
		 InputStream in=cs.getInputStream();
		    ObjectInputStream  din= new ObjectInputStream(in);
		    c=(Vector)din.readObject();
		     a=(Vector)din.readObject();
		     b=(Vector)din.readObject();
		      int width=c.get(0).intValue(); //width
		     int lenth=c.get(1).intValue(); //length
		     int width1=c.get(2).intValue(); //width
		     int lenth1=c.get(3).intValue(); //length
		 	System.out.print(width);
		 	System.out.print(lenth);
		 	 double [][] C1;
		 	 C1=new double[width][lenth1];
		     for(i=0;i<width;i++)
		     {
		    	 for(j=0;j<lenth1;j++)
		    	 {
		    		 for(x=0;x<lenth;x++)
		    		 C1[i][j] +=a.get(i*lenth+x)*b.get(x*lenth1+j); 
		    	 }
		     }
		   OutputStream out=cs.getOutputStream();
		   ObjectOutputStream dout= new ObjectOutputStream(out);
		   for(i=0;i<width;i++)
		     {
			   for(j=0;j<lenth1;j++){
				  double temp=C1[i][j];
				   d.add(temp);
			   }
		     }
		   dout.writeDouble(lenth1);
		   dout.writeObject(d);
			in.close();
			out.close();
			cs.close();
		
	}catch(IOException e){
		System.out.print(e);
	}catch(ClassNotFoundException ex){
		System.out.print(ex);
	}

	}
}}
