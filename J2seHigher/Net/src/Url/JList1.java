package WenBen;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class JList1 extends JFrame implements listSelectionListener {
	String []s={"a","b","c"};
	JList j=new JList(s);
	JScrollPane jp=new JScrollPane(j);
	
	public static void main(String args[])
	{
		JList1 jj=new JList1();
	}

}
