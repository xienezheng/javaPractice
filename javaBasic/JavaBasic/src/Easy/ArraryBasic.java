package Easy;
import java.util.Scanner;
public class ArraryBasic {
	public static void theMax(int a[])//ΪʲôҪ��static
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
		System.out.println("�����Ϊ"+flag);
		
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
		theMax(a);//ͬc++
		change(a);
		display(a);//����Ϊ���ã��ɸ�ֵ
		
	}

}
