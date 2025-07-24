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
	
	void delete_beg() {
		head =head.next;
	}
	
	void insert_end(int d) {
		Node newnode = new Node(d);
		if(head == null) {
			head=newnode;
		}else {
			Node temp = head;
			while(temp.next!= null) {
				temp = temp.next;
			}
			temp.next = newnode;
		}
	}
	
	void delete_end() {
		Node temp = head ;
		while(temp.next.next != null) {
	       temp =temp.next ;
		}
		 temp.next = null;
	}
	
	public void insert_at_pos(int val, int pos) {
        if (pos == 0) {
            insert_beg(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
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
		System.out.println("Insert At Beginning");
		System.out.println("--------------------");
		l.insert_beg(10);
		l.insert_beg(20);
		l.display();
		System.out.println();
		System.out.println("Delete At Beginning");
		System.out.println("--------------------");
		l.delete_beg();
		l.display();
		System.out.println();
		System.out.println("Insert At End");
		System.out.println("--------------------");
		l.insert_end(30);
		l.insert_end(40);
		l.insert_end(50);
		l.display();
		System.out.println();
		System.out.println("Delete At End");
		System.out.println("--------------------");
		l.delete_end();
		l.display();
	}
}
