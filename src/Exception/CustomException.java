package Exception;



class StringWithAryaName extends Exception{
	
	private static final long serialVersionUID = 1L;

	StringWithAryaName(){
		super("You Named The String Arya");
	}
}

public class CustomException {

	public static void main(String[] args) throws StringWithAryaName {
		String name="arya";
		
		if(name.equalsIgnoreCase("Arya")) {
			throw new StringWithAryaName();
		}else {
			System.out.println("The Name = "+name);
		}
	}

}
