package adts;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		LinkedList list = new LinkedList();
		list.insert(0, 1);
		list.insert(1, 2);
		list.insert(2, 3);
		list.insert(3, 4);
		list.remove(5);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(2));
		*/
		
		Stack list2 = new Stack();

		list2.push(1);
		list2.push(2);
		System.out.println(list2);
		System.out.println(list2.pop());
		System.out.println(list2);
		list2.pop();
		System.out.println(list2.isEmpty());
		
		
	}

}
