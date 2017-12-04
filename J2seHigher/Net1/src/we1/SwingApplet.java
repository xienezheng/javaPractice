package we1;
import java.net.Socket;
import java.io.*;
import java.net.Socket;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
//import java.io.DataOutputStream;
//import java.io.IOException;
import javax.swing.*;
public class SwingApplet  {
	public static void main(String[] args)throws IOException{
	JFrame f=new JFrame("Simple swing application");
		Container contentPane=f.getContentPane();
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(0,1));
		
		r1.setBounds(10, 10, 10, 10);
		
		r1.setForeground(Color.red);
		r1.setHorizontalAlignment(SwingConstants.CENTER);
		p1.add(r1);
		p1.setPreferredSize(new Dimension(100, 100));
		JPanel p2=new JPanel();
		GridLayout layout = new GridLayout(0,2); 
		p2.setLayout(layout);
		JButton button1=new JButton("º∆À„ ");
		JButton button2=new JButton("ÕÀ≥ˆ");
		JTextArea sm1=new JTextArea();
		JTextArea sm2=new JTextArea();
		//final JLabel lable1=new JLabel("æÿ’Û ‰»Î");
		final JLabel lable2=new JLabel("æÿ’Û1––¡–");
		final JLabel lable3=new JLabel("æÿ’Û2––¡–");
		final JLabel lable6=new JLabel("æÿ’Û1 ‰»Î");
		final JLabel lable7=new JLabel("æÿ’Û2 ‰»Î");
		final JLabel lable8=new JLabel("æÿ’Û1*æÿ’Û2=");
		JTextArea sm3=new JTextArea();
		JTextArea sm4=new JTextArea();
		JTextArea sm5=new JTextArea();
		
		f.setBackground(Color.gray);
		p2.add(lable2);
		p2.add(sm1);
		p2.add(lable6);
		p2.add(sm2);
		p2.add(lable3);
		p2.add(sm3);
		p2.add(lable7);
		p2.add(sm4);
		p2.add(lable8);
		p2.add(sm5);
		p2.setPreferredSize(new Dimension(200, 200));
		JPanel p3=new JPanel();
		p3.setLayout(new GridLayout(0,2));
		p3.add(button1);
		p3.add(button2);
		p3.setPreferredSize(new Dimension(50, 50));
		contentPane.add(p1,BorderLayout.NORTH);
		contentPane.add(p2,BorderLayout.CENTER);
		contentPane.add(p3,BorderLayout.SOUTH);
		Calelistener a= new Calelistener(sm1,sm2,sm3,sm4,sm5);
		button1.addActionListener(a);
		button2.addActionListener(a);
		f.setTitle("æÿ’Û‘ÀÀ„");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}}
class Calelistener implements ActionListener{
      private  JTextArea a, b, c,d,f;
	public Calelistener(JTextArea a,JTextArea b,JTextArea c,JTextArea d,JTextArea f){
    	  this.a=a;
    	  this.b=b;
    	  this.c=c;
    	  this.d=d;
    	  this.f=f;
      }
	 public void actionPerformed(ActionEvent e){
		 String cmd=e.getActionCommand();
		 if(cmd.equals("º∆À„")){
		tcp t=new tcp;
	 }  
}
