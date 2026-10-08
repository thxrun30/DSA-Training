// Q6. Insert a node at a specific position.
public class DoublyLinkedList_Q06_Insert_a_node_at_a_specific_position {
    static class Node {
        int data;
        Node prev, next;
        Node(int d) { data = d; }
    }

    static Node head, tail;

    static void forward() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }

    static void backward() {
        Node t = tail;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // build list: 10 <-> 20 <-> 30 <-> 40 <-> 50
        for (int i = 1; i <= 5; i++) {
            Node n = new Node(i * 10);
            if (head == null) {
                head = n;
                tail = n;
            } else {
                tail.next = n;
                n.prev = tail;
                tail = n;
            }
        }
        int pos = 3, value = 25; // 1-based position
        Node n = new Node(value);
        if (pos == 1) {
            n.next = head;
            head.prev = n;
            head = n;
        } else {
            Node t = head;
            for (int i = 1; i < pos - 1; i++) t = t.next;
            n.next = t.next;
            n.prev = t;
            if (t.next != null) t.next.prev = n;
            else tail = n;
            t.next = n;
        }
        forward();
    }
}
