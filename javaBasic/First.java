package Applet2;
import java.applet.*;
import java.awt.*;
public class First extends Applet{
	String s="";
	public void init()
	{
		setBackground(Color.red);//��ʼ�����ñ�����ɫ
		setForeground(Color.yellow);
		s=s+"init()-";
	}
	public void start()
	{
		s=s+"init()-";
	}
	public void paint(Graphics g)
	{
		g.drawString(s, 115, 135);//���С���ڵ�λ��
		showStatus("d");//״̬��
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
