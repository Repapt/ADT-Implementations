package adts;

public class Stack implements StackIntADT{
	
	private Node top;
	
	public Stack() {
		top = null;
	}

	public void push(int i) {
		top = new Node(i, top);
	}

	public int pop() {
		
		int val = top.value;
		
		top = top.pointer;
		
		return val;
	}

	public int peek() {
		return top.value;
	}

	public int size() {
		int count = 0;
		Node checker = top;
		while(!(checker == null)) {
			count ++;
			checker = checker.pointer;
		}
		
		return count;
	}

	public boolean isEmpty() {
		return top == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}
	
	public String toString() {
		
		String toRet = "";
		Node checker = top;
		while(!(checker == null)) {
			toRet += checker.value + ", ";
			checker = checker.pointer;
		}
		if(!(top == null)) {
			toRet = toRet.substring(0, toRet.length()-2);
		}
		
		return toRet;
	}
	
	private static class Node { //working
		public int value;
		public Node pointer;
		public Node(int value, Node pointer) {
			this.value = value;
			this.pointer = pointer;
		}
	}

	
}
