package Collection;
import java.util.*;

public class Collection1 {
public static void main(String args[])
{
	Set s=new HashSet();
	s.add("d");
	s.add("dd");
	s.add("dd");
	s.add("ddd");
	s.remove("d");

		System.out.println(s);
		String s1=new String();
s1=s.toString();

System.out.println(s1);
}
}