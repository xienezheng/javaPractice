package Thread;

public class Priority1 implements Runnable {
	public void run()
	{
		int i;
		for(i=0;i<100;i++)
		{
		System.out.print("$");
		Thread.yield();
		}
	}

}
