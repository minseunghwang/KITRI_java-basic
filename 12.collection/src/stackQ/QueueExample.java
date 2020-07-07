package stackQ;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.offer(10);
		q.offer(20);
		q.offer(30);
		
		System.out.println(q);
		
		System.out.println(q.poll());
		
		System.out.println(q);
	}
}
