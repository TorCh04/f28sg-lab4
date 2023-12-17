/*
 * Queue implementation with a linked list.
 */
public class LQueue implements QueueADT {
	
	private class Node{
		Object element;
		Node next;
		
		public Node(Object e, Node n){
			element = e;
			next = n;
		}
		
		public Node(Object e){
			element = e;
			next = null;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public LQueue(){
		head = null;
		tail = null;	
		size = 0;
	}
	
	/*
	 * Part 3: complete the following methods
	 */
	
	// Part 3: complete	
	/**
	 * Returns true if the queue is empty, false otherwise.
	 * 
	 * TODO Where N is the number of elements in the queue the complexity is:
	 *
	 * O(1)
	 */
	public boolean isEmpty(){
		return head == null;
	}
	
	// Part 3: complete
	/**
	 * Returns how many elements are in the queue.
	 * 
	 * TODO Where N is the number of elements in the queue the complexity is:
	 *
	 * O(1)
	 */
	public int size(){
		return size; 
	}
	
	// Part 3: complete
	/**
	 * Adds a new element to the end of the queue.
	 * 
	 * TODO Where N is the number of elements in the queue the complexity is:
	 *
	 * O(1)
	 */
	public void enqueue(Object o) {
		Node newNode = new Node(o);	
		// If the queue is empty, set both head and tail Node to newNode and increment the size of the queue
		if (isEmpty())
		{
			head = newNode;
			tail = newNode;
			size++;
		}
		// Sets tail to the next element of the queue and increment size
		else
		{
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}
	
	// Part 3: complete	
	/**
	 * Removes the element at the front of the queue.
	 * 
	 * TODO Where N is the number of elements in the queue the complexity is:
	 *
	 * O(1)
	 */
	public Object dequeue() throws QueueException{
		// Throws exception when queue is empty
		if (isEmpty())
		{
			throw new QueueException("Queue is empty");
		}
		// Set tempNode to head and move the head pointer along, then decrement the size of the queue
		Node tempNode = head;
		head = head.next;
		if (head == null)
		{
			tail = null;
		}
		size--;
		return tempNode.element;
		}

	
	
	// Part 3: complete
	/**
	 * Returns the element at the front of the queue without removing it.
	 * 
	 * TODO Where N is the number of elements in the queue the complexity is:
	 *
	 * O(1)
	 */
	public Object front() throws QueueException{
		if(isEmpty()) 
		{
			throw new QueueException("Queue is Empty");
		}
		else {
			return head.element;
		}
	}
	
}
