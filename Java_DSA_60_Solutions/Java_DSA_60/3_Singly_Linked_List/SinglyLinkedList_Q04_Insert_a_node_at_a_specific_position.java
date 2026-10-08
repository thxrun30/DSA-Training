// Q4. Insert a node at a specific position.
public class SinglyLinkedList_Q04_Insert_a_node_at_a_specific_position {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    static Node head;

    static void display() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " -> ");
            t = t.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // build list: 10 -> 20 -> 30 -> 40 -> 50
        for (int i = 1; i <= 5; i++) {
            Node n = new Node(i * 10);
            if (head == null) head = n;
            else {
                Node t = head;
                while (t.next != null) t = t.next;
                t.next = n;
            }
        }
        int pos = 3, value = 25; // 1-based position
        Node n = new Node(value);
        if (pos == 1) {
            n.next = head;
            head = n;
        } else {
            Node t = head;
            for (int i = 1; i < pos - 1; i++) t = t.next;
            n.next = t.next;
            t.next = n;
        }
        display();
    }
}
