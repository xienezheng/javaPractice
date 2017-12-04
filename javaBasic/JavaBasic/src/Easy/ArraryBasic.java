package Easy;
import java.util.Scanner;
public class ArraryBasic {
	public static void theMax(int a[])//为什么要加static
	{
		int i;
		int flag=0;
		for(i=0;i<9;i++)
		{
			if(flag<=a[i])
			{
				flag=a[i];
			}
		}
		System.out.println("最大数为"+flag);
		
	}
	public static void change(int a[])
	{
		int i;
		for(i=0;i<10;i++)
		{
			a[i]=a[i]+1;
		}
		
	}
	public static void display(int a[])
	{int i;
		for(i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static void main(String args[])
	{
		Scanner cin=new Scanner(System.in);
		int a[]=new int[10];
		int i;
		for(i=0;i<10;i++)
		{
			a[i]=cin.nextInt();
		}
		theMax(a);//同c++
		change(a);
		display(a);//传递为引用，可改值
		
	}

}
