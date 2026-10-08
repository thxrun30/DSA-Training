// Q9. Search for an element.
public class CircularLinkedList_Q09_Search_for_an_element {
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
        int key = 40, pos = 1;
        boolean found = false;
        Node t = head;
        do {
            if (t.data == key) { found = true; break; }
            pos++;
            t = t.next;
        } while (t != head);
        if (found) System.out.println(key + " found at position " + pos);
        else System.out.println(key + " not found");
    }
}
