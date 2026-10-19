/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

public class StackArray {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor
    public StackArray(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    // Push an element onto the stack
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack is full!");
            return;
        }

        stack[++top] = value;
    }

    // Remove an element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        }

        return stack[top--];
    }

    // View the top element
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        }

        return stack[top];
    }

    // Display all stack elements
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }

        System.out.print("Stack elements: ");

        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }

        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        // Create a stack with capacity of 5
        StackArray stack = new StackArray(5);

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println();

        // Display stack
        stack.display();

        System.out.println();

        // View top element
        System.out.println("Top element: " + stack.peek());

        System.out.println();

        // Remove an element
        System.out.println("Removed: " + stack.pop());

        System.out.println();

        // View top again
        System.out.println("Top element: " + stack.peek());

        System.out.println();

        // Display stack again
        stack.display();
    }
}

    