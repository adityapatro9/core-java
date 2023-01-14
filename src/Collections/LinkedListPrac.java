package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPrac {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<>();
		
		l.add("First");
		l.add("Second");
		l.add("Third");
		l.add("Fourth");
		l.add("Fifth");
		
		Iterator<String> it=l.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" -> ");
		}System.out.println("NULL");
		
		LinkedList<Pokemon> ll=new LinkedList<Pokemon>();
		ll.add(new Pokemon("Pikachu","Electric",50,108,false));
		ll.add(new Pokemon("Charlizard","Fire",80,202,false));
		ll.add(new Pokemon("Balbasaur","Grass",55,112,true));
		
		System.out.println(ll.peekFirst()+" "+ll.peekLast());
	}

}
