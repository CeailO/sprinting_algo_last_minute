package LinkedListStack;

public class LinkedListStack {
    private int length; // size of the list
    private ListNode top;

    // empty stack
    public LinkedListStack() {
        length = 0;
        top = null;
    }

    // check stack
    public int peek() throws Exception {
        if (isEmpty()) {
            return -1;
        }
        return top.data;
    }

    // check if stack is empty
    private boolean isEmpty() {
        return (length == 0);
    }

    // return number of elements in stack
    public int size() {
        return length;
    }

    // add data to the top of stack
    public void push(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        length++;
    }

    // remove data from the top of stack
    public int pop() throws Exception {
        if (isEmpty()) {
            return -1;
        }
        int data = top.data;
        top = top.next;
        length--;
        return data;
    }

    // display stack
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stack: ");
        for (int i = 0; i < length; i++) {
            sb.append(top.data + " ");
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        LinkedListStack stack = new LinkedListStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.push(16);
        stack.push(17);
        stack.push(18);
        stack.push(19);
        stack.push(20);
        stack.push(21);

        System.out.println("----- Linked List Implementation -----");
        stack.toString();
        System.out.println("Stack size: " + stack.size());

        stack.pop();
        stack.pop();

        System.out.println("Stack top element: " + stack.peek());
    }
}
