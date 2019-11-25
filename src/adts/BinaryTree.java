package adts;

public class BinaryTree implements BinaryTreeADT{
	
	private Node root;
	
	/*
	 * 
	 * 
	 * Currently Incomplete
	 * 
	 * 
	 */
	
	public BinaryTree() {
		root = null;
	}

	@Override
	public boolean isEmpty() {
		return root == null;
	}

	@Override
	public boolean isLeaf(Node n) {
		return n.left == null && n.right == null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insert(Node n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Object data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Node search(Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object[] traversalPreOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] traversalInOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] traversalPostOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] traversalBFS() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
