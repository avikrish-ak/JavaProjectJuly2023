package day06.package1;

public class Program2 extends Program1{

	public static void main(String[] args) {
		add(10,20);
		//sub(20,10); //private method
		mul(25,25);
		div(10,3);
		
		Program1 x= new Program1();
		x.add_ns(10, 20);
		//x.sub_ns(20, 10); //private method
		x.mul_ns(25, 25);
		x.div_ns(10, 3);
	}


}
