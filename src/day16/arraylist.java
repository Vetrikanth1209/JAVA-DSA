package day16;

import java.util.ArrayList;

public class arraylist {
	public static void main(String[] args) {
		ArrayList <Object> a = new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(1.2);
		a.add("happy");
		a.add("hello");
		a.set(0, 100);
		a.remove("happy");
		a.add(1,200);
		a.remove("Happy");
		System.out.println(a.isEmpty());
		System.out.println(a.contains("hello"));
		
		for(Object i : a) {
			System.out.println(i);
		}
}
}
