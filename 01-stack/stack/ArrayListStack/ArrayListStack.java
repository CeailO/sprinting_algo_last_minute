package ArrayListStack;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStack {
    List<Integer> stackList; // create list of integers

    public ArrayListStack() {
        stackList = new ArrayList<>(); // create array full of list
    }

    // add a list of data to the stack
    public void push(int data) {
        stackList.add(data);
    }

    // remove a list to the stack
    public int pop() {
        if (!isEmpty()) {
            return stackList.remove(stackList.size() - 1);
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    // check if the stack is empty
    public boolean isEmpty() {
        return false;
    }

    // return top list of stack
    int peek() {
        return stackList.get(stackList.size() - 1);
    }

    public static void main(String[] args) {
        ArrayListStack stack = new ArrayListStack();
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

        System.out.println("----- Array of List Stack Implementation -----");
        System.out.println("Is stack empty?: " + stack.isEmpty());
        System.out.println("Current stack: " + stack.peek());
        System.out.println("Pop list from array: " + stack.pop());
        System.out.println("Current stack: " + stack.peek());
        System.out.println("Pop list from array: " + stack.pop());
    }
}
