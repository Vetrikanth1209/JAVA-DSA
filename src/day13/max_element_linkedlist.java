package day13;
import java.util.Scanner;


class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next =null;
	}
}

class linked_list{
	Node head = null;
	void insert(int d) {
		Node newnode = new Node(d);
		if(head == null) {
			head = newnode;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next; 
			}
			temp.next = newnode;
		}
	}
	
	void max() {
		int max = head.data;
		Node temp = head.next;
		if(temp != null) {
			if(max < temp.data) {
				max = temp.data;
			}
			temp = temp.next;
		}
		System.out.println(max+" : Maximum");
		
	}
	
	
	void display() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}


public class max_element_linkedlist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		linked_list l = new linked_list();
		
		for(int i = 0;i<size;i++) {
			int element = sc.nextInt();
			l.insert(element);
		}
		l.display();
		l.max();
		sc.close();
	}

}
