package adts;

public class LinkedList implements ListIntADT{ //working
	
	private Node root;
	
	public LinkedList() {
		root = null;
	}

	public int get(int i) throws NullPointerException { //working

		Node checker = root;
		for(int j=0;j<i;j++) {
			checker = checker.pointer;
		}
		
		return checker.value;
		
	}

	public void insert(int i, int j) { //working
		
		Node checker = root;
		for(int k=0;k<i-1;k++) {
			if(checker.pointer == null) {
				break;
			} else {
				checker = checker.pointer;
			}
		}
		if(root == null) {
			root = new Node(j, null);
		} else if (checker.pointer == null) {
			
			checker.pointer = new Node(j, null);
		} else {
			checker.pointer = new Node(j, checker.pointer);
		}
	}

	public void remove(int i) { //working
		Node checker = root;
		if(checker.value == i) {
			root = checker.pointer;
		} else {
			while(!(checker.pointer == null)) {
				if(checker.pointer.value == i) {
					
					checker.pointer = checker.pointer.pointer;
					
					break;
				}
				checker = checker.pointer;
			}
		}
		
	}

	public void removeAt(int i) { //working
		Node checker = root;
		int k;
		for(k=0;k<i-1;k++) {
			if(checker.pointer == null) {
				break;
			} else {
				checker = checker.pointer;
			}
		}
		if(i == 0) {
			root = checker.pointer;
		} else {
			checker.pointer = checker.pointer.pointer;
		}
		
	}

	public void replace(int i, int j) { //working
		
		Node checker = root;
		for(int k=0;k<i-1;k++) {
			checker = checker.pointer;
		}
		
		if(i == 0) {
			root = new Node(j, checker.pointer);
		} else {
			checker.pointer = new Node(j, checker.pointer.pointer);
		}
		
		
	}

	public int size() { //working
		Node checker = root;
		int count = 0;
		while(!(checker == null)) {
			count ++;
			checker = checker.pointer;
		}
		return count;
	}

	public boolean isEmpty() { //working
		if(root == null) {
			return true;
		}
		return false;
	}

	public boolean isFull() { //working
		return false;
	}

	private static class Node { //working
		public int value;
		public Node pointer;
		public Node(int value, Node pointer) {
			this.value = value;
			this.pointer = pointer;
		}
	}
	public String toString() { //working
		String toRet = "";
		Node checker = root;
		while(!(checker == null)) {
			toRet += checker.value + ", ";
			checker = checker.pointer;
		}
		if(!(root == null)) {
			toRet = toRet.substring(0,toRet.length()-2);
		}
		
		return toRet;
	}

}


