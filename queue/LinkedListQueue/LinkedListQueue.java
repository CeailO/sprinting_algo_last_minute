package queue.LinkedListQueue;

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
    public void enqueue(int data) {
        ListNode node = new ListNode(data);
        if (isEmpty()) {
            this.front = node;
            this.rear = node;
        } else {
            this.rear.next = node;
            this.rear = node;
        }
        this.length++;
    }

    // remove data from the front of the queue
    public int dequeue() throws Exception {
        if (isEmpty()) {
            return -1;
        }
        int data = this.front.data;
        this.front = this.front.next;
        this.length--;
        return data;
    }

    // check if the queue is empty
    private boolean isEmpty() {
        return (length == 0);
    }
}
