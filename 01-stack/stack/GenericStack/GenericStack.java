package GenericStack;

class GenericStack<T> {
    private static final int MINIMUM_SIZE = 1024;

    // integer array type stack
    // private int[] stack = new int[MINIMUM_SIZE];

    // object array type stack
    private T[] stack = (T[]) new Object[MINIMUM_SIZE];
    private int size = 0;

    // check stack
    public T peek() {
        if (size <= 0)
            return null;

        T t = stack[--size];
        return t;
    }

    // add object type T to stack
    public void push(T value) {
        if (size == stack.length)
            grow();
        stack[size++] = value;
        return;
    }

    // remove object type T from stack
    public T pop() {
        if (size == 0) {
            return null;
        }
        T result = stack[size - 1];
        stack[size - 1] = null;
        size--; // shrink size
        return result;
    }

    // get object type T to stack index
    public T get(int index) {
        if (index >= 0 && index < size)
            return stack[index];
        else
            return null;
    }

    // remove object type T from stack
    public void remove(T value) {
        for (int i = 0; i < size; i++) {
            if (stack[i] == value) {
                stack[i] = null;
                size--;
                return; // recursion
            }
        }
    }

    private boolean remove(int index) {
        if (index >= 0 && index < size) {
            // shifting index down one spot
            for (int i = index; i < size - 1; i++) {
                stack[i] = stack[i + 1];
            }
            stack[size - 1] = null;
            size--;
            return true;
        }
        return false;
    }

    // grow the stack 50% by the given size
    private void grow() {
        T[] newStack = (T[]) new Object[stack.length * 2];
        for (int i = 0; i < size; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

    // shrink the stack 50% by the given size
    private void shrink() {
        T[] newStack = (T[]) new Object[stack.length / 2];
        for (int i = 0; i < size; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

    // clear the stack
    public void clear() {
        for (int i = 0; i < size; i++) {
            stack[i] = null;
        }
        size = 0;
    }

    // check if the stack contains the given value
    public boolean contains(T value) {
        for (int i = 0; i < size; i++) {
            if (stack[i] == value) {
                return true;
            }
        }
        return false;
    }

    // validate the stack size
    public boolean validate() {
        return size >= MINIMUM_SIZE;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(stack[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();
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

        GenericStack<String> stackStr = new GenericStack<>();
        stackStr.push("abc");
        stackStr.push("def");
        stackStr.push("ghi");
        stackStr.push("jkl");

        System.out.println("----- Print Strings -----");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        System.out.println("----- Print integers -----");
        System.out.println(stackStr.peek());
        System.out.println(stackStr.pop());
        System.out.println(stackStr.peek());
    }
}