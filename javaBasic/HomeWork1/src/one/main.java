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
		System.out.println("������Բ��c�Ŀ�");
		c.r=cin.nextDouble();

		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		System.out.println("���������r1�Ŀ�");
		r1.width=cin.nextDouble();
		System.out.println("���������r1�ĸ�");
		r1.height=cin.nextDouble();
		System.out.println("���������r2�Ŀ�");
		r2.width=cin.nextDouble();
		System.out.println("���������r2�ĸ�");
		r2.height=cin.nextDouble();
		System.out.println("Max area of c and r1 is"+maxArea(c,r1));
		System.out.println("Max area of c and r2 is"+maxArea(c,r2));
	System.out.println("Max area of c and r1 and r2 is"+maxArea(c,r1,r2));
	System.out.println("Max area of c is"+maxArea(c));
	
	}
}
