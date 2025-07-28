package day14;
import java.util.Scanner;

class Sum {
    int data;
    Sum next;

    Sum(int d) {
        data = d;
        next = null;
    }
}

class TwoSum {
    Sum head = null;

    void push(int d) {
        Sum newnode = new Sum(d);
        if (head == null) {
            head = newnode;
        } else {
            Sum temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    void display() {
        Sum temp = head;
        if (temp == null) {
            System.out.println("Head is Null");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void check(int t) {
        Sum current = head;
        int fpos = 0;
        boolean found = false;

        while (current != null) {
            Sum temp = current.next;
            int spos = fpos + 1;
            while (temp != null) {
                if (current.data + temp.data == t) {
                    System.out.println("Indices: " + fpos + ", " + spos);
                    found = true;
                    return; // Exit after finding first match
                }
                temp = temp.next;
                spos++;
            }
            current = current.next;
            fpos++;
        }

        if (!found) {
            System.out.println("No pair found with sum = " + t);
        }
    }
}

public class two_sum_linkedlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TwoSum ts = new TwoSum();

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            ts.push(sc.nextInt());
        }

        System.out.print("Linked List: ");
        ts.display();

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        ts.check(target);
        sc.close();
    }
}
