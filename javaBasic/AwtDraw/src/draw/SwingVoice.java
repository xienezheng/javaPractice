package draw;
import java.applet.*;
import java.awt.Graphics;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class SwingVoice extends Applet implements ActionListener{
	JButton jb=new JButton("yes");
	JPanel jp=new JPanel();
	AudioClip sound;
	public void init()
	{
		jp.add(jb);
		this.add(jp);
		this.setBounds(100, 100, 600, 300);
		this.setVisible(true);
		jb.addActionListener(this);
		sound=getAudioClip(getCodeBase(),"H:\\2.mp3");
	}
	public void actionPerformed(ActionEvent e)
	{
		sound.play();
	}

}
