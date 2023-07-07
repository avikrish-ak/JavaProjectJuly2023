package day03;

public class Program1 {

	//static method
	 public static void main(String[] args) {
		String a="good evening..!";
		System.out.println(a);
		display();
		
		Program1 x= new Program1();
		x.disp();

		//x.display();
		
	}
	//static method
	 protected static void display()
	 {
		 System.out.println("Good day..@@@");
		 System.out.println("Good Evening..!");
	 }
	 //non- static method
	  void disp()
	 {
		 System.out.println("Java Program..!");
	 }
	 
	 
	 
	 
	 
	 
}
