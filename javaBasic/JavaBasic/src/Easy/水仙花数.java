package Easy;
import java.lang.*;
public class Ë®ÏÉ»¨Êý {
	public static void main(String args[])
	{
		int i,j,m;
		int bai,shi,ge;
		double temp;
		for(i=100;i<1000;i++)
		{
			bai=i/100;
			shi=(i-bai*100)/10;
			ge=i-bai*100-shi*10;
			temp=Math.pow(bai, 3.0)+Math.pow(shi, 3.0)+Math.pow(ge,3.0);
			if(temp==i)
			{
				
				System.out.println(i);
			}
			
		}
	}
	

}
