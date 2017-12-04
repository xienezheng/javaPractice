package extend;

public class Son extends Father {
	String xueli;
	Son(String x,int y,String z)//子类需另写构造
	{	name=x;
	age=y;
		xueli=z;
			
	}
	public void display()//方法覆盖，是为重写与重载
	{

		System.out.println(name);
		System.out.println(age);
		System.out.println(xueli);
	}
	
}
