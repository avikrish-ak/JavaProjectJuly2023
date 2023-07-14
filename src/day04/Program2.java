package day04;

public class Program2 {

	public static void main(String[] args) {
		int a, b;
		a=65;
		b=20;
		int x=add(a,b);
		int y= sub(a,b);
		int z= mul(a,b);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(x*y*z);
	}
	
	
	public static int add(int a,int b)
	{
		return(a+b);	
	}
	
	public static int sub(int a,int b)
	{
		return(a-b);
	}
	
	
	public static int mul(int a,int b)
	{
		return(a*b);
	}
	

}
