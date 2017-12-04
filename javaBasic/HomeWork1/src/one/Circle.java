package one;
import java.util.*;
public class Circle {
	double r;
	Circle(double x)
	{
		r=x;
	}
	Circle()
	{
		
	}
	public double Area()
	{
		double A;
		A=Math.PI*r*r;
		return A;
	}

}
