package day09;

public class Program2 {

	public static void main(String[] args) {
	
		int a=1;
		int table=10;
		
		while(a<=10)
		{
			System.out.println(table+"x"+a+"="+a*table);
			a=a+1;
		}
		
		table=20;
		int b=1;
		do
		{
			System.out.println(table+"x"+b+"="+b*table);
			b=b+1;
		}while(b<=10);
		

		table=30;
		for(int c=1;c<=10;c=c+1)
		{
			System.out.println(table+"x"+c+"="+c*table);
		}
		
	}

}
