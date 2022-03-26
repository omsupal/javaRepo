import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

class Op implements UnaryOperator<String> {
	   public String apply(String str) {
	      return str.toUpperCase();
	   }
	}
public class ArrayListMethods{

	public static void main(String[] args) {

		ArrayList<Integer> arraylist = new ArrayList<>();
		ArrayList<Integer> arraylist1 = new ArrayList<>();
		arraylist.add(10);
		arraylist.add(15);
		arraylist.add(12);
		arraylist.add(14);
		arraylist.add(9);
		arraylist.add(8);
		arraylist.add(1);
		System.out.println(arraylist + " ---> arraylist.add(e)");
		System.out.println(arraylist.get(5) + " ---> arraylist.get(int index)");
		Collections.sort(arraylist);
		System.out.println(arraylist + " ---> sorted arraylist using collection.sort(list)");
		arraylist.add(2, 24);
		System.out.println(arraylist + " ---> arraylist.add(index,element);");
		arraylist1.add(1);
		arraylist1.add(4);
		arraylist1.add(5);
		arraylist1.add(2);
		arraylist1.add(3);
		System.out.println(arraylist1 + "--> arraylist1.add(e)");
		arraylist.addAll(arraylist1);
		System.out.println(arraylist + "---> arraylist.addAll(arraylist1);");
		arraylist.addAll(2, arraylist1);
		System.out.println(arraylist + "---> arraylist.addAll(index,list);");
		arraylist.clear();
		System.out.println(arraylist + "---> arraylist.clear();");

		arraylist = (ArrayList) arraylist1.clone();
		System.out.println(arraylist + "---> arraylist=(ArrayList)arraylist1.clone();");
		System.out.println(arraylist.contains(5) + " ---> arraylist.contains(5)");
		System.out.println(arraylist.indexOf(5) + " ---> arraylist.indexOf(5)");
		System.out.println(arraylist.isEmpty() + "  ---> arraylist.isEmpty()");
		// System.out.println(arraylist.lastIndexOf(10) + " --->
		// arraylist.lastIndexOf(10)");//same as indexOf

		Iterator<Integer> n = arraylist.iterator();
		System.out.println("\nThe iterator values" + " of list are: ");
		while (n.hasNext()) {
			System.out.print(n.next() + " ");
		}
		System.out.println();
		// using listIterator() method
		ListIterator<Integer> iterator = arraylist.listIterator();

		// Printing the iterated value
		System.out.println("\nUsing ListIterator():\n");
		while (iterator.hasNext()) {
			System.out.println("Value is : " + iterator.next());
		}
		
		System.out.println();
		// using listIterator() method
		ListIterator<Integer> iterator1 = arraylist.listIterator(2);

		// Printing the iterated value
		System.out.println("\nUsing ListIterator(int index):\n");
		while (iterator1.hasNext()) {
			System.out.println("Value is : " + iterator1.next());
		}
		
		System.out.println(arraylist+" --> before remove method");
		arraylist.remove(2);
		System.out.println(arraylist+" --> after arraylist.remove(3);");
		
		arraylist1.add(14);
		arraylist1.add(34);
		System.out.println(arraylist1+" --> before removeAll");
		arraylist1.removeAll(arraylist);
		System.out.println(arraylist1+"  --> arraylist1.removeAll(arraylist);");
		
		System.out.println(arraylist+" --> before removeIf(a -> (a % 3 == 0))");
		arraylist.removeIf(a -> (a % 3 == 0));// removing numbers divisible by 3
	     
		
	        // print list
	        for (int i : arraylist) {
	            System.out.print(i+" ");
	        }
	        System.out.println("--> after removeIf(a -> (a % 3 == 0))");
	        
	        
	        ArrayList<String> list = new ArrayList<>();
	        list.add("Java");
	        list.add("JavaScript");
	        list.add("CoffeeScript");
	        list.add("HBase");
	        list.add("OpenNLP");
	        System.out.println("Contents of the list: "+list);
	        list.replaceAll(new Op());
	        System.out.println("Contents of the list after replace operation: \n"+list);
	        
	        
	        arraylist.add(14);
			arraylist.add(34);
			System.out.println(arraylist1);
			System.out.println(arraylist+" --> before retain all");
	        arraylist.retainAll(arraylist1);
	        System.out.println(arraylist+" --> after retain all");
	        arraylist.set(0, 3);
	        System.out.println(arraylist+" --> after set(index,element)");
	        arraylist1.add(8);
			arraylist1.add(3);
	        System.out.println(arraylist1+" --> before sorting");
	        
	}
}
