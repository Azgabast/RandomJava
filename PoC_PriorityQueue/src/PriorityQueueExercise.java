import java.util.PriorityQueue;

public class PriorityQueueExercise {

	public static void main(String[] args){
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(5);
		
		pq.offer(1);
		pq.offer(3);
		pq.offer(6);
		pq.offer(4);
		pq.offer(5);
		pq.offer(8);
		
		//pq.poll();
		
		System.out.println(pq.toArray()[4]);
	}
}
