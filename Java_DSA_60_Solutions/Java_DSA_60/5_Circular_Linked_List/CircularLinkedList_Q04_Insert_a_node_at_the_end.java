// Q4. Insert a node at the end.
public class CircularLinkedList_Q04_Insert_a_node_at_the_end {
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
        Node n = new Node(60);
        Node last = head;
        while (last.next != head) last = last.next;
        last.next = n;
        n.next = head;
        Node t = head;
        do {
            System.out.print(t.data + " ");
            t = t.next;
        } while (t != head);
        System.out.println();
    }
}
