package WenBen;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class WenBenKuang1 extends JFrame implements ActionListener {
	JTextField jtf=new JTextField(20);
	JPasswordField jpf=new JPasswordField(20);
	JPanel jp=new JPanel();
	JLabel jl=new JLabel();
	JButton jb=new JButton("提交");
	public  WenBenKuang1()
	{
		jp.add(jtf);
		jp.add(jpf);
		jp.add(jl);
		this.add(jp);
		jp.add(jb);
		this.setBounds(100,100,600,400);
		this.setVisible(true);
		jb.addActionListener(this);
	}
	public void ActionPerform(ActionEvent e)
	{
		
	System.out.println("密码为：");
	System.out.println("密码为：");

	}
	public static void main(String args[])
	{
		WenBenKuang1 w=new WenBenKuang1();
	}

}
