package day16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class duplicates_arr {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for(int i =0;i<size;i++) {
			a.add(sc.nextInt());
		}
		
		for(int  i= 0;i<a.size();i++) {
			boolean isunique = false;
			for(int j =0;j<i;j++) {
				if(a.get(i).equals(a.get(j))) {
					isunique = true;
					break;
				}
			}
			if(!isunique) {
				System.out.println(a.get(i));
			}

		}
		
		sc.close();
	}

}
