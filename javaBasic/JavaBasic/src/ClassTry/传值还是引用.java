
public class 传值还是引用 {
	public static void add(int a)
	{
		a=a+1;
	}
	public static void main(String args[])
	{
		int a=1;
		add(a);
		System.out.println(a);
	}

}
