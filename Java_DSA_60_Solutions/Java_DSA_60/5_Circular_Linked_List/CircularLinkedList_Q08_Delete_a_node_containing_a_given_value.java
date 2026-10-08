// Q8. Delete a node containing a given value.
public class CircularLinkedList_Q08_Delete_a_node_containing_a_given_value {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    public static void main(String[] args) {
        Node head = null, tail = null;
        for (int i = 1; i <= 5; i++) {
            Node n = new Node(i * 10);
            if (head == null) head = n; else tail.next = n;
            tail = n;
            tail.next = head;
        }
        int value = 30;
        if (head.data == value) {
            Node last = head;
            while (last.next != head) last = last.next;
            head = head.next;
            last.next = head;
        } else {
            Node t = head;
            while (t.next != head && t.next.data != value) t = t.next;
            if (t.next != head) t.next = t.next.next;
            else System.out.println("Not found");
        }
        Node t = head;
        do {
            System.out.print(t.data + " ");
            t = t.next;
        } while (t != head);
        System.out.println();
    }
}
