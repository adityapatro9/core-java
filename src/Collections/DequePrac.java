package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequePrac {

	public static void main(String[] args) {
		// double ended Queue
		Deque<String> d=new ArrayDeque<String>();
		d.add("Aradhya");
		d.add("arya");
		d.add("End");
		
		System.out.println(d.getFirst()+" "+d.getLast());
		System.out.println(d.size());
		System.out.println(d.pollFirst());
		System.out.println(d.pollLast());
		System.out.println(d.size());
		
	}

}
