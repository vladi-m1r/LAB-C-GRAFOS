
public class Node<E> {
	
	Node<E> next;
	E data;
	
	Node(E data, Node<E> next) {
		this.data = data;
		this.next = next;
	}
	
	public Node<E> getNext() {
		return next;
	}
	
}
