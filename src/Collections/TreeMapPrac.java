package Collections;

import java.util.*;

public class TreeMapPrac {

	public static void main(String[] args) {
		TreeMap<Integer,String> m=new TreeMap<>();
		
		m.put(2, "Arya");
		m.put(3,"Aditya");
		m.put(1, "Amisa");
		
		for(Map.Entry<Integer, String> mm:m.entrySet()) {
			System.out.println(mm.getKey()+" "+mm.getValue());
		}
		
		m.remove(2);
		System.out.println(m);
		
		TreeMap<Pokemon,Integer> k=new TreeMap<>((a,b)->a.name.compareTo(b.name));//comparator using lambda function
		
		k.put(new Pokemon("Pikachu","Electric",108,200,false), 2);
		k.put(new Pokemon("Charmander","Fire",109,199,false), 1);
		k.put(new Pokemon("Balbasaur","Grass",104,178,true), 3);
		
		System.out.println(k);
	}

}
