package day14;

class Nq{
	int data;
	Nq next;
	Nq(int d){
		data =d;
		next = null;
	}
}

class check{
	Nq head = null;
	void enqueue(int d) {
		Nq newnode = new Nq(d);
		if(head == null) {
			head = newnode;
		}
		else {
			Nq temp = head;
			while(temp.next!= null) {
				temp = temp.next;
			}
			temp.next = newnode;
		}
	}
	void dequeue() {
		if(head == null) {
			System.out.println(-1);
			return;
		}
		else {
			head = head.next;
		}
	}
	
	void peek() {
		if(head == null) {
			System.out.println("EMPTY");
		}else {
			System.out.println(head.data);
		}
	}
	
	void isempty() {
		if(head == null) {
			System.out.println("YES EMPTY");
		}else {
			System.out.println("NO ITS EMPTY");
		}
	}
	
	void display() {
		Nq temp = head;
		while(temp!= null) {
			System.out.println(temp.data);
			temp =temp.next;
		}
	}
}

public class queue {
	public static void main(String[] args) {
		check c = new check();
		c.enqueue(10);
		c.enqueue(20);
		c.enqueue(30);
		c.display();
		c.dequeue();
		c.dequeue();
		c.display();
		c.peek();
		c.isempty();
	}

}
