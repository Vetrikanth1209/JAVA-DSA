package day13;

import java.util.Scanner;

class Node_double{
	int data;
	Node_double prev;
	Node_double next;
	Node_double(int d){
		data = d;
		prev = null;
		next =null;
	}
}

class doubly_linked_list{
	Node_double head = null;
	void insert_beg(int d) {
		Node_double newnode = new Node_double(d);
		if(head == null) {
			head =  newnode;
		}else {
			head.prev = newnode;
			newnode.next  = head;
			head = newnode;
		}
	}
	
	
	void insert_end(int d) {
		Node_double newnode = new Node_double(d);
		if(head == null) {
			head = newnode;
		}
		else {
			Node_double temp = head;
			while(temp.next!=null){
				temp =temp.next;
			}
			temp.next = newnode;
			newnode.prev = temp;
		}
}
	
	
	void display() {
		Node_double temp = head;
		while(temp!= null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	void avg(int size ) {
		Node_double temp = head;
		int sum = 0;
		while(temp!= null) {
			sum = sum + temp.data;
			temp = temp.next;
		}
		System.out.println(sum/size);
	}
	
	void reverse() {
		Node_double temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.prev;
		}
	}
}


public class doubly_linkedlist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		doubly_linked_list l = new doubly_linked_list();
		int size = sc.nextInt();
		for(int i = 0;i< size ;i++) {
			l.insert_end(sc.nextInt());
		}
		l.avg(size);
//		l.display();
//		l.reverse();
		sc.close();		
	}

}
