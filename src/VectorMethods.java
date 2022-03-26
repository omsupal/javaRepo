import java.util.Vector;

public class VectorMethods {

	public static void main(String[] args) {
		Vector vector=new Vector();
		vector.add("omkar");
		vector.add("subhash");
		vector.add("supal");
		vector.add(1);
		vector.add(5);
		vector.add(3);
		vector.add(33);
		System.out.println(vector.capacity()+" --> Current capacity of vector \"vector.capacity()\"");
		vector.ensureCapacity(20);		
		System.out.println(vector.capacity()+" --> Current capacity of vector \"vector.ensureCapacity(int mincapacity)\"");
	
		System.out.println(vector.size()+"--> size of vector");
		System.out.println(vector);
		vector.setSize(10);
		System.out.println(vector.size()+"--> size of vector after vector.setSize(int newsize)");
		System.out.println(vector);
		System.out.println(vector.subList(2, 6)+" ---> after ector.subList(2, 6) ");
		
		//remaining methods are same as arraylist
	}

}
