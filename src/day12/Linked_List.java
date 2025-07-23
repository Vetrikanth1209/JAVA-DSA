package day12;

class Node{
	int data;
	Node next;
	Node(int d){
		data =d;
		next = null;
	}
}

class Linkedlist{
	Node head = null;
	void insert_beg(int d) {
		Node newnode =  new Node(d);
		if(head == null) {
			head = newnode;
		}else {
			newnode.next = head;
			head = newnode;
		}
	}
	void display() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}



public class Linked_List {
	public static void main(String [] args) {
		Linkedlist l = new Linkedlist();
		l.insert_beg(10);
		l.insert_beg(20);
		l.display();
	}
}
