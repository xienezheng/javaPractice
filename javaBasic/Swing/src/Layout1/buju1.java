package Layout1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class buju1 extends JFrame{
	int i=1;
	JButton jb1=new JButton("第一个按钮");
	JButton jb2=new JButton("第二个按钮");
	JButton jb3=new JButton("第三个按钮");
	JButton jb4=new JButton("第四个按钮");
	JButton jb5=new JButton("第五个按钮");
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
