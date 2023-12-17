import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LQueueTest {

	LQueue q;
	@Before
	public void setup()
	{
		q = new LQueue();
	}
	
	/*
	 * 2: complete the following test methods as specified. 
	 */
	
	@Test
	public void testIsEmpty() {
		// test that q.isEmpty returns true
		assertTrue(q.isEmpty());
	}

	
	@Test
	public void testIsEmptyFalse() {
		// add an element to the queue "q"
		q.enqueue("pog");
		// then test that q is not an empty queue.
	}

	@Test
	public void testSizeEmpty() {
		// test the size of an empty queue is 0
		assertTrue(q.size() == 0);
	}
	
	@Test
	public void testSizeNonEmpty() {
		// add an element(s) to the queue
		q.enqueue(1);
		// then test the size of the queue
		assertTrue(q.size() == 1);
	
	}

	@Test
	public void testEnqueue() {
		// enqueue an element(s) to the queue
		q.enqueue(1);
		q.enqueue(2);
		// then test that the correct element is at the front
		assertEquals(1, q.front());
	}
	
	@Test
	public void testDequeue() {
		// enqueue multiple elements to the queue
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		// then check that they are returned in the
		// correct order with dequeue.
		assertEquals(1, q.dequeue());
		assertEquals(2, q.dequeue());
		assertEquals(3, q.dequeue());
		assertEquals(4, q.dequeue());
		assertEquals(5, q.dequeue());
	}
	
	@Test(expected = QueueException.class)  
	public void testEmptyDequeue() {  
		// try to dequeue an empty queue
		q.dequeue();
	}
	
	@Test(expected = QueueException.class)  
	public void testEmptyFront() {
		// try to get the front value of an empty queue
		q.front();
	}
}
