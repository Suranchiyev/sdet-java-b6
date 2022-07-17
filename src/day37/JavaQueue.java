package day37;

import java.util.Queue;
import java.util.LinkedList;

public class JavaQueue {
	public static void main(String[] args) {
		// Queue is First In First Out data structure
		
		// In Java Queue interface has two implementations
		// 1. LinkedList
		// 2. PriorityQueue
		
		// Any queue should have two methods
		// 1. offer(element)
		// 2. poll()
		
		Queue<String> queueInStore = new LinkedList<>();
		queueInStore.offer("Alex");
		queueInStore.offer("Misha");
		queueInStore.offer("Boris");
		queueInStore.offer("John");
		
		System.out.println("Customers in the queue: " + queueInStore);
		
		workWithCustomer(queueInStore);
		System.out.println("-----");
		
		workWithCustomer(queueInStore);
		System.out.println("-----");
		
		workWithCustomer(queueInStore);
		System.out.println("-----");
		
		queueInStore.offer("Kuba");
	
		workWithCustomer(queueInStore);
		System.out.println("-----");
		
		workWithCustomer(queueInStore);
		System.out.println("-----");
	}
	
	public static void workWithCustomer(Queue<String> queue) {
		String currentCustomer = queue.poll();
		System.out.println("Working with customer " + currentCustomer);
		System.out.println("Customers in the line: " + queue);
	}
}
