package day12;

public class Program2 {

	public static void main(String[] args) {
		String[] a = {"aa","bb","cc","dd"};

		System.out.println(a[0]);//aa
		System.out.println(a[1]);//bb
		System.out.println(a[2]);//cc
		System.out.println(a[3]);//dd
		//System.out.println(a[4]);//error
		System.out.println("Index loop");
		for(int x=0;x<a.length;x=x+1)
		{
			System.out.println(a[x]);
		}
		
		a[0]="aaa";
		a[1]="bbb";
		a[3]="abc";
		a[2]="cba";
		
		System.out.println("for loop");
		for(String b:a)
		{
			System.out.println(b);
		}
		
	}

}
