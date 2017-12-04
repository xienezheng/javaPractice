package try1;

public class BasicDiv {
	private String name;
	 int age;
	BasicDiv(String x,int y)
	{
		name=x;
		age=y;
	}
	public void setAge(int x)
	{
		age=x;
		
	}
	public void  display()
	{
		System.out.println(name);
		System.out.println(age);
		
	}
	public int getAge()
	{
		return age;
	}

}
