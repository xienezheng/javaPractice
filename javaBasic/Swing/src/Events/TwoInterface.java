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
		//���������Ӧ������һ������
		//ͬʱ�ر���һ��
		
	}
	public static void main(String args[])
	{
		TwoInterface t=new TwoInterface();
	}

}
