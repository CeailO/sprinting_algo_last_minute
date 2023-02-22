package CircularArrayQueue;

public class CircularArrayQueue {
    private int[] circQueue;
    private int size, front, rear;

    // length of fixed size array
    private static final int CAPACITY = 16;

    // to create a circular array queue
    public CircularArrayQueue() {
        this.size = 0;
        this.circQueue = new int[CAPACITY];
        this.front = 0;
        this.rear = 0;
    }

    // to create a circular array queue with own size
    public CircularArrayQueue(int size) {
        this.size = size;
        this.circQueue = new int[size];
        this.front = 0;
        this.rear = 0;
    }

    // to add an element to the queue
    public void enqueue(int data) {
        if (size == circQueue.length) {
            System.out.println("Queue is full");
        } else {
            circQueue[rear] = data;
            rear = (rear + 1) % circQueue.length;
            size++;
        }
    }

    // remove an element from the queue
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
        } else {
            int data = circQueue[front];
            front = (front + 1) % circQueue.length;
            size--;
            return data;
        }
        return -1;
    }

    // check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // check if the queue is full
    public boolean isFull() {
        return size == circQueue.length;
    }

    // return the size of the queue
    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = front; i != rear; i = (i + 1) % circQueue.length) {
            sb.append(circQueue[i] + " ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        CircularArrayQueue queue = new CircularArrayQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);

        System.out.println("Queue list: " + queue.toString());

        System.out.println("DeQueue element: " + queue.dequeue());

        System.out.println("Queue list: " + queue.toString());
    }
}
