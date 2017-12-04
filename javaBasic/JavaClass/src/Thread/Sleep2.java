package Thread;

public class Sleep2 implements Runnable {
	public void run()
	{
			int i;
			for(i=0;i<100;i++)
			{
				System.out.println("asdf");
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
