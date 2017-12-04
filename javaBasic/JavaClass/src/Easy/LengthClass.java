package Easy;



public class LengthClass {
	
		private double num;
		private String measure;
		public LengthClass(int x,String y)
		{
			num=x;
			measure=y;
		}
		public void display()
		{
			System.out.println(num);
			System.out.println(measure);
		}
		public void cmToM()
		{
			double m;
			m=0.001*num;
			System.out.println(num+"CM is"+m+"M");
		}
		public void MToCm()
		{
			double m;
			m=1000*num;
			System.out.println(num+"M is"+m+"CM");
		}
		
	}


