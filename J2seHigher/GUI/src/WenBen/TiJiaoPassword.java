package WenBen;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TiJiaoPassword extends JFrame implements ActionListener {

	JPanel jp=new JPanel();
	JButton jb=new JButton("�ύ");
	JLabel jl1=new JLabel("�û���");
	JLabel jl2=new JLabel("����");
	JLabel jl3=new JLabel("�ٴ���������");
	JLabel jl4=new JLabel("���벻һ�£�����������");
	JLabel jl5=new JLabel("�ύ�ɹ�");
	JLabel jl6=new JLabel("���벻��С��6λ");
	JPasswordField jpf=new JPasswordField(20);
	JPasswordField jpf1=new JPasswordField(20);
	JTextField jtf=new JTextField(20);
	public TiJiaoPassword()
	{   this.setTitle("�����ύ");//����Σ���������д�ؼ�
		this.setBounds(200,200,600,400);
		this.setVisible(true);
		this.add(jp);
		jp.setLayout(null);//�ղ���
		jtf.setBounds(200,50,200,35);
		jp.add(jtf);//�ı���
		jl1.setBounds(100,50,50,35);
		jp.add(jl1);//��ʾ�ַ�1
		jl2.setBounds(100,100,50,35);
		jp.add(jl2);//��ʾ�ַ�2
		jl3.setBounds(100,150,100,35);
		jp.add(jl3);//��ʾ�ַ�3
		jpf.setBounds(200,100,200,35);
		jp.add(jpf);//����1
		jpf1.setBounds(200,150,200,35);
		jp.add(jpf1);//����2
		jb.setBounds(150,250,100,35);
		jp.add(jb);//��ť1
		jb.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=jtf.getText();
		String s2=jpf.getText();
		String s3=jpf1.getText();
		if(s2.length()<6)
		{
			jp.add(jl6);
			jl6.setBounds(150,300,200,35);
		}else
		{
		if(s2.equals(s3))
		{
			System.out.println("�û���Ϊ"+s1);
			System.out.println("����ΪΪ"+s2);
			
			jp.add(jl5);
			jl5.setBounds(150,300,200,35);
		jl4.setText(null);
		jl6.setText(null);
		
		}
		else
		{
		jl4.setText("���벻һ�£�����������");
		jp.add(jl4);
		jl4.setBounds(150,300,200,35);
		jpf.setText(null);
		jpf1.setText(null);
		jl6.setText(null);
		jl5.setText(null);
	
		}
		}
		
	}
	public static void main(String args[])
	{
		TiJiaoPassword t=new TiJiaoPassword();
	}
	
	
	
}
