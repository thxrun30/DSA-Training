// Q6. Delete the first node.
public class CircularLinkedList_Q06_Delete_the_first_node {
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
        Node last = head;
        while (last.next != head) last = last.next;
        head = head.next;
        last.next = head;
        Node t = head;
        do {
            System.out.print(t.data + " ");
            t = t.next;
        } while (t != head);
        System.out.println();
    }
}
