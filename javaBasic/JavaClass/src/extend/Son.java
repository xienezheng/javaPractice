package extend;

public class Son extends Father {
	String xueli;
	Son(String x,int y,String z)//��������д����
	{	name=x;
	age=y;
		xueli=z;
			
	}
	public void display()//�������ǣ���Ϊ��д������
	{

		System.out.println(name);
		System.out.println(age);
		System.out.println(xueli);
	}
	
}
