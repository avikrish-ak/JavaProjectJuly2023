package day10;

public class Program1 {

	public static void main(String[] args) {
		int a=1;
		int n=10;
		int result=1;
		
		System.out.println("While...!");
		while(a<=n)
		{
			result = result*a;
			System.out.println(a+"  ----- > "+result);
			a=a+1;
		}
		
		System.out.println("Do-While...!");
		a=1;
		result=1;
		do {
			result = result*a;
			System.out.println(a+"  ----- > "+result);
			a=a+1;
		}while(a<=n);
		
		
		System.out.println("For...!");

		result=1;
		for(a=1;a<=n;a++)
		{
			result = result*a;
			System.out.println(a+"  ----- > "+result);	
		}
		
		
	}

}
