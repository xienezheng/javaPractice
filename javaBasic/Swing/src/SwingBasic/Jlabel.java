package SwingBasic;
import javax.swing.*;
public class Jlabel extends JFrame{
	JPanel jp=new JPanel();
	JButton jb=new JButton("是");
	JButton jb1=new JButton("否");
	JLabel jl=new JLabel();
	public Jlabel()
	{
		this.setBounds(100,100,500,400);
		this.setTitle("标签");
		this.setVisible(true);
		this.add(jp);//标签按钮都添加到面板中
		
		jp.add(jl);
		jp.add(jb);
		jp.add(jb1);
		jl.setText("王琳瑷是个大坏蛋");
		jl.setBounds(200,200,200,200);//全部通过这些确定位置
		jb.setBounds(200,300,50,50);
	}
	public static void main(String args[])
	{
		Jlabel pp=new Jlabel();
	}
	

}
