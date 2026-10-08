// Q27. For a circular queue of size 5, insert 10, 20, 30, delete two elements, then insert 40, 50, 60. Display the queue.
public class CircularQueue_Q27_For_a_circular_queue_of_size_5_insert_10_20_30_delete_two_elements_then_insert_40_50_60_Display_the_queue {
    static class CircularQueue {
        int[] arr;
        int front = 0, rear = -1, count = 0, size;

        CircularQueue(int size) {
            this.size = size;
            arr = new int[size];
        }

        boolean isFull() {
            return count == size;
        }

        boolean isEmpty() {
            return count == 0;
        }

        void enqueue(int x) {
            if (isFull()) {
                System.out.println("Queue is full, cannot insert " + x);
                return;
            }
            rear = (rear + 1) % size;
            arr[rear] = x;
            count++;
        }

        int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int x = arr[front];
            front = (front + 1) % size;
            count--;
            return x;
        }

        void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print("Queue (front to rear): ");
            for (int i = 0, idx = front; i < count; i++, idx = (idx + 1) % size) {
                System.out.print(arr[idx] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        q.dequeue();
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.display();
    }
}
