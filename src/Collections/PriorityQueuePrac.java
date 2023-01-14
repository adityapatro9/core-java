package Collections;

import java.util.PriorityQueue;

public class PriorityQueuePrac {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();// can give comparator to store
		PriorityQueue<Integer> q=new PriorityQueue<Integer>((a,b)-> b-a);//lambda function for comparable
		
		
		for(int i=10;i<=50;i=i+10) {
			pq.add(i);
			q.add(i);
		}
		
		while(!pq.isEmpty()) {
			System.out.println(pq.peek());
			pq.remove();
		}
		
		System.out.println();
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}

}
