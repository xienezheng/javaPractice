package Easy;

public class Stringpre2 {
	public static void main(String args[])
	{
		String s="xienezheng";//���ֳ�ʼ����û�����빦��
		String s1=new String("ssssss");//
		String s2=s1+s;//�����±����
		char a[]=new char[]{'d','g','h','k','l'};//�ַ������ʼ����
		String s3=new String(a,1,3);
		
		int cnt=s.indexOf("e",3);
		System.out.println(cnt);
	}
	

}
