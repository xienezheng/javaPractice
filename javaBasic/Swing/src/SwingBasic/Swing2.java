package SwingBasic;
import javax.swing.*;
import java.awt.*;//Ҫ��awt���أ�Swing�Ƕ�awt�Ĳ���
import java.util.Date;
public class Swing2 extends JFrame {
	public Swing2()
	{
		Date d=new Date();
		
		this.setBounds(100,100,300,200);
		this.setVisible(true);
		this.setResizable(true);
		
		Image i=this.getToolkit().getImage("1.jpg");
		this.setIconImage(i);
	}

}
