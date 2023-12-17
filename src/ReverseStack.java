public class ReverseStack {


	/*
	 * 1: complete implementation
	 */
	/** Reverses the order of elements in the given stack
	 * 
	 * TODO Where N is the number of elements in the stack the complexity is:
	 *
	 * O(n)
	 * 
	 * @param st the stack to be reversed
	 */
	public static void reverseStack(Stack st){
		int stackSize = st.size();	
		Queue reverseQueue = new Queue(stackSize+1);

		// Adds each element of the stack into the queue
		for (int i = 0; i < stackSize; i++) {
			reverseQueue.enqueue(st.pop());
		}
		// Pushes each element of the Queue back into the Stack
		for(int i = 0; i < stackSize; i++) {
			st.push(reverseQueue.dequeue());
		}
	}	
}
