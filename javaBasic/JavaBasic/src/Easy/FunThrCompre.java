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
		
		Scanner cin=new Scanner(System.in);//�������
		float a=cin.nextFloat();//scanner��һ���࣬cin�Ƕ���
		float b=cin.nextFloat();//���Ƕ���ĳ�Ա����
		float c=cin.nextFloat();
		comPre(a,b,c);
		
		
		
	}

}
