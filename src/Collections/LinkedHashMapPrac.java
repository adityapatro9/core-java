package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPrac {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> m=new LinkedHashMap<>();
		
		m.put(2, "Arya");
		m.put(3,"Aditya");
		m.put(1, "Amisa");
		
		for(Map.Entry<Integer, String> mm:m.entrySet()) {
			System.out.println(mm.getKey()+" "+mm.getValue());
			
			mm.setValue(mm.getValue()+"!");
		}
		m.remove(3);
		System.out.println(m);
	}
}
