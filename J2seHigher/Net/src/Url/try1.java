package WenBen;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class try1 extends JFrame implements ActionListener {
	JPanel jp=new JPanel();
	JButton jb1=new JButton("是");
	JLabel jl=new JLabel();
	public try1()
	{
		jp.setLayout(null);//必须为空布局
		this.setBounds(100,100,300,200);
		this.setVisible(true);
		this.add(jp);
		jp.add(jb1);
		jp.add(jl);
		jl.setText("王琳瑷是个大坏蛋");
		jl.setBounds(100,20,120,120);
		jb1.setBounds(125,135,50,25);//相对于窗体位置
		jb1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("dd");
	}
public static void main(String args[])
{
	try1 t=new try1();
}
}
