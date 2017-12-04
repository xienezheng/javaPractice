package SwingBasic;
import javax.swing.*;
import java.awt.*;//要用awt本地，Swing是对awt的补充
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
