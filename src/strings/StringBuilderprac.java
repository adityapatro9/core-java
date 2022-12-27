package strings;

public class StringBuilderprac {
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("aradhya");
		
		System.out.println(s);
		System.out.println(s.hashCode());
		s.append(" Patro");
		System.out.println(s.hashCode());
		
		System.out.println(s.toString().hashCode()+" "+s.toString().hashCode());
		System.out.println(s.toString().hashCode()+" "+(s.toString().hashCode()+"12").hashCode() );
	}
}
