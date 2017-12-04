package Layout1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CreateButton extends JFrame implements ActionListener{
int i=0;
JButton jb0=new JButton("按钮生成");
JPanel jp1=new JPanel();
public CreateButton()
{
	this.setBounds(100,100,600,400);
	this.setVisible(true);
	this.add(jp1);
	jp1.add(jb0);
	jb0.addActionListener(this);
	jp1.setLayout(new GridLayout(2,4));//行列
}
public void actionPerformed(ActionEvent e)
{
	++i;
	JButton jbi=new JButton("按钮"+i);
	jp1.add(jbi);
	this.show(true);
	if(e.getSource()==jb0)
	{
		System.out.println("ggg");
	}
	
}
public static void main(String args[])
{
	CreateButton c1=new CreateButton();
}
}
