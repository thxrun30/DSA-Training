// Q9. Delete a node containing a given value.
public class DoublyLinkedList_Q09_Delete_a_node_containing_a_given_value {
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
        int value = 30;
        Node t = head;
        while (t != null && t.data != value) t = t.next;
        if (t == null) {
            System.out.println("Not found");
        } else {
            if (t.prev != null) t.prev.next = t.next;
            else head = t.next;
            if (t.next != null) t.next.prev = t.prev;
            else tail = t.prev;
        }
        forward();
    }
}
