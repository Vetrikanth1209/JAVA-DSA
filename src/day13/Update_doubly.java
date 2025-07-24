package day13;

import java.util.Scanner;

class Nd{
	int data;
	Nd prev;
	Nd next;
	Nd(int d){
		data = d;
		prev = null;
		next = null;
	}
}

class operation{
	Nd head = null;
	
	void insert(int d) {
		Nd newnode = new Nd(d);
		if(head == null) {
			head = newnode;
		}else {
			Nd temp = head ;
			while(temp.next != null) {
				temp = temp.next;
			}
			newnode.prev = temp;
			temp.next = newnode;
		}
	}
	
	void update(int pos,int element) {
		Nd temp = head;
		int count = 1;
		while(temp != null) {
			if(count == pos) {
				Nd newnode = new Nd(element);
				if(temp != head) {
					newnode.prev = temp.prev;
					newnode.next = temp;
					temp.prev.next = newnode;
					temp.prev = newnode;
			}else {
				newnode.prev = null;
				newnode.next = head;
				head.prev =newnode;
				head = newnode;
			}
			}
			temp = temp.next;
			count++;
		}
	}
	
//void update(int pos, int element) {  ///////////////////method 2
//	    Nd temp = head;
//	    Nd newnode = new Nd(element);
//	    int count = 1; // Positions start from 1
//
//	    while (temp != null) {
//	        if (count == pos) {
//	            newnode.next = temp;
//	            newnode.prev = temp.prev;
//
//	            if (temp.prev != null) {
//	                temp.prev.next = newnode;
//	            } else {
//	                head = newnode; // If inserting at position 1
//	            }
//
//	            temp.prev = newnode;
//	            System.out.println("Inserted " + element + " at position: " + count);
//	            break;
//	        }
//	        temp = temp.next;
//	        count++;
//	    }
//	}
//
//	
	void display() {
		Nd temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}


public class Update_doubly {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		operation l = new operation();
		for(int i = 0;i< size;i++) {
			l.insert(sc.nextInt());
		}
		l.update(1,70);
		l.display();
		sc.close();
	}

}
