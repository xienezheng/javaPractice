package extend;

public class Father {
	 String name;//变量必须为公有
 int age;
	Father(String x,int y)
	{
		name=x;//this要用
		age=y;
	}
	Father()
	{//需要父类的默认构造
		
	}
	public  void display()
	{
		System.out.println(name);
		System.out.println(age);
		
	}
}
