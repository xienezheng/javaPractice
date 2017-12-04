package draw;
import javax.swing.*;
import java.awt.*;

public class ThreeD extends JFrame {
	public ThreeD()
	{
		this.setVisible(true);
		this.setBounds(100,100,600,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	public void paint(Graphics g)
	{
		super.paint(g);//¹Ø¼ü
	
		g.draw3DRect(20, 30,80,80,false);
		g.draw3DRect(10,10,10,10,true);
	
	}
	
	public  static void main(String args[])
	{
		ThreeD t=new ThreeD();
	}

}
