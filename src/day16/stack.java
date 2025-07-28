package day16;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		Stack<Integer> a = new Stack<>();
		a.push(10);
		a.push(20);
		a.push(30);
		a.add(1,40);
		System.out.println(a.peek());
		System.out.println(a.isEmpty());
		System.out.println(a);
	}

}
