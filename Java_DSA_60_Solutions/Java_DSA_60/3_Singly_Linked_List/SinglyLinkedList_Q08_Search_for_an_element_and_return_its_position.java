// Q8. Search for an element and return its position.
public class SinglyLinkedList_Q08_Search_for_an_element_and_return_its_position {
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
        int key = 40, pos = 1;
        boolean found = false;
        Node t = head;
        while (t != null) {
            if (t.data == key) {
                found = true;
                break;
            }
            pos++;
            t = t.next;
        }
        if (found) System.out.println(key + " found at position " + pos);
        else System.out.println(key + " not found");
    }
}
