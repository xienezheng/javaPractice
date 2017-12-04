package draw;
import java.awt.*;
import java.applet.*;
public class Polygon extends Applet {
int x[]={20,20,100,30};
int y[]={20,80,20,30};
int m=4;
public void paint(Graphics g)
{
	g.drawPolygon(x,y,m);
}
}
