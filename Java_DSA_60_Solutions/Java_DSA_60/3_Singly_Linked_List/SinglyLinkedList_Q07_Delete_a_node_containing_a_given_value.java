// Q7. Delete a node containing a given value.
public class SinglyLinkedList_Q07_Delete_a_node_containing_a_given_value {
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
        int value = 30;
        if (head.data == value) {
            head = head.next;
        } else {
            Node t = head;
            while (t.next != null && t.next.data != value) t = t.next;
            if (t.next != null) t.next = t.next.next;
            else System.out.println("Not found");
        }
        display();
    }
}
