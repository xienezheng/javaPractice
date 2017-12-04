package Events;


import javax.swing.*;
import java.awt.event.*;
public class WinListener extends JFrame implements WindowListener {
	JPanel jp1=new JPanel();
	JButton jb1=new JButton("是");
	
	public WinListener()//窗体的构造函数
	{
		this.setBounds(100,100,300,200);
		this.setVisible(true);
		this.add(jp1);
		jp1.add(jb1);
		
		this.addWindowListener(this);
		
		
	}
	
	public void windowOpened(WindowEvent e)
	{
		System.out.println("窗体首次变为可见");
	}
	public void windowClosing(WindowEvent e)
	{
		System.out.println("窗体关闭中");
	}
	public void windowClosed(WindowEvent e)
	{
		System.out.println("窗体关闭后");
	}
	
	public void windowIconified(WindowEvent e)
	{
		System.out.println("最小化");
	}
	public void windowDeiconified(WindowEvent e)
	{
		System.out.println("最小化恢复");
	}
	public void windowActivated(WindowEvent e)
	{
		System.out.println("窗体激活");
	}
	public void windowDeactivated(WindowEvent e)
	{
		System.out.println("窗体非激活");
	}
	public static void main(String args[])
	{
		WinListener w=new WinListener();
	}
}
