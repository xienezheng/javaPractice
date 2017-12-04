package draw;
import java.applet.*;
import java.awt.*;
public class Image1 extends Applet{

	Image image;
	public void init()
	{
		
		image=getImage(getCodeBase(),"H:\\1.jpg");
	}
	public void paint(Graphics g)
	{
		g.drawImage(image,5,5,this);
	}

}
