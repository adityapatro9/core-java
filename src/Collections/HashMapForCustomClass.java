package Collections;

import java.util.HashMap;

class Player {
	String name;
	int id;
	
	public Player(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", id=" + id + "," + "] \n";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
		// hash(id)
	}
	//the formula for the has code algo is s[0]*31^n-1+s[1]*31^n-2+.....s[n-1]
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}

public class HashMapForCustomClass {

	public static void main(String[] args) {
		
		HashMap<Player,String> hmp = new HashMap<>();
		hmp.put(new Player("Ronaldo",7), "ManU");
		hmp.put(new Player("Messi",10), "PSG");
		hmp.put(new Player("Neymar",10), "PSG");
		hmp.put(new Player("Mbappe",7), "PSG");
		hmp.put(new Player("Mbappe",7), "PSG");
		System.out.println(hmp);

	}

}
