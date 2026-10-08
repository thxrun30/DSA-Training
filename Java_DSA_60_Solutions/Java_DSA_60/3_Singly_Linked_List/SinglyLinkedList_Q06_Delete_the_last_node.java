// Q6. Delete the last node.
public class SinglyLinkedList_Q06_Delete_the_last_node {
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
        if (head.next == null) {
            head = null;
        } else {
            Node t = head;
            while (t.next.next != null) t = t.next;
            t.next = null;
        }
        display();
    }
}
