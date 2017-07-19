package datastructure;

public class Stack {

	Node top;

	public void push(Object o) {
		if (top == null) {
			top = new Node(o);
			top = top;
		} else {
			Node node = new Node(o);
			node.next = top;
			top = node;
		}
	}
	
	public Node peak() {
		return top;
	}
	
	public Node pop()	 {
		if (peak() != null) {
			Node result = top;
			top = top.next;
			return result;
		}
		
		return null;
	}
}
