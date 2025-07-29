package day17;

import java.util.Scanner;

public class rotate_character_upto_ntimes {
	static void method(String word, int rot) {
	    char ch[] = word.toCharArray();
	    for (int i = 0; i < ch.length; i++) {
	        int cast = (int) ch[i] + rot;
	        if (ch[i] >= 'a' && ch[i] <= 'z') {
	            if (cast > 'z') {
	                cast = 'a' + (cast - 'z' - 1);
	            }
	            ch[i] = (char) cast;
	        }
	        else if (ch[i] >= 'A' && ch[i] <= 'Z') {
	            if (cast > 'Z') {
	                cast = 'A' + (cast - 'Z' - 1);
	            }
	            ch[i] = (char) cast;
	        }
	    }
	    for (int i = 0; i < ch.length; i++) {
	        System.out.print(ch[i]);
	    }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int rotate = sc.nextInt();
		method(str,rotate);
		sc.close();
	}
}
