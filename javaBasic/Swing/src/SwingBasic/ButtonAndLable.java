package SwingBasic;
import javax.swing.*;
public class ButtonAndLable extends JFrame {

	JPanel jp=new JPanel();
	JButton jb=new JButton("��");
	JButton jb1=new JButton("��");
	JLabel jl=new JLabel();
	public ButtonAndLable()
	{
		this.setBounds(100,100,500,400);
		this.setTitle("��ǩ");
		this.setVisible(true);
		
		jl.setBounds(200,200,200,200);//ȫ��ͨ����Щȷ��λ��
		jb.setBounds(200,300,50,50);
		jp.add(jl);
		jp.add(jb);
		jp.add(jb1);
		jl.setText("������Ǹ��󻵵�");
		
		this.add(jp);//��ǩ��ť����ӵ������
	}
	public static void main(String args[])
	{
		Jlabel pp=new Jlabel();
	}
	

}
