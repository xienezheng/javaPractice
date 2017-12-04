package Easy;

public class Stringpre2 {
	public static void main(String args[])
	{
		String s="xienezheng";//两种初始化，没有输入功能
		String s1=new String("ssssss");//
		String s2=s1+s;//不能下标访问
		char a[]=new char[]{'d','g','h','k','l'};//字符数组初始化化
		String s3=new String(a,1,3);
		
		int cnt=s.indexOf("e",3);
		System.out.println(cnt);
	}
	

}
