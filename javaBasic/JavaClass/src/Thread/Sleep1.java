package Thread;

public class Sleep1 extends Thread{
	public void run()
	{
	int i;
	for(i=0;i<100;i++)
	{
		System.out.println("qwer");
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
