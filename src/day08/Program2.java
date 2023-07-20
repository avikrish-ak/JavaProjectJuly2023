package day08;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of day :- ");
		int day=scan.nextInt();

		switch (day) {
		case 1:
			System.out.println("SUN");
			break;
		case 2:
			System.out.println("MON");
			break;
		case 3:
			System.out.println("TUE");
			break;
		case 4:
			System.out.println("WENS");
			break;
		case 5:
			System.out.println("THUR");
			break;
		case 6:
			System.out.println("FRI");
			break;
		case 7:
			System.out.println("SAT");
			break;
		default:
			System.out.println("Invalid Day selection");
			break;
		}

	}

}
