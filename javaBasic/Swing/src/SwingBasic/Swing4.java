package SwingBasic;
import javax.swing.*;
import java.awt.event.*;//�����
public class Swing4 extends JFrame {
	
	public Swing4()
	{
		
		this.setTitle("��ť");
		jp.add(jb);//����ť��ӵ����
		jp.add(jb1);
		this.add(jp);//�������ӵ�����
		this.setBounds(100,100,300,200);
		this.setVisible(true);
		
		
	}
	JPanel jp=new JPanel();//�������
	JButton jb=new JButton("��f");//������ť����ʼ��
	JButton jb1=new JButton("��");
	public static void main(String args[])
	{
		Swing4 s=new Swing4();
	}

}
