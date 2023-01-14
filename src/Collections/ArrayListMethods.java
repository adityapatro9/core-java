package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<>();
		
		l.add("Arya");
		l.add("aradhya");
		l.add("manisha");
		l.add("patro");
		l.add("Vikrant");
		l.add("Arjun");
		l.add("abhimanyu");
		
		// shallow copy
		//ArrayList<String> tt=(ArrayList<String>) l.clone();
		//System.out.println(tt.hashCode()+" "+l.hashCode());
		
		System.out.println(l.isEmpty());
		
		System.out.println(l.indexOf("aradhya"));
		
		System.out.println(l.set(1, "Ben"));
		System.out.println(l.get(1));
		
		//System.out.println(l.subList(1, 4));
		
		// Stream way
		List<String> startsA = l.stream().filter(name -> name.startsWith("A") || name.startsWith("a")).collect(Collectors.toList());
		System.out.println(startsA);
	}

}
