package Events;
import javax.swing.*;
import java.awt.event.*;
public class TwoButtonAction extends JFrame implements ActionListener{
	JPanel j1=new JPanel();
	JButton jb1=new JButton("��");
	JButton jb2=new JButton("��");
	public TwoButtonAction()
	{
		this.setBounds(300,300,400,300);
		this.setVisible(true);
		this.add(j1);
		j1.add(jb1);
		j1.add(jb2);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb1.setMnemonic('x');
		jb2.setMnemonic('z');
	}
	public void actionPerformed(ActionEvent e)//ע��,�������״�����e
	{
	if(e.getSource()==jb1)//ע����ʽ
	{
		TwoWindows t=new TwoWindows();
		this.setVisible(false);//���������Ӧ������һ������
	}
	if(e.getSource()==jb2)//ע��
	{
		System.out.println("dd");//��ť��Ҳ������������������
		AddCnt a=new AddCnt();
		this.setVisible(false);//���������Ӧ������һ������
	}
	}
	public static void main(String args[])
	{
		TwoButtonAction t=new TwoButtonAction();
	}
	

}
