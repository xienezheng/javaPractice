package Thread;

public class JoinMain {
	public static void main(String args[])
	{
		Join a=new Join();
		Thread t=new Thread(a);
		int i;
		for(i=0;i<100;i++)
		{
			if(i>=10)
			{
				try
				{
					t.join();
				}catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			
			System.out.print("o");
		}
	}

}
