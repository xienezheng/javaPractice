package draw;
import java.awt.*;
import java.applet.*;

public class Color extends Applet {
	public void paint(Graphics g)
	{
		
		g.draw3DRect(20, 30,80,80,false);
		g.draw3DRect(10,10,10,10,true);
	}

}
