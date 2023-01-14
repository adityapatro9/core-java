package Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetPrac {

	public static void main(String[] args) {
		LinkedHashSet<Integer> s=new LinkedHashSet<>();
		
		int[] arr= {4,6,3,1,6,8,9,5,32,6,7,8,4,3,2,8,9,0,1,4,7,6,3,8,9,12,23,3,2,12,3,2,13,23,4,7,6,7};
		
		for(int a:arr) {
			s.add(a);
		}
		
		for(int a:s) {
			System.out.print(a+" ");
		}
		
		s.remove(32);
		System.out.println();
		for(int a:s) {
			System.out.print(a+" ");
		}
		
	}

}
