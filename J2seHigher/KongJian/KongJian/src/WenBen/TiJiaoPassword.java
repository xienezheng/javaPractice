package WenBen;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TiJiaoPassword extends JFrame implements ActionListener {

	JPanel jp=new JPanel();
	JButton jb=new JButton("提交");
	JLabel jl1=new JLabel("用户名");
	JLabel jl2=new JLabel("密码");
	JLabel jl3=new JLabel("再次输入密码");
	JLabel jl4=new JLabel("密码不一致，请重新输入");
	JLabel jl5=new JLabel("提交成功");
	JLabel jl6=new JLabel("密码不能小于6位");
	JPasswordField jpf=new JPasswordField(20);
	JPasswordField jpf1=new JPasswordField(20);
	JTextField jtf=new JTextField(20);
	public TiJiaoPassword()
	{   this.setTitle("密码提交");//按层次，从上至下写控件
		this.setBounds(200,200,600,400);
		this.setVisible(true);
		this.add(jp);
		jp.setLayout(null);//空布局
		jtf.setBounds(200,50,200,35);
		jp.add(jtf);//文本框
		jl1.setBounds(100,50,50,35);
		jp.add(jl1);//提示字符1
		jl2.setBounds(100,100,50,35);
		jp.add(jl2);//提示字符2
		jl3.setBounds(100,150,100,35);
		jp.add(jl3);//提示字符3
		jpf.setBounds(200,100,200,35);
		jp.add(jpf);//密码1
		jpf1.setBounds(200,150,200,35);
		jp.add(jpf1);//密码2
		jb.setBounds(150,250,100,35);
		jp.add(jb);//按钮1
		jb.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=jtf.getText();
		String s2=jpf.getText();
		String s3=jpf1.getText();
		if(s2.length()<6)
		{
			jp.add(jl6);
			jl6.setBounds(150,300,200,35);
		}else
		{
		if(s2.equals(s3))
		{
			System.out.println("用户名为"+s1);
			System.out.println("密码为为"+s2);
			
			jp.add(jl5);
			jl5.setBounds(150,300,200,35);
		jl4.setText(null);
		jl6.setText(null);
		
		}
		else
		{
		jl4.setText("密码不一致，请重新输入");
		jp.add(jl4);
		jl4.setBounds(150,300,200,35);
		jpf.setText(null);
		jpf1.setText(null);
		jl6.setText(null);
		jl5.setText(null);
	
		}
		}
		
	}
	public static void main(String args[])
	{
		TiJiaoPassword t=new TiJiaoPassword();
	}
	
	
	
}
