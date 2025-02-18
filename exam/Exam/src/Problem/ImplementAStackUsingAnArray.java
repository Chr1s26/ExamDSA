package Problem;

import java.util.Scanner;
import java.util.Stack;

public class ImplementAStackUsingAnArray {

	private int[] arr;
	private int top;
	private int capacity;

	ImplementAStackUsingAnArray(int size) {
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	public void push(int x) {
		if (top == capacity - 1) {
			System.out.println("Stack Overflow");
			return;
		}
		System.out.print("Push:  " + x);
		top++;
		arr[top] = x;
	}

	public void peek() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return;
		}
		System.out.println("Top: " + arr[top]);
	}

	public void pop() {
		if (top == -1) {
			System.out.println("Stack Underflow");
			return;
		}
		System.out.println("Popped " + arr[top]);
		top--;
	}

	public boolean isEmpty() {
		return top == -1;
	}


	public boolean isFull() {
		return top == capacity - 1;
	}

	public static void main(String[] args) {
		
		ImplementAStackUsingAnArray stack = new ImplementAStackUsingAnArray(5);

		stack.push(10);
		System.out.print("\n");
		stack.push(20);
		System.out.print("\n");
		stack.push(30);
		System.out.print("\n");
		stack.peek();
		System.out.print("\n");
		stack.pop();
		System.out.print("\n");
		stack.peek();
		System.out.print("\n");
		System.out.print(stack.isEmpty());
		System.out.print("\n");
		stack.pop();
		System.out.print("\n");
		stack.pop();
		System.out.print("\n");
		stack.pop();

	}

}
