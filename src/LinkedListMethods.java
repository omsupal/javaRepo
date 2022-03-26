import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("Hello");
		list.add(2);
		list.add("Chocolate");
		list.add("10");
		System.out.println("LinkedList:" + list);
		list.addFirst("supal");
		System.out.println(list + " ---> list.addFirst(\"supal\"):");
		list.addLast("Omkar");
		System.out.println(list + " ---> list.addLast(\"Omkar\")");

		System.out.println("\ndescendingIterator\n");
		Iterator x = list.descendingIterator();

		// print list with descending order
		while (x.hasNext()) {
			System.out.println("Value is : " + x.next());
		}

		System.out.println("\n" + list.element() + " --> list.element()");
		System.out.println(list.getFirst()+" --> get first");
		System.out.println(list.getLast()+" --> get last");
		System.out.println("________________________________________________________\n"+"dequeue implemented method\n"+"________________________________________________________\n");
		list.offer(123);// its like a add method
		System.out.println(list);
		list.offerFirst("FirstOffer");
		list.offerLast("LastOffer");
		System.out.println(list);
		System.out.println(list.peek()+"  --> peek()");
		System.out.println(list.peekFirst()+" --> peek first");
		System.out.println(list.peekLast()+" --> peek last");
		System.out.println(list.poll()+"  --> poll()");
		System.out.println(list+" --> after poll");
		System.out.println(list.pop());
		System.out.println(list+" --> after pop");
		list.push(143);
		System.out.println(list+" --> after push");
		list.remove();
		System.out.println(list+" --> after list.remove()");
		
		//remaining methods are same as array list
		
	}

}
