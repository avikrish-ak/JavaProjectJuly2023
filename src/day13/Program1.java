package day13;

import java.util.Arrays;
import java.util.LinkedList;

public class Program1 {

	public static void main(String[] args) {
		LinkedList<Integer> x= new LinkedList<>();
		x.add(10);//0
		x.add(20);//1
		x.add(30);//2

		System.out.println(x);

		x.remove(1);
		System.out.println(x);
		x.remove();
		System.out.println(x);

		x.add(10);//1
		x.add(20);//2
		x.add(30);//3
		System.out.println(x);

		x.add(0, 123);
		System.out.println(x);

		x.pop();
		System.out.println(x);

		System.out.println(x.peek());
		x.add(200);
		System.out.println(x.peekFirst());
		System.out.println(x.peekLast());
		System.out.println(x);


		System.out.println(x.poll());
		System.out.println(x);
		
		System.out.println(x.pollFirst());
		System.out.println(x.pollLast());
		
		System.out.println(x.size());
		System.out.println(x);
		
		System.out.println(x.isEmpty());
		
		x.clear();
		System.out.println(x);
		
		System.out.println(x.isEmpty());
		
		
		Integer[] y= {10,20,30,40,50,60};
		x.addAll(Arrays.asList(y));
		System.out.println(x);
		
		x.addAll(2,Arrays.asList(555,666,777,888));
		
		System.out.println(x);
		
		x.removeAll(Arrays.asList(555,666,777,888));
		
		System.out.println(x);
		
		x.set(2, 333);
		System.out.println(x);
		
		System.out.println(x.contains(333));
		System.out.println(x.contains(33));
		
		System.out.println(x.containsAll(Arrays.asList(40,20,333)));
		System.out.println(x.containsAll(Arrays.asList(30,20,3333)));
		
		x.addFirst(123);
		System.out.println(x);
		
		x.addLast(456);
		System.out.println(x);
		
	}

}
