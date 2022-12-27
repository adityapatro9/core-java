package strings;

public class StringInitials {
	public static void main(String[] args) {
		String s="Aradhya";
		String r=new String("patro");
		char[] c= {' ',' ','a','e','i','o','u',' '};
		String t=new String(c);
		
		System.out.println(s+" "+r+" "+t);
		
		String con=s+r;
		String cat=s.concat(t);
		
		System.out.println(con+" "+cat);
		
//		indent gives the number of spaces as mention in the parameter
		System.out.println(s+r.indent(2));
		
// 		repeat the whole string the specified amount off time
		System.out.println(s.repeat(3));
		
//		returns the string if it exist in string pool else it creates the string
//		string in the string pool and returns
		// change the referce to pool area string not the heap
		System.out.println(r.intern());
		
//		Check whether it starts with the sequence or not
		System.out.println(r.startsWith("Pat"));
		
//		remove the leading and ending blank spaces
		System.out.println(t);
		System.out.println(t.trim());
		
		// Shows slow capability of strings with concat 
		
		String n1 = "Rbi";
		n1 = n1.concat("icici"); // Rbiicici
		
	}
}
