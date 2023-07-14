package day06.package1;

public class Program1 {
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	private static void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	
	protected static void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	
	static void div(int a,int b)
	{
		System.out.println(a/b);
	}

	public void add_ns(int a,int b)
	{
		System.out.println(a+b);
	}
	
	private void sub_ns(int a,int b)
	{
		System.out.println(a-b);
	}
	
	protected void mul_ns(int a,int b)
	{
		System.out.println(a*b);
	}
	
	void div_ns(int a,int b)
	{
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		add(10,20);
		sub(20,10);
		mul(25,25);
		div(10,3);
		Program1 x= new Program1();
		x.add_ns(10, 20);
		x.sub_ns(20, 10);
		x.mul_ns(25, 25);
		x.div_ns(10, 3);
	}

}
