package Easy;


import java.util.Scanner;//java的输入包
 
public class ThreeCompre {
	public static void main(String args[])
	{
		
		Scanner cin=new Scanner(System.in);//输入语句
		int a=cin.nextInt();//scanner是一个类，cin是对象
		int b=cin.nextInt();//这是对象的成员函数
		int c=cin.nextInt();
		/*if(a>=b&&a>=c)
		{
			System.out.println(a);
		
		}*/
		if(b>=a&&b>=c)
		{
			System.out.println(b);
		
		}
		if(c>=b&&c>=a)
		{
			System.out.println(c);
		
		}
		
		
	}

}
