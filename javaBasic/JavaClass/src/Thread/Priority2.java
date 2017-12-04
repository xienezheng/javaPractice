package Thread;

public class Priority2 extends Thread{
	public void run()
	{
		int j;
		for(j=0;j<100;j++)
		{
		System.out.print("*");
		Thread.yield();//ÈÃ²½
		}
	}

}
