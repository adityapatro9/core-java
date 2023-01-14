package Collections;

import java.util.*;

public class InitialTheory {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		List<Integer> l2=new LinkedList<>();
		List<Integer> l3=new Vector<>();
		List<Integer> l4=new Stack<>();
		
		for(int i=1;i<=10;i++) {
			l1.add(i);
			l2.add(i*i);
			l3.add(2*i);
			l4.add(i*i*i);
		}
		
		for(int i=0;i<l2.size();i++) {
			System.out.print(l2.get(i)+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(l3.toArray()));
	}
}
