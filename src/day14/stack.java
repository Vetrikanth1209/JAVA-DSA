package day14;

class Ns{
	int data ;
	Ns next;
	Ns(int d){
		data = d;
		next = null;
	}
}

class stack_operation{
	Ns head = null;
	void push(int d) {
		Ns newnode = new Ns(d);
		if(head == null) {
			head = newnode;
		}else {
			newnode.next = head;
			head = newnode;
		}
	}
	void pop() {
		if(head == null) {
			System.out.println(-1);
			return;
		}else {
			head = head.next;
		}
	}
	
	void peek() {
		if(head == null) {
			System.out.println(-1);
			return;
		}
		System.out.println("peek : "+head.data);
	}
	
	void isEmpty() {
		if(head == null) {
			System.out.println("YES");
			return;
		}else {
			System.out.println("NO");
		}
	}
	
	void display() {
		Ns temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}

public class stack {
	public static void main(String[] args) {
		stack_operation s = new stack_operation();
		s.push(10);
		s.push(20);
		s.push(30);
		s.display();
		s.pop();
		s.display();
		s.peek();
		s.isEmpty();
	}

}
