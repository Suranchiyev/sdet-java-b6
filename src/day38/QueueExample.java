package day38;

import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
	public static void main(String[] args) {
		// Queue is FIFO based data structure
		// FIFO - First In, First Out
		// offer(element) - it adds new element to the queue
		// poll()         - it gets oldest element from the queue(it removes from the queue)
		
		Queue<String> queue = new LinkedList<>();
		queue.offer("Aidar");
		queue.offer("Agatha");
		queue.offer("Burkhon");
		queue.offer("Chris");
		
		System.out.println(queue);
		
		String element = queue.poll();
		System.out.println(element); // Aidar
		System.out.println(queue); // [Agatha, Burkhon, Chris]
		
		// peek() gets next element from the queue without removing it
		System.out.println(queue.peek()); // Agatha
		System.out.println(queue); // [Agatha, Burkhon, Chris]
		
	}
}
