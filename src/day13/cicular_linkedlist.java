package day13;


class Nc{
	int data;
	Nc next;
	Nc(int d){
		data = d;
		next = null;
	}
}

class op {
	Nc head = null;
	void insert(int d) {
		Nc newnode = new Nc(d);
		if(head == null) {
			head = newnode;
			head.next = head;
		}else {
			Nc temp = head;
			while(temp.next != head) {
				temp = temp.next;
			}
			newnode.next = head;
			temp.next = newnode;
		}
	}
	
	void display() {
		Nc temp = head;
		do {
			System.out.println(temp.data);
			temp = temp.next;
		}while(temp!=head);
	}
}

public class cicular_linkedlist {
	public static void main(String[] args) {
		op o = new op();
		o.insert(10);
		o.insert(20);
		o.display();
	}
}
