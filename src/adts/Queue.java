package adts;

public class Queue implements QueueIntADT{

	private Node begin;
	private int length;
	
	private class Node { //working
		public int value;
		public Node pointer;
		public Node(int value, Node pointer) {
			this.value = value;
			this.pointer = pointer;
		}
	}
	
	public Queue() {
		begin = null;
	}

	@Override
	public void enqueue(int num) {
		if(begin == null) {
			begin = new Node(num, null);
		} else {
			Node checker = begin;
			while(checker.pointer != null) {
				checker = checker.pointer;
			}
			checker.pointer = new Node(num, null);
		}
		length ++;
		
	}

	public int dequeue() {
		Node toRet = begin;
		begin = begin.pointer;
		length --;
		
		return toRet.value;
	}

	public int peek() {
		return begin.value;
	}

	public int size() {
		return length;
	}

	public boolean isEmpty() {
		return begin == null;
	}

	public boolean isFull() {
		return false;
	}

}
