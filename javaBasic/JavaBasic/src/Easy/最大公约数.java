package Easy;
import java.util.Scanner;
public class 最大公约数 {
	public static void main(String args[])
	{
		int m,n,i=0;
		Scanner cin=new Scanner(System.in);
		System.out.println("Please enter the num m and n\n");
		m=cin.nextInt();
		n=cin.nextInt();
		if(m>=n)
		{
		for(i=n;i>=1;i--)
		{
			if(m%i==0&&n%i==0)
			{
				System.out.println(i);
				break;
			}
			
		}
			
		}
		else
		{
			for(i=m;i>=1;i--)
			{
				if(m%i==0&&n%i==0)
				{
					System.out.println(i);
					break;
				}
				
		}
	}

}
}
