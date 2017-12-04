package draw;
import java.awt.*;
import javax.swing.*;
import java.applet.*;
public class Easy extends JApplet{
	JButton jb=new JButton("shi");
	JPanel jp=new JPanel();
	Container c;
	
	
	public void init()
	{
		c=getContentPane();
			
		jp.add(jb);
		jp.setLayout(null);//小程序添加按钮
		jb.setBounds(50,50,50,50);
		c.add(jp);
	}
	public void paint(Graphics g)
	{
		
		g.drawLine(0, 0, 100, 100);//参数意义
		g.drawRect(10,100,60,50);
		g.fillRect(20,100,60,50);
		g.drawRoundRect(10,100,60,50,15,5);
		g.fillOval(10, 50, 20, 20);
	}

}
