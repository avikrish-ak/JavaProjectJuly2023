package day08;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a :- ");
		int a=scan.nextInt();
		System.out.println("Enter the value of b :- ");
		int b=scan.nextInt();
		scan.close();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
	}

}
