package servlet1;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Sum{
	

	public static int add(int n)
	{
		int cnt=0;
		for(int i=0;i<=n;i++)
		{
			cnt=cnt+i;
			
		}
		return cnt;
	}
public static int display(int n)
{
	int cnt=1;
	for(int i=1;i<=n;i++)
	{
		cnt=cnt*i;
		
	}
	return cnt;
}
}
