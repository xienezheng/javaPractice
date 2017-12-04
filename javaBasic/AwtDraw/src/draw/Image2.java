package draw;
import javax.swing.*;
import java.awt.*;
public class Image2 extends JFrame {
	Toolkit toolkit;
	Image img;
	public Image2()
	{
		this.setBounds(100,100,600,400);
		this.setVisible(true);
		toolkit=getToolkit();
		img=toolkit.getImage("H:\\1.jpg");
	}
	public void paint(Graphics g)
	{
		int w=img.getWidth(this);
		int h=img.getHeight(this);
		super.paint(g);
		g.drawImage(img,150,50,w/15,h/15,this);
	}
	public static void main(String args[])
	{
		Image2 i=new Image2();
	}

}
