package Easy;
import java.util.Scanner;
public class ½×³ËºÍ {
	public static int jieCheng(int m)
	{
		int i,sum=1;
		for(i=m;i>=1;i--)
		{
			sum=sum*i;
		}
		return(sum);
	}
	public static void main(String args[])
	{
		int i,m,sum=0;
		System.out.println("Please enter the num");
		Scanner cin=new Scanner(System.in);
		m=cin.nextInt();
		for(i=m;i>=1;i--)
		{
			sum=sum+jieCheng(i);
		}
		System.out.println(sum);
	}

}
