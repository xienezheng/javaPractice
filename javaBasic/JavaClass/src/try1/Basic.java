package try1;

public class Basic {
	
		String name;
		int age;
		Basic(String x,int y)
		{
			name=x;
			age=y;
		}
		public void setAge(int x)
		{
			age=x;
			
		}
		public void  display()
		{
			System.out.println(name);
			System.out.println(age);
			
		}
		public int getAge()
		{
			return age;
		}
		public static void main(String args[])
		{
			Basic aa=new Basic("xienezheng",19);
			
			aa.display();
			System.out.println(aa.getAge());
		}
	}


