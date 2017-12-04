package SwingBasic;
import javax.swing.*;
import java.awt.event.*;//引入包
public class Swing4 extends JFrame {
	
	public Swing4()
	{
		
		this.setTitle("按钮");
		jp.add(jb);//将按钮添加到面板
		jp.add(jb1);
		this.add(jp);//将面板添加到窗体
		this.setBounds(100,100,300,200);
		this.setVisible(true);
		
		
	}
	JPanel jp=new JPanel();//创建面板
	JButton jb=new JButton("是f");//创建按钮并初始化
	JButton jb1=new JButton("否");
	public static void main(String args[])
	{
		Swing4 s=new Swing4();
	}

}
