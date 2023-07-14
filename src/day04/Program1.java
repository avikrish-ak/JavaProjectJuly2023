package day04;

public class Program1 {

	public static void main(String[] args) {
		add(45,26);
		add(145,26);
		add(415.045f,26.30334f);
		add(451,26,3456);
		add(453,26,1245);
		add(456.0,26.345);
	}
	
	//Overloading size/datatype
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public static void add(double a,double b)
	{
		System.out.println(a+b);
	}
	
	public static void add(float a,float b)
	{
		System.out.println(a+b);
	}
	
	public static void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	

}
