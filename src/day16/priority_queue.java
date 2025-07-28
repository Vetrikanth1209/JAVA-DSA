package day16;
import java.util.*;
public class priority_queue {

	public static void main(String[] args) {
		PriorityQueue<Integer> o = new PriorityQueue<>();
		o.add(10);
		o.add(3);
		o.add(2);
		o.add(40);
		Iterator <Integer> it = o.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}        
