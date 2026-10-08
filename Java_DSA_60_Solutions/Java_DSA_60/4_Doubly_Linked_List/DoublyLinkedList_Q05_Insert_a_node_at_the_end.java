// Q5. Insert a node at the end.
public class DoublyLinkedList_Q05_Insert_a_node_at_the_end {
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
        Node n = new Node(60);
        tail.next = n;
        n.prev = tail;
        tail = n;
        forward();
    }
}
