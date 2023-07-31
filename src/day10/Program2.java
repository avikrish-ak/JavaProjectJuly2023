package day10;

public class Program2 {

	public static void main(String[] args) {
		System.out.println("WHILE");
		int a=1;

		int u=0;
		int v=1;
		int w;

		while(a<=10)
		{
			System.out.print(u+"\t");
			w=u+v;//new value
			u=v;//old value updating into u
			v=w;//new value updating into v
			a=a+1;
		}

		System.out.println("\nDO_WHILE");
		a=1;
		u=0;
		v=1;

		do
		{
			System.out.print(u+"\t");
			w=u+v;//new value
			u=v;//old value updating into u
			v=w;//new value updating into v
			a=a+1;
		}while(a<=10);

		System.out.println("\nFOR");
		u=0;
		v=1;
		for(a=1;a<=10;a=a+1)
		{
			System.out.print(u+"\t");
			w=u+v;//new value
			u=v;//old value updating into u
			v=w;//new value updating into v
		}



	}

}
