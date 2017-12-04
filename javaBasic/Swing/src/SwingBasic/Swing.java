package SwingBasic;
import java.io.*;//好多java都是继承一个类库，实现新用
import javax.swing.*;//用javax.
public class Swing extends JFrame{//继承类库，实现重用
	public  Swing()//与类名相同
	{
		this.setTitle("这是谢訥铮的第一个可视化程序");
		this.setBounds(300,250,300,200);
		this.setVisible(true);
	}
	public static void main(String args[])
	{
		Swing j=new Swing();
		
	}

}
