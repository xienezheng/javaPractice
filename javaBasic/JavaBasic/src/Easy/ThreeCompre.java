package Easy;


import java.util.Scanner;//java�������
 
public class ThreeCompre {
	public static void main(String args[])
	{
		
		Scanner cin=new Scanner(System.in);//�������
		int a=cin.nextInt();//scanner��һ���࣬cin�Ƕ���
		int b=cin.nextInt();//���Ƕ���ĳ�Ա����
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
