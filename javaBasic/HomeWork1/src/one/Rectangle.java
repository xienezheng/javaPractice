package one;

public class Rectangle {
	double height;
	double width;
	Rectangle(double x,double y)
	{
		height=x;
		width=y;
	}
	Rectangle()
	{
		
	}
	public double Area()
	{
		double A;
		 A=height*width;
		return A;
	}

}
