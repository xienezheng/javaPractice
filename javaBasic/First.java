package Applet2;
import java.applet.*;
import java.awt.*;
public class First extends Applet{
	String s="";
	public void init()
	{
		setBackground(Color.red);//初始化设置背景颜色
		setForeground(Color.yellow);
		s=s+"init()-";
	}
	public void start()
	{
		s=s+"init()-";
	}
	public void paint(Graphics g)
	{
		g.drawString(s, 115, 135);//相对小窗口的位置
		showStatus("d");//状态栏
		s=s+"init()-";
	}
	public void stop()
	{
		s=s+"init()-";
	}
	public void destory()
	{
		s=s+"init()-";
	}
	

}
