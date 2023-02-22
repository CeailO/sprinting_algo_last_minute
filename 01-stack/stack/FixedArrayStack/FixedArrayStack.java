package FixedArrayStack;

class FixedArrayStack {
    private int capacity;
    private static final int CAPACITY = 16;
    protected int[] stackArray;
    protected int top = -1;

    // create a new array stack
    public FixedArrayStack(int capacity) {
        this.capacity = capacity;
        stackArray = new int[capacity];
    }

    // add data to the top of stack
    public int push(int data) throws Exception {
        if (size() == capacity)
            return -1;
        return stackArray[++top] = data;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public int top() throws Exception {
        if (isEmpty())
            return -1;
        return stackArray[top];
    }

    // remove data from the top of stack
    public int pop() throws Exception {
        int data;
        if (isEmpty())
            return -1;
        data = stackArray[top];
        stackArray[top--] = Integer.MIN_VALUE;
        return data;
    }

    public String toString() {
        // String s;
        // s = "[";
        // if (size() > 0)
        // s += stackArray[0];
        // if (size() > 1)
        // for (int i = 1; i < size(); i++) {
        // s += ", " + stackArray[i];
        // }
        // return s + "]";
        StringBuilder sb = new StringBuilder();
        for (int i = top; i >= 0; i--) {
            sb.append(stackArray[i]).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        FixedArrayStack stack = new FixedArrayStack(CAPACITY);
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

        System.out.println("----- Fixed Stack Array Implementation -----");
        System.out.println("Print stack elements before pop(): " + stack.toString());
        System.out.println("size of stack: " + stack.size());
        System.out.println("Pop element: " + stack.pop());
        System.out.println("Pop element after pop(): " + stack.pop());
        System.out.println("Pop element after pop(): " + stack.pop());

        System.out.println("Print stack elements: " + stack.toString());
    }
}
