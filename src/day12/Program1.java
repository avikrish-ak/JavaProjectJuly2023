package day12;

public class Program1 {

	public static void main(String[] args) {
		int x[];
		
		x= new int[5];
		//0-9
		
		x[0]=55;
		x[2]=78;
		x[4]=4567;
		x[1]=71238;
		x[3]=567;
		
		System.out.println(x[0]);//55
		System.out.println(x[1]);//0
		System.out.println(x[4]);
		
		System.out.println("Len "+x.length);
		for(int i=0;i<x.length;i=i+1)
		{
			System.out.println(x[i]);
		}
		System.out.println("reverse..!");
		for(int i=x.length-1;i>=0;i=i-1)
		{
			System.out.println(x[i]);
		}
		
		
		
		System.out.println("for each...!");
		
		for(int y:x)
		{
			System.out.println(y);
		}
		

	}

}
