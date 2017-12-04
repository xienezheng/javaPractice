package Collection;
import java.util.*;
public class Iterator1 {
public static void main(String args[])
{
	ArrayList al=new ArrayList();
	al.add("xie");
	al.add("ne");
	al.add("zheng");
	Iterator it1=al.iterator();
	while(it1.hasNext())
	{
		String s=(String)it1.next();
		System.out.println(s);
		
	}
	
}
}
