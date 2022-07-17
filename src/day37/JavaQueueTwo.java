package day37;

import java.util.Queue;
import java.util.LinkedList;

public class JavaQueueTwo {
	public static void main(String[] args) {
		// Creates a PriorityQueue with the default initial capacity (11) that orders its elements 
		// according to their natural ordering.
		
		Queue<String> queueInDmv = new LinkedList<>();
		queueInDmv.offer("Alex");
		queueInDmv.offer("Misha");
		queueInDmv.offer("Boris");
		queueInDmv.offer("John");
		System.out.println("Our quque: " + queueInDmv);
		
		// we can check our queue
		int size = queueInDmv.size();
		System.out.println("Our queue size: " + size);
		
		// peek() will get the next element without removing it from the queue
		String nextCustomer = queueInDmv.peek();
		System.out.println("The next customer is " + nextCustomer);
		System.out.println("Our quque: " + queueInDmv);
		
		System.out.println("Is out queue empty: " + queueInDmv.isEmpty());
		
		System.out.println("Kuba is in the queue: " + queueInDmv.contains("Kuba"));
		System.out.println("Misha is in the queue: " + queueInDmv.contains("Misha"));
		
		String customer = queueInDmv.poll();
		System.out.println("Working with " + customer);
		
		customer = queueInDmv.poll();
		System.out.println("Working with " + customer); // Misha
	}
}
