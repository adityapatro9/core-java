package Collections;

import java.util.*;

public class StackPrac {

	public static void main(String[] args) {
		Stack<String> st=new Stack<>();
		
		st.push("Aradhya");
		st.push("Aditya");
		st.push("Amisa");
		st.push("Patro");
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		
		System.out.println(st.peek());
	}

}
