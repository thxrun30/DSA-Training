// Q4. Insert a node at the beginning.
public class DoublyLinkedList_Q04_Insert_a_node_at_the_beginning {
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
        Node n = new Node(5);
        n.next = head;
        head.prev = n;
        head = n;
        forward();
    }
}
