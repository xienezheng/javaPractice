package Events;
import javax.swing.*;

import SwingBasic.Swing;

import java.awt.event.*;//�������̳нӿ�
public class TwoWindows extends JFrame implements ActionListener {
	JPanel jp1=new JPanel();
	JButton jb1=new JButton("��ϸ��Ϣ");
	public TwoWindows()
	{
		this.setBounds(300,300,300,200);
		this.setVisible(true);
		this.setTitle("���������¼�");
		this.add(jp1);
		jp1.add(jb1);
		jb1.setMnemonic('x');
		jb1.addActionListener(this);//�����
	}
	public void actionPerformed(ActionEvent e)
	{
		
		AddCnt one=new AddCnt();
		//���������Ӧ������һ������
		//ͬʱ�ر���һ��
		
	}
	
	
	public static void main(String args[])
	{
		TwoWindows t1=new TwoWindows();
	}

}
