package Events;
import javax.swing.*;
import java.awt.event.*;
public class TwoInterface extends WinListener implements ActionListener  {
	public TwoInterface()
	{
		jb1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		AddCnt one=new AddCnt();
		//多个监听响应，弹出一个界面
		//同时关闭另一个
		
	}
	public static void main(String args[])
	{
		TwoInterface t=new TwoInterface();
	}

}
