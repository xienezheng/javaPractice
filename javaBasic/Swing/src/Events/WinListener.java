package Events;


import javax.swing.*;
import java.awt.event.*;
public class WinListener extends JFrame implements WindowListener {
	JPanel jp1=new JPanel();
	JButton jb1=new JButton("��");
	
	public WinListener()//����Ĺ��캯��
	{
		this.setBounds(100,100,300,200);
		this.setVisible(true);
		this.add(jp1);
		jp1.add(jb1);
		
		this.addWindowListener(this);
		
		
	}
	
	public void windowOpened(WindowEvent e)
	{
		System.out.println("�����״α�Ϊ�ɼ�");
	}
	public void windowClosing(WindowEvent e)
	{
		System.out.println("����ر���");
	}
	public void windowClosed(WindowEvent e)
	{
		System.out.println("����رպ�");
	}
	
	public void windowIconified(WindowEvent e)
	{
		System.out.println("��С��");
	}
	public void windowDeiconified(WindowEvent e)
	{
		System.out.println("��С���ָ�");
	}
	public void windowActivated(WindowEvent e)
	{
		System.out.println("���弤��");
	}
	public void windowDeactivated(WindowEvent e)
	{
		System.out.println("����Ǽ���");
	}
	public static void main(String args[])
	{
		WinListener w=new WinListener();
	}
}
