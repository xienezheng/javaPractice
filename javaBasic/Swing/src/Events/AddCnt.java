package Events;
import javax.swing.*;//�����¼���

import SwingBasic.Swing;

import java.awt.event.*;
public class AddCnt extends JFrame implements ActionListener{
	JPanel j=new JPanel();
	JButton b1=new JButton("��ť������0��");
	int i=0; 
	JLabel l1=new JLabel();
	public AddCnt()//�������˳��ģ��и���Ч��
	{
		this.setBounds(100,100,300,200);
		this.setTitle("�����¼���һ");
		this.setVisible(true);
	
		l1.setText("Ҫ������証�����");
		this.add(l1);
		l1.setVerticalAlignment(JLabel.CENTER);
		l1.setHorizontalAlignment(JLabel.CENTER);
		b1.setMnemonic('r');//Ϊ��ť���ÿ�ݼ�
		b1.addActionListener(this);//Ϊ��ť���ü�����
		this.add(j);
		j.add(b1);
		
	}
	public void actionPerformed(ActionEvent e)//�ӿں���
	{
		this.b1.setText("��ť������"+(++i)+"��");//i++������
		Swing j=new Swing();
	}//this��ʾ������ڵģ���.��ʾϸ������
	
	

}
