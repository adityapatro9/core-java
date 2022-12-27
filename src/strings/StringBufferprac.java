package strings;

public class StringBufferprac {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Arya");
		
		System.out.println(s.reverse());
		System.out.println(s.capacity());
		System.out.println(s.hashCode());
		s.append("Patro");
		System.out.println(s.hashCode());
		
		
		String ss=new String("arya");
		System.out.println(ss.hashCode());
		ss+="Patro";
		System.out.println(ss.hashCode());
	}

}
