package one;
import java.util.Scanner;
public class main {
	public static double maxArea(Circle c,Rectangle r1)
	{
		if(c.Area()>r1.Area())
		{
			return (c.Area());
		}
		else
		{
			return(r1.Area());
		}
			 
	}
	public static double maxArea(Circle c)
	{
		
			return (c.Area());
		
		
			 
	}
	public static double maxArea(Circle c,Rectangle r1,Rectangle r2)
	{
		
			if(c.Area()>r2.Area()&&c.Area()>r1.Area())
			{
				return (c.Area());
			}
			if(c.Area()<r2.Area()&&r2.Area()>r1.Area())
			{
				return(r2.Area());
			}
			else
			{
				return (r1.Area());
			}
			
				 
		}
	
	public static void main(String args[])
	{
		Scanner cin=new Scanner(System.in);
		Circle c=new Circle();
		System.out.println("请输入圆形c的宽");
		c.r=cin.nextDouble();

		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		System.out.println("请输入矩形r1的宽");
		r1.width=cin.nextDouble();
		System.out.println("请输入矩形r1的高");
		r1.height=cin.nextDouble();
		System.out.println("请输入矩形r2的宽");
		r2.width=cin.nextDouble();
		System.out.println("请输入矩形r2的高");
		r2.height=cin.nextDouble();
		System.out.println("Max area of c and r1 is"+maxArea(c,r1));
		System.out.println("Max area of c and r2 is"+maxArea(c,r2));
	System.out.println("Max area of c and r1 and r2 is"+maxArea(c,r1,r2));
	System.out.println("Max area of c is"+maxArea(c));
	
	}
}
