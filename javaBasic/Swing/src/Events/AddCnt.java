package Events;
import javax.swing.*;//引入事件包

import SwingBasic.Swing;

import java.awt.event.*;
public class AddCnt extends JFrame implements ActionListener{
	JPanel j=new JPanel();
	JButton b1=new JButton("按钮按下了0次");
	int i=0; 
	JLabel l1=new JLabel();
	public AddCnt()//里边是有顺序的，有覆盖效果
	{
		this.setBounds(100,100,300,200);
		this.setTitle("触发事件加一");
		this.setVisible(true);
	
		l1.setText("要亲王琳瑷几个？");
		this.add(l1);
		l1.setVerticalAlignment(JLabel.CENTER);
		l1.setHorizontalAlignment(JLabel.CENTER);
		b1.setMnemonic('r');//为按钮设置快捷键
		b1.addActionListener(this);//为按钮设置监听器
		this.add(j);
		j.add(b1);
		
	}
	public void actionPerformed(ActionEvent e)//接口函数
	{
		this.b1.setText("按钮按下了"+(++i)+"次");//i++加括号
		Swing j=new Swing();
	}//this表示这个窗口的，加.表示细化从属
	
	

}
