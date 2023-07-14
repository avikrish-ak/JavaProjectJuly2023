package day06.package2;

import day06.package1.Program1;

public class Program3 extends Program1{

	public static void main(String[] args) {
		add(10,20);
		//sub(20,10); //private method( same class)
		mul(25,25);
		//div(10,3); //default method (same package)
		
		Program1 x= new Program1();
		x.add_ns(10, 20);
		//x.sub_ns(20, 10); //private method
		//x.mul_ns(25, 25);// Protected Method
		//x.div_ns(10, 3);//default method 
	}

}
