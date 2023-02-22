package LinkedListByStack;

public class ListNode {
    public ListNode next;
    public int data;

    // to create empty node
    public ListNode() {
        this.next = null;
        this.data = Integer.MIN_VALUE;
    }

    // to create node for storing data
    public ListNode(int data) {
        this.next = null;
        this.data = data;
    }

    // return node that follows this one
    public ListNode getNext() {
        return next;
    }

    // set the node that follows this one
    public void setNext(ListNode next) {
        this.next = next;
    }

    // return the data stored in this node
    public int getData() {
        return data;
    }

    // set the data stored in this node
    public void setData(int data) {
        this.data = data;
    }

    // return string of data
    public String toString() {
        return data + "";
    }

}