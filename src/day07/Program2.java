package day07;

public class Program2 {

	public static void main(String[] args) {
		
		int a=100;
		int b=20;
		double c=10.2;
		
		System.out.println(a>b   && a>c);//true
		System.out.println(b>a   && b>c);//false
		
		
		System.out.println(a>b   || a>c);//true
		System.out.println(b>a   || b>c);//true
		
		System.out.println(!(a>b   && a>c));//false
		System.out.println(!(b>a   && b>c));//true
	}

}
