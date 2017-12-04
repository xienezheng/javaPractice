package Thread;
import java.util.Date;
public class ThreadBasic1 implements Runnable{//Run¥Û–¥
	public void run()
	{
		int i;
		Date b=new Date();
		for(i=0;i<10;i++)
	{
			System.out.println("xienezheng"+b.getSeconds());
			
			try
			{
				Thread.sleep(20);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
	}

}
}
