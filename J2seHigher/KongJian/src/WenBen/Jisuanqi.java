package WenBen;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Jisuanqi extends JFrame implements ActionListener {
JPanel jp=new JPanel();
JPanel jp1=new JPanel();
JLabel jl1=new JLabel();
JLabel jl2=new JLabel();
int b=0,c=0,d=0;
JTextField jtf=new JTextField(100);
JButton jb1=new JButton("+");
JButton jb2=new JButton("7");
JButton jb3=new JButton("4");
JButton jb4=new JButton("1");
JButton jb5=new JButton("-");
JButton jb6=new JButton("8");
JButton jb7=new JButton("5");
JButton jb8=new JButton("2");
JButton jb9=new JButton("X");
JButton jb10=new JButton("9");
JButton jb11=new JButton("6");
JButton jb12=new JButton("3");
JButton jb13=new JButton("/");
JButton jb14=new JButton("+/-");
JButton jb15=new JButton("%");
JButton jb16=new JButton("sqrt");
JButton jb17=new JButton("0");
JButton jb18=new JButton(".");
JButton jb19=new JButton("AC");
JButton jb20=new JButton("=");


public Jisuanqi()
{
	this.setBounds(200,70,410,630);
	this.setVisible(true);
	jp.add(jtf);
	
	
	this.add(jp);
	
	 jp.setLayout(null);
	jp.add(jb1);
	jb1.setBounds(0,100,100,100);
    jp.add(jb2);
    jb2.setBounds(0,200,100,100);
    jp.add(jb3);
    jb3.setBounds(0,300,100,100);
    jp.add(jb4);
    jb4.setBounds(0,400,100,100);
    jp.add(jb5);
    jb5.setBounds(100,100,100,100);
    jp.add(jb6);
    jb6.setBounds(100,200,100,100);
    jp.add(jb7);
    jb7.setBounds(100,300,100,100);
    jp.add(jb8);
    jb8.setBounds(100,400,100,100);
    jp.add(jb9);
    jb9.setBounds(200,100,100,100);
    jp.add(jb10);
    jb10.setBounds(200,200,100,100);
    jp.add(jb11);
    jb11.setBounds(200,300,100,100);
    jp.add(jb12);
    jb12.setBounds(200,400,100,100);
    jp.add(jb13);
    jb13.setBounds(300,100,100,100);
    jp.add(jb14);
    jb14.setBounds(300,200,100,100);
    jp.add(jb15);
    jb15.setBounds(300,300,100,100);
    jp.add(jb16);
    jb16.setBounds(300,400,100,100);
    jp.add(jb17);
    jb17.setBounds(0,500,100,100);
    jp.add(jb18);
    jb18.setBounds(100,500,100,100);
    jp.add(jb19);
    jb19.setBounds(200,500,100,100);
    jp.add(jb20);
    jb20.setBounds(300,500,100,100);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	jb3.addActionListener(this);
	jb4.addActionListener(this);
	jb5.addActionListener(this);
	jb6.addActionListener(this);
	jb7.addActionListener(this);
	jb8.addActionListener(this);
	jb9.addActionListener(this);
	jb10.addActionListener(this);
	jb11.addActionListener(this);
	jb12.addActionListener(this);
	jb13.addActionListener(this);
	jb14.addActionListener(this);
	jb15.addActionListener(this);
	jb16.addActionListener(this);
	jb17.addActionListener(this);
	jb18.addActionListener(this);
	jb19.addActionListener(this);
	jb20.addActionListener(this);
	jp.add(jl1);
	jl1.setBounds(0,0,400,100);
	jp.add(jl2);
	jl2.setBounds(0,0,400,100);
	
}
public void actionPerformed(ActionEvent e)//后缀变中缀表达式
//解决大数运算问题
{
	
	
	
	if(e.getSource()==jb2)
	{
	
		jl1.setText("7");
	
	}
	if(e.getSource()==jb3)
	{
	jl1.setText("4");
	
	
	}
	if(e.getSource()==jb1)
	{
	jl1.setText("+");
	
	
	}
	if(e.getSource()==jb4)
	{
	jl1.setText("1");
	
	
	}
	if(e.getSource()==jb5)
	{
	jl1.setText("-");
	
	
	}
	if(e.getSource()==jb6)
	{
	jl1.setText("8");
	
	
	}
	if(e.getSource()==jb7)
	{
	jl1.setText("5");
	
	
	}
	if(e.getSource()==jb8)
	{
	jl1.setText("2");
	
	
	}
	if(e.getSource()==jb9)
	{
	jl1.setText("x");
	
	
	}
	if(e.getSource()==jb10)
	{
	jl1.setText("9");
	
	
	}
	if(e.getSource()==jb11)
	{
	jl1.setText("6");
	
	
	}
	if(e.getSource()==jb12)
	{
	jl1.setText("3");
	
	
	}
	if(e.getSource()==jb13)
	{
	jl1.setText("/");
	
	
	}
	if(e.getSource()==jb14)
	{
	jl1.setText("-");
	
	
	}
	if(e.getSource()==jb16)
	{
	jl1.setText("sqrt");
	
	
	
	}
	if(e.getSource()==jb15)
	{
	jl1.setText("%");
	
	
	}
	if(e.getSource()==jb17)
	{
	jl1.setText("0");
	
	
	}
	if(e.getSource()==jb18)
	{
	jl1.setText(".");
	
	
	}
	if(e.getSource()==jb19)
	{
	jl1.setText(null);
	
	
	}
	
	if(e.getSource()==jb20)
	{
	jl1.setText("");
	
	
	
	}
	
	
	
	
}
public static void main(String args[])
{
	Jisuanqi j=new Jisuanqi();
}

}

