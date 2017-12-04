package draw;
import java.applet.*;
import java.awt.Graphics;
import java.awt.*;
public class Voice1 extends Applet {
	AudioClip sound=null;
	public void init()
	{
	sound=getAudioClip(getCodeBase(),"H:\\2.mp3");
	}
	public boolean mouseDown(Event e,int x,int y)
	{
	sound.play();
	return true;
	}
}
