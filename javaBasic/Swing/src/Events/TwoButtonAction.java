package Events;
import javax.swing.*;
import java.awt.event.*;
public class TwoButtonAction extends JFrame implements ActionListener{
	JPanel j1=new JPanel();
	JButton jb1=new JButton("是");
	JButton jb2=new JButton("否");
	public TwoButtonAction()
	{
		this.setBounds(300,300,400,300);
		this.setVisible(true);
		this.add(j1);
		j1.add(jb1);
		j1.add(jb2);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb1.setMnemonic('x');
		jb2.setMnemonic('z');
	}
	public void actionPerformed(ActionEvent e)//注意,函数名易错，遗忘e
	{
	if(e.getSource()==jb1)//注意形式
	{
		TwoWindows t=new TwoWindows();
		this.setVisible(false);//多个监听响应，弹出一个界面
	}
	if(e.getSource()==jb2)//注意
	{
		System.out.println("dd");//按钮里也可以输出东西，运算等
		AddCnt a=new AddCnt();
		this.setVisible(false);//多个监听响应，弹出一个界面
	}
	}
	public static void main(String args[])
	{
		TwoButtonAction t=new TwoButtonAction();
	}
	

}
