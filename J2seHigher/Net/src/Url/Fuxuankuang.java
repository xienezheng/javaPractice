package Url;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Fuxuankuang extends JFrame implements ItemListener {

	
	JCheckBox jcb1=new JCheckBox("��");
	JCheckBox jcb2=new JCheckBox("Ů");
	JCheckBox jcb3=new JCheckBox("ͬ");
	JPanel jp=new JPanel();
	public Fuxuankuang()
	{
		this.setBounds(100,100,400,300);
		this.setVisible(true);
		
		jcb1.addItemListener(this);
		jcb2.addItemListener(this);
		jcb3.addItemListener(this);
		jp.add(jcb1);
		jp.add(jcb2);
		jp.add(jcb3);
		this.add(jp);
		
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource()==jcb1)
		{
			System.out.println("��");
			Menu1 m=new Menu1();
		}
		if(e.getSource()==jcb2)
		{
			System.out.println("Ů");
		}
		if(e.getSource()==jcb3)
		{
			System.out.println("ͬ");
		}
	}
	public static void main(String args[])
	{
		Fuxuankuang f=new Fuxuankuang();
		
	}
}
