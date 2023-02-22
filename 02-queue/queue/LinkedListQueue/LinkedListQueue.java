package LinkedListQueue;
public class LinkedListQueue {
    private int length;
    private ListNode front, rear;

    // to create an empty queue
    public LinkedListQueue() {
        this.length = 0;
        this.front = null;
        this.rear = null;
    }

    // add data to the front of the queue
    public void enQueue(int data) {
        ListNode node = new ListNode(data);
        if (isEmpty()) {
            front = node;
            rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        length++;
    }

    // remove data from the front of the queue
    public int deQueue() throws Exception {
        if (isEmpty()) {
            return -1;
        }
        int data = front.data;
        front = front.next;
        length--;
        return data;
    }

    // check if the queue is empty
    private boolean isEmpty() {
        return (length == 0);
    }

    // return the length of the queue
    public int size() {
        return length;
    }

    public String toString() {
        String to = "";
        if (isEmpty()) {
            return to;
        }
        ListNode current = front;
        while (current != null) {
            to += current.data + " ";
            current = current.next;
        }
        return to;
    }

    public static void main(String[] args) throws Exception {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(7);
        queue.enQueue(8);
        queue.enQueue(9);
        queue.enQueue(10);
        queue.enQueue(11);
        queue.enQueue(12);
        queue.enQueue(13);
        queue.enQueue(14);
        queue.enQueue(15);
        queue.enQueue(16);
        queue.enQueue(17);
        queue.enQueue(18);
        queue.enQueue(19);
        queue.enQueue(20);
        queue.enQueue(21);
        System.out.println(queue.toString());
        queue.deQueue();
        System.out.println(queue.toString());
    }
}
