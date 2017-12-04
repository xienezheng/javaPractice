
package Thread;

public class SleepMain {
	public static void main(String args[])
	{
	Sleep1 a=new Sleep1();
	Sleep2 b=new Sleep2();
	Thread t1=new Thread(a);
	Thread t2=new Thread(b);
	t1.setName("线程1");
	t2.setName("线程2");
	t1.start();
	t2.start();
	}
}
