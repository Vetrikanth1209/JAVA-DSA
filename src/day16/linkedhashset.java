package day16;
import java.util.LinkedHashSet;
public class linkedhashset {
	public static void main(String[] args) {
		LinkedHashSet<Integer> ob = new LinkedHashSet<>();
		ob.add(1);
		ob.add(1);
		ob.add(2);
		ob.add(2);
		ob.add(3);
		ob.add(3);
		ob.add(100);
		ob.add(50);
		
		for(int i : ob) {
			System.out.println(i);
		}
	}
}
