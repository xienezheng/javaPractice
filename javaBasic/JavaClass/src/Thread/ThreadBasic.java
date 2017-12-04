package Thread;
import java.util.Date;
public class ThreadBasic extends Thread{
	public void run()
	{
	int i;
	Date a=new Date();
	for(i=0;i<10;i++)
	{
		System.out.println("wanglinai"+a);
		try
		{
			Thread.sleep(10);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	}
	

}
