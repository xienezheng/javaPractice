package WenBen;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TextArea1 extends JFrame implements ItemListener {

	JTextArea jta=new JTextArea(10,10);
	JRadioButton jrb1=new JRadioButton("��");
	JRadioButton jrb2=new JRadioButton("Ů");
	ButtonGroup bg=new ButtonGroup();
	JButton jb=new JButton("�ύ");
	JPanel jp=new JPanel();
	public TextArea1()
	{
		this.setBounds(100,100,400,300);
		this.setVisible(true);
		jp.add(jb);
		jp.add(jta);
		this.add(jp);
		bg.add(jrb1);
		bg.add(jrb2);//��ֹ������Ů
		jp.add(jrb1);
		jp.add(jrb2);
		
		jrb1.addItemListener(this);
		jrb2.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource()==jrb1)
		{
		System.out.println("��");
		}
		if(e.getSource()==jrb2)
		{
			System.out.println("Ů");
		}
	}
	public static void main(String args[])
	{
		TextArea1 t=new TextArea1();
	}
}
