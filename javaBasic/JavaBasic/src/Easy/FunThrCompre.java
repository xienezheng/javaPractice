package Easy;

import java.util.Scanner;

public class FunThrCompre {
	public static void comPre(float a,float b,float c)
	{
		if(a>=b&&a>=c)
		{
			System.out.println(a);
		
		}
		if(b>=a&&b>=c)
		{
			System.out.println(b);
		
		}
		if(c>=b&&c>=a)
		{
			System.out.println(c);
		
		}
	} 
	
	public static void main(String args[])
	{
		
		Scanner cin=new Scanner(System.in);//输入语句
		float a=cin.nextFloat();//scanner是一个类，cin是对象
		float b=cin.nextFloat();//这是对象的成员函数
		float c=cin.nextFloat();
		comPre(a,b,c);
		
		
		
	}

}
