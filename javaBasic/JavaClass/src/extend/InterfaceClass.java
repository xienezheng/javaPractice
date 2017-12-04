package extend;

public class InterfaceClass implements interface1{
	public void getName()
	{
		System.out.println("ddd");
	}
	public void getAge()
	{
		System.out.println("uuu");
	}
	public static void main(String args[])
	{
		InterfaceClass e=new InterfaceClass();
		e.getName();
	}

}
