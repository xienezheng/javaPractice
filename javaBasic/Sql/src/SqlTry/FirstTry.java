package SqlTry;
import java.util.*;
import java.sql.*;
public class FirstTry {
public static void main(String args[])
{
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	try{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=try1");
		String userName="sa";

		  String userPwd="1";
	}catch(Exception e)
	{
		System.err.println("OpenConn:"+e.getMessage());
	}
	try
	{
		stmt=(Statement)conn.createStatement();
		String sql="select name from [name-num]";
			rs=stmt.executeQuery(sql);
		while(rs.next())
		{
			long xh=rs.getLong(1);
			String xm=rs.getString(2);
			System.out.println(xh);
			System.out.println(xm);
		}
		rs.close();
		stmt.close();
		conn.close();
	}catch(SQLException e)
	{
		System.out.println(e.getMessage());
	}
	
}
}
