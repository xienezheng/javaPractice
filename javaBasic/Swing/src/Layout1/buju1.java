package Layout1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class buju1 extends JFrame{
	int i=1;
	JButton jb1=new JButton("��һ����ť");
	JButton jb2=new JButton("�ڶ�����ť");
	JButton jb3=new JButton("��������ť");
	JButton jb4=new JButton("���ĸ���ť");
	JButton jb5=new JButton("�������ť");
	JPanel jp1=new JPanel();
	public buju1()
	{
		this.setBounds(100,100,300,200);
		this.setVisible(true);
		jp1.setLayout(new FlowLayout());
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jb4);
		jp1.add(jb5);
		this.add(jp1);
	}
	public static void main(String args[] )
	{
		buju1 b=new buju1();
	}

}
