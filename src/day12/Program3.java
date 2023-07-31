package day12;

import java.util.Arrays;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of Name array :- ");
		int size = scan.nextInt();
		String[] names=new String[size];

		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the name in index "+i);
			names[i]=scan.next();
		}
		scan.close();
		System.out.println(Arrays.toString(names));
	}

}
