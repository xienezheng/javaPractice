package objTry;
import java.net.*;
import java.io.*;
public class Student implements Serializable {
String name;
int age;
String relative[]=new String[5];
public  Student(String x,int y,String z[])
{
	name=x;
	age=y;
	relative=z;
}
public String getName()
{
	return name;
}
public String[] getRela()
{
	return relative;
}

}
