package day13;
import java.util.Scanner;

class Nod{
	int data;
	Nod next;
	Nod(int d){
		data =d;
		next = null;
	}
}

class list{
	Nod head = null;
	void insert(int d) {
		Nod newnode = new Nod(d);
		if(head == null) {
			head = newnode;
		}else {
			Nod temp = head;
			while(temp.next != null) {
				temp= temp.next;
			}
			temp.next = newnode;
		}
	}
	
	void display() {
		Nod temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	void even() {
		Nod temp = head;
		while(temp != null) {
			if(temp.data % 2 ==0) {
				System.out.println(temp.data);
			}
			temp =temp.next;
		}
	}
}


public class even_linkedlist {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	list l = new list();
	for(int i = 0;i<size;i++) {
		l.insert(sc.nextInt());
	}
	l.display();
	System.out.println("EVEN");
	l.even();
	sc.close();
}
}
