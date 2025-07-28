package day16;

import java.util.Iterator;
import java.util.ArrayDeque;

public class array_dequeue {

	public static void main(String[] args) {
		ArrayDeque<Integer> o = new ArrayDeque<>();
		o.addFirst(10);
		o.addFirst(20);
		o.addLast(30);
		Iterator <Integer> it = o.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
