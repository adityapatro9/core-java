package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPrac {

	public static void main(String[] args) {
		HashSet<Integer> s=new HashSet<>();
		int[] arr= {4,6,3,1,6,8,9,5,32,6,7,8,4,3,2,8,9,0,1,4,7,6,3,8,9,12,23,3,2,12,3,2,13,23,4,7,6,7};
	
		for(int a:arr) {
			s.add(a);
		}
		
		Iterator<Integer> it=s.iterator();
		//Collections.sort(s);
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}

}
