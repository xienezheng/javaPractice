package extend;

public class Basic {//必须在不同的文件夹里写类
	
	
	public static void main(String args[])
	{
		Father l=new Father("xiedeli",47);
		l.display();
		Son t=new Son("xietao",20,"benke");
		t.display();
	}

}
