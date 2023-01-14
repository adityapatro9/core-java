package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {

	public static void main(String[] args) {
		HashMap<Integer,String> m=new HashMap<>();
		m.put(1, "Aditya");
		m.put(2, "Aradhya");
		m.put(3, "Amisa");
		
		for(Map.Entry<Integer, String> a:m.entrySet()) {//entrySet changes the map to be iterable
			System.out.println(a.getKey()+" -> "+a.getValue());
		}
		
		m.put(2, "Papu");
		System.out.println();
		
		//no duplicates keys
		for(Map.Entry<Integer, String> a:m.entrySet()) {//entrySet changes the map to be iterable
			System.out.println(a.getKey()+" -> "+a.getValue());
		}
		
		m.putIfAbsent(3, "Ami");
		System.out.println();
		
		for(Map.Entry<Integer, String> a:m.entrySet()) {//entrySet changes the map to be iterable
			System.out.println(a.getKey()+" -> "+a.getValue());
		}	
		
		m.replace(3, "Ami");
		System.out.println();
		
		for(Map.Entry<Integer, String> a:m.entrySet()) {//entrySet changes the map to be iterable
			System.out.println(a.getKey()+" -> "+a.getValue());
		}	
	}

}
