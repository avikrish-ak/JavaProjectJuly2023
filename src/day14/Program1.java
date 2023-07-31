package day14;

import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		HashMap<Integer,String> std= new HashMap<Integer,String>();
		std.put(101, "aaa");
		std.put(102, "bbb");
		std.put(103, "ccc");
		
		System.out.println(std.get(101));
		
		System.out.println(std.keySet());
		
		System.out.println(std.values());
		
		System.out.println(std.entrySet());
		
		for(Map.Entry<Integer, String> val:std.entrySet())
		{
			System.out.println(val);
		}
		for(Map.Entry<Integer, String> val:std.entrySet())
		{
			System.out.println(val.getValue());
		}
		for(Map.Entry<Integer, String> val:std.entrySet())
		{
			System.out.println(val.getKey());
		}
		
		for(String val:std.values())
		{
			System.out.println(val);
		}
		
		for(Integer key:std.keySet())
		{
			System.out.println(key);
		}
		
		
		std.remove(101);
		System.out.println(std);
		
		std.remove(104);
		System.out.println(std);
		
		std.replace(102, "abc");
		System.out.println(std);
		
		std.replace(102, "abc", "aabbcc");//update
		System.out.println(std);
		
		std.replace(101, "abc");
		System.out.println(std);
		
		
		std.put(102, "abcabc");//update & insert
		System.out.println(std);
		
		
		std.put(104, "abc");//update & insert
		System.out.println(std);
		
		
		System.out.println(std.size());
		
		System.out.println(std.containsKey(101));
		System.out.println(std.containsKey(102));
		
		System.out.println(std.containsValue("abc"));
		System.out.println(std.containsValue("ababab"));
		
		
		
		std.remove(103, "ccc");
		System.out.println(std);
		
		
		std.remove(104,"abcabca");
		System.out.println(std);

		System.out.println(std.isEmpty());
		
		std.clear();
		
		System.out.println(std);
		
		System.out.println(std.isEmpty());
		
		
		
		
		std.put(101, "aaa");
		std.put(102, "bbb");
		std.put(103, "ccc");
		
		HashMap<Integer,String> std2= new HashMap<Integer,String>();
		
		std2.putAll(std);
		
		System.out.println(std2);
		
	}

}
