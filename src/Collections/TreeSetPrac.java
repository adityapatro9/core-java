package Collections;

import java.util.TreeSet;

public class TreeSetPrac {

	public static void main(String[] args) {
		TreeSet<Integer> s=new TreeSet<>();
		s.add(10);
		// sorts in ascending order so comparable mustbe implemented
		// tree formate is used to store so access and retrival is fast
		
		TreeSet<Pokemon> t=new TreeSet<Pokemon>();
		
		t.add(new Pokemon("Pikachu","Electric",50,108,false));
		t.add(new Pokemon("Charlizard","Fire",80,202,false));
		t.add(new Pokemon("Balbasaur","Grass",55,112,true));
		
		//System.out.println(t);
	}

}
