package SwingBasic;
import javax.swing.*;//勿忘
public class JButton1 extends JFrame{//类库都双大写
	JButton jb1=new JButton("退出");
	JPanel jp=new JPanel();
public JButton1()
{
	this.setBounds(100,100,300,200);
	this.setTitle("按钮");
	this.setVisible(true);
	jb1.setText("ffffff");;//可设置可构造
	jp.add(jb1);
	jb1.setMnemonic('x');//快捷键
	this.add(jp);//可设置可构造
	
}
public static void main(String args[])
{
	JButton1 j=new JButton1();
}
}
