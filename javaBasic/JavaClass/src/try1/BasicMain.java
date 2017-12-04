package try1;

public class BasicMain {
	public static void main(String args[])
	{
		BasicDiv aa=new BasicDiv("s",5);
		aa.age=19;//私有不可直接访问
		
		aa.display();
		System.out.println(aa.getAge());
	}

}
