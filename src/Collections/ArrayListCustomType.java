package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Pokemon implements Comparable<Pokemon>{
	String name;
	String type;
	int level;
	float HP;
	boolean isWild;

	public Pokemon(String name, String type, int level, float hP, boolean isWild) {
		super();
		this.name = name;
		this.type = type;
		this.level = level;
		HP = hP;
		this.isWild = isWild;
	}

	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", type=" + type + ", level=" + level + ", HP=" + HP + ", isWild=" + isWild
				+ "]";
	}

	@Override
	public int compareTo(Pokemon o) {
		if (this.level > o.level) 
			return -1;
		else if (this.level < o.level)
			return 1;
		else 
			return 0;
	}

	
	

}

public class ArrayListCustomType {

	public static void main(String[] args) {
		List<Pokemon> p = new ArrayList<>();

		p.add(new Pokemon("Pikachu", "Electric", 50, 108, false));
		p.add(new Pokemon("Charlizard", "Fire", 80, 202, false));
		p.add(new Pokemon("Balbasaur", "Grass", 55, 112, true));
		
		Collections.sort(p,(a,b)->a.name.compareTo(b.name));

		for (Pokemon t : p) {
			System.out.println(t);
		}
	}

}
