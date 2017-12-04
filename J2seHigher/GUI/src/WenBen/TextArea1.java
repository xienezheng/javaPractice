package WenBen;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TextArea1 extends JFrame implements ItemListener {

	JTextArea jta=new JTextArea(10,10);
	JRadioButton jrb1=new JRadioButton("男");
	JRadioButton jrb2=new JRadioButton("女");
	ButtonGroup bg=new ButtonGroup();
	JButton jb=new JButton("提交");
	JPanel jp=new JPanel();
	public TextArea1()
	{
		this.setBounds(100,100,400,300);
		this.setVisible(true);
		jp.add(jb);
		jp.add(jta);
		this.add(jp);
		bg.add(jrb1);
		bg.add(jrb2);//防止既男又女
		jp.add(jrb1);
		jp.add(jrb2);
		
		jrb1.addItemListener(this);
		jrb2.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource()==jrb1)
		{
		System.out.println("男");
		}
		if(e.getSource()==jrb2)
		{
			System.out.println("女");
		}
	}
	public static void main(String args[])
	{
		TextArea1 t=new TextArea1();
	}
}
