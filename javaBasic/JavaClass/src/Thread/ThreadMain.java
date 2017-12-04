package Thread;

public class ThreadMain {
	public static void main(String args[])
	{
		ThreadBasic tr=new ThreadBasic();
		ThreadBasic1 tr1=new ThreadBasic1();
		Thread t=new Thread(tr);
		Thread t1=new Thread(tr1);
		t.start();
		t1.start();
		
		
	}

}
