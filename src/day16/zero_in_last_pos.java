package day16;

import java.util.ArrayList;
import java.util.Scanner;

public class zero_in_last_pos {
	
	public static int[] check(int[] arr) {
		int [] result = new int[arr.length];
		int pos = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != 0) {
				result[pos] = arr[i];
				pos++;
			}
		}
		return result;
	}
	
	public static int[] check2(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] !=0) {
					continue;
				}
				if(arr[i] == 0) {
					arr[i] = arr[i] ^ arr[j];
					arr[j] = arr[i] ^ arr[j];
					arr[i] = arr[i] ^ arr[j];
				}
			}
		}
		return arr;
	}
	
	public static void check3() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> res = new ArrayList<>();
		int size = sc.nextInt();
		for(int i = 0; i<size;i++) {
			a.add(sc.nextInt());
		}
		for(Integer i : a) {
			if(i !=0) {
				res.add(i);
			}
		}
		for(Integer i : a) {
			if(i ==0) {
				res.add(i);
			}
		}
		
		for(int i : res) {
			System.out.println(i);
		}
		sc.close();
		
	}
	
	public static void arr_list(int [] arr) {
		ArrayList<Integer> a = new ArrayList<>();
		for(int i :arr) {
			if(i != 0) {
				a.add(i);
			}
		}
		
		for(int i :arr) {
			if(i == 0) {
				a.add(i);
			}
		}
		for(int i : a) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int size = sc.nextInt();
//		int arr[] = new int[size];
//		for(int i = 0;i< size;i++) {
//			arr[i] = sc.nextInt();
//		}
//		arr_list(arr);
		check3();
	}

}
