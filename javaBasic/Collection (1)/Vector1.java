package Collection;
import java.util.*;
public class Vector1 {
public static void main(String args[])
{
	Vector v=new Vector();//��������
	v.add("xie");//���
	v.add("ne");
	v.add("zheng");
	v.add("loves");
	v.add("wanglinai");
	System.out.println(v.indexOf("ne"));//����
	 System.out.println(v.size());//
	 System.out.println(v.get(0));//����
	 System.out.println(v.lastElement());
	 v.remove(2);//ɾ��
	 v.add(2,"f");//
	for(int i=0;i<=4;i++)//�������
	{
		 System.out.println(v.get(i));
	}
		System.out.println(v.elementAt(3));
	String s=new String();
	s=v.toString();
	System.out.println(s);
	
}
}
