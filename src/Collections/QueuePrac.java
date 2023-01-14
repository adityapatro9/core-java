package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePrac {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();//Queue is a interface
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}

}
