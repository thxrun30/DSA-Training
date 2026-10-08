// Q5. Insert a node at a specific position (1-based).
public class CircularLinkedList_Q05_Insert_a_node_at_a_specific_position {
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
        int pos = 3, value = 25;
        Node n = new Node(value);
        if (pos == 1) {
            Node last = head;
            while (last.next != head) last = last.next;
            n.next = head;
            last.next = n;
            head = n;
        } else {
            Node t = head;
            for (int i = 1; i < pos - 1; i++) t = t.next;
            n.next = t.next;
            t.next = n;
        }
        Node t = head;
        do {
            System.out.print(t.data + " ");
            t = t.next;
        } while (t != head);
        System.out.println();
    }
}
