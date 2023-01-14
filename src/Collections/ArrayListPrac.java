package Collections;

import java.util.*;
import java.util.Iterator;

public class ArrayListPrac {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=1;i<=10;i++) {
			a.add(i*i + 2);
		}
		
		Iterator<Integer> l=a.iterator();
		
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		
		// String ArrayList
		System.out.println();
		
		ArrayList<String> str=new ArrayList<String>();
		str.add("Aradhya");
		str.add("Aditya");
		str.add("Patro");
		
		for(int i=0;i<str.size();i++) {
			System.out.println(str.get(i));
		}
		
		ArrayList<String> s=new ArrayList<>(str);
		
		s.add("Amisa");
		System.out.println();
		System.out.println(s.hashCode()+" "+str.hashCode());
		System.out.println(s);
		System.out.println(str);
		
		System.out.println();
		for(String t:s) {
			System.out.println(t.toUpperCase());
		}
		
		
		// sorting
		System.out.println();
		System.out.println(s);
		Collections.sort(s);
		System.out.println(s);
		
		//Stream way of printing
		s.stream().forEach(res -> System.out.print(res + " " ));
		
		
	}

}
