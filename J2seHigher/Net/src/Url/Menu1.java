package Url;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Menu1 extends JFrame implements ActionListener {
	
JMenuBar m1=new JMenuBar();

	JMenu me1=new JMenu("文件");
	JMenu me2=new JMenu("编辑");
	JMenuItem jm1=new JMenuItem("打开");
	JMenuItem jm2=new JMenuItem("关闭");
	JMenuItem jm3=new JMenuItem("离开");
	JPanel jp=new JPanel();
	public  Menu1()
	{
		jp.setLayout(null);
	this.setBounds(100,100,600,400);
	this.setVisible(true);
	this.add(jp);
	me1.add(jm1);
	me1.add(jm2);
	me1.add(jm3);
	m1.setBounds(0,0,80,30);
	m1.add(me1);
	m1.add(me2);
jp.add(m1);
jm1.addActionListener(this);
jm2.addActionListener(this);

    }
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==jm1)
		{
		TiJiaoPassword t=new TiJiaoPassword();
		}
		if(e.getSource()==jm2)
		{
		Jisuanqi j=new Jisuanqi();	
		}
	}
	
}