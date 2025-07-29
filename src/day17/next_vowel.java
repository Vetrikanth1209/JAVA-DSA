package day17;

import java.util.HashMap;

public class next_vowel {

    public static void main(String[] args) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('a', 'e');
        map.put('e', 'i');
        map.put('i', 'o');
        map.put('o', 'u');
        map.put('u', 'a');
        map.put('A', 'E');
        map.put('E', 'I');
        map.put('I', 'O');
        map.put('O', 'U');
        map.put('U', 'A');
        
        String a = "BeaUtifuL";
        char[] res = a.toCharArray();

        for (int i = 0; i < res.length; i++) {
            char current = res[i];
            if (map.containsKey(current)) {
                res[i] = map.get(current);
            }
        }

        for(int i = 0;i<res.length;i++) {
        	System.out.print(res[i]);
        }
    }
}
