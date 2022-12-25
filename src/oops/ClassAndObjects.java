package oops;

class CSE {

	String name;
	String id;
	static String branch = "CSE";

	public CSE(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "CSE [name=" + name + ", id=" + id + "]";
	}

}

public class ClassAndObjects {

	public static void main(String[] args) {
		
		System.out.println(new CSE("Aradhya","1"));

	}

}
