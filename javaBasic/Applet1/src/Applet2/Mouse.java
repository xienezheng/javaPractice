package Applet2;
import java.awt.*;
import java.applet.*;
public class Mouse extends Applet{
	String text="";
public void init()
{
	
	
}
public void start()
{
	
}
public void paint(Graphics g)
{
	g.drawString(text, 20, 20);
}
public boolean mouseDown(Event e,int x,int y)
{
	text="Mouse down ";
	repaint();
	return true;
}
public void stop()
{
	
}
public void destory()
{
	
}
}
