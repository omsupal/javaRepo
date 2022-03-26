import java.util.Stack;

public class StackMethods {

	public static void main(String[] args) {
		// Default initialization of Stack
		Stack stack1 = new Stack();

		// Initialization of Stack
		// using Generics
		Stack<String> stack2 = new Stack<String>();

		// pushing the elements
		stack1.push(4);
		stack1.push("omkar");
		stack1.push("supal");
		stack1.push('c');
		stack1.push(10.2);

		stack2.push("vanix");
		stack2.push("designers");
		stack2.push("Graphics");

		// Printing the Stack Elements
		System.out.println(stack1);
		System.out.println(stack2);
		System.out.println("--------------------------------------------------------------");
		// Creating an empty Stack
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println(stack.empty() + "---> stack.empty()");
		// Use add() method to add elements
		stack.push(10);
		stack.push(15);
		stack.push(30);
		stack.push(20);
		stack.push(5);

		// Displaying the Stack
		System.out.println("Initial Stack: " + stack);

		// Removing elements using pop() method
		System.out.println("Popped element: " + stack.pop());
		System.out.println("Popped element: " + stack.pop());

		// Displaying the Stack after pop operation
		System.out.println("Stack after pop operation " + stack);

		// remaining methods are same as vector
	}

}
