package extend;

public class Father {
	 String name;//��������Ϊ����
 int age;
	Father(String x,int y)
	{
		name=x;//thisҪ��
		age=y;
	}
	Father()
	{//��Ҫ�����Ĭ�Ϲ���
		
	}
	public  void display()
	{
		System.out.println(name);
		System.out.println(age);
		
	}
}
