package queue.LinkedListQueue;

public class ListNode {
    public ListNode next;
    public int data;

    // to create new queue node
    public ListNode() {
        this.next = null;
        this.data = Integer.MIN_VALUE;
    }

    // to create node for storing data
    public ListNode(int data) {
        this.next = null;
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String toString() {
        return String.valueOf(data);
    }
}
