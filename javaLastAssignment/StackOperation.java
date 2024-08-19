package javaLastAssignment;
import java.util.Stack;
//Implement a simple stack using the Stack class in Java. Perform push, pop, and peek operations.
public class StackOperation {

	public static void main(String[] args) {
		Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element after pushes: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pops: " + stack.peek());
        System.out.println("Remaining elements in the stack: " + stack);

	}

}
