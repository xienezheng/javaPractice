package SwingBasic;
import javax.swing.*;//����
public class JButton1 extends JFrame{//��ⶼ˫��д
	JButton jb1=new JButton("�˳�");
	JPanel jp=new JPanel();
public JButton1()
{
	this.setBounds(100,100,300,200);
	this.setTitle("��ť");
	this.setVisible(true);
	jb1.setText("ffffff");;//�����ÿɹ���
	jp.add(jb1);
	jb1.setMnemonic('x');//��ݼ�
	this.add(jp);//�����ÿɹ���
	
}
public static void main(String args[])
{
	JButton1 j=new JButton1();
}
}
