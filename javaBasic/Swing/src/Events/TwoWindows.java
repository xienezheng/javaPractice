package Events;
import javax.swing.*;

import SwingBasic.Swing;

import java.awt.event.*;//引包，继承接口
public class TwoWindows extends JFrame implements ActionListener {
	JPanel jp1=new JPanel();
	JButton jb1=new JButton("详细信息");
	public TwoWindows()
	{
		this.setBounds(300,300,300,200);
		this.setVisible(true);
		this.setTitle("弹出窗体事件");
		this.add(jp1);
		jp1.add(jb1);
		jb1.setMnemonic('x');
		jb1.addActionListener(this);//必须的
	}
	public void actionPerformed(ActionEvent e)
	{
		
		AddCnt one=new AddCnt();
		//多个监听响应，弹出一个界面
		//同时关闭另一个
		
	}
	
	
	public static void main(String args[])
	{
		TwoWindows t1=new TwoWindows();
	}

}
