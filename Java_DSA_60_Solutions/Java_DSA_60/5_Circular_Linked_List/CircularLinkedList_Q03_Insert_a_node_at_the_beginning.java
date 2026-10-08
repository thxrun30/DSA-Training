// Q3. Insert a node at the beginning.
public class CircularLinkedList_Q03_Insert_a_node_at_the_beginning {
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
        Node n = new Node(5);
        Node last = head;
        while (last.next != head) last = last.next;
        n.next = head;
        last.next = n;
        head = n;
        Node t = head;
        do {
            System.out.print(t.data + " ");
            t = t.next;
        } while (t != head);
        System.out.println();
    }
}
