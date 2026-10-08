// Q10. Count the number of nodes.
public class CircularLinkedList_Q10_Count_the_number_of_nodes {
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
        int count = 0;
        Node t = head;
        do {
            count++;
            t = t.next;
        } while (t != head);
        System.out.println("Number of nodes: " + count);
    }
}
