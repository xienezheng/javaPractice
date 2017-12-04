package Thread;

public class PriorityMamin {
	public static void main(String args[])
	{
		Priority1 a1=new Priority1();
		Priority2 a2=new Priority2();
		Thread t1=new Thread(a1);
		Thread t2=new Thread(a2);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);//”≈œ»º∂
		t1.start();
		t2.start();
	}

}
