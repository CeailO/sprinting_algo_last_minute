package DynamicArrayStack;

public class DynamicArrayStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // create a new array stack
    public DynamicArrayStack(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new int[maxSize];
        top = -1;
    }

    // add data to the top of stack
    public void push(int data) {
        if (!isFull()) {
            top++;
            stackArray[top] = data;
        } else {
            resize(maxSize * 2);
            push(data);
        }
    }

    // remove data from the top of stack
    public int pop() {
        if (!isEmpty()) {
            top--;
            return stackArray[top];
        }
        if (top < maxSize / 4) {
            resize(maxSize / 2);
            return pop();
        } else {
            System.out.println("The stack is already empty");
            return -1;
        }
    }

    // check stack
    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        }
        System.out.println("The stack is already empty");
        return -1;
    }

    private boolean isEmpty() {
        return (top == -1);
    }

    // resize the array size
    private void resize(int newSize) {
        int[] transferArray = new int[newSize];

        for (int i = 0; i < stackArray.length; i++) {
            transferArray[i] = stackArray[i];
            stackArray = transferArray;
        }
        maxSize = newSize;
    }

    // check if the stack is full
    private boolean isFull() {
        return (top + 1 == maxSize);
    }

    // make the stack empty
    public void makeEmpty() {
        top = -1;
    }

    public static void main(String[] args) {
        DynamicArrayStack stack = new DynamicArrayStack(10);
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
        stack.push(22);
        stack.push(23);
        stack.push(24);

        System.out.println("----- Dynamic Stack Array Implementation -----");
        System.out.println("Stack empty?: " + stack.isEmpty());
        System.out.println("Check stack: " + stack.peek());
        System.out.println("Pop element: " + stack.pop());
        System.out.println("Check stack: " + stack.peek());
    }
}
