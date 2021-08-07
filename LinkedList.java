
public class LinkedList<E> {
	
	protected Node<E> first;
	
	public LinkedList() {
		this.first = null;
	}
	
	boolean isEmpty() {
		return this.first == null;
	}
	
	public E search(E data) {
		Node<E> nodoTemp = this.first;
		
		while(nodoTemp != null && !nodoTemp.data.equals(data)) 
			nodoTemp = nodoTemp.getNext();
		
		if(nodoTemp != null)
			return nodoTemp.data;
		return null;
	}
	
	void insertFirst(E data) {
		this.first = new Node<E>(data, this.first);
	}
	
	@Override
	public String toString() {
		
		String cadena = "";
		Node<E> temp = first;
		
		while(temp != null) {
			cadena += temp.data.toString();
			temp = temp.next;
		}
		return cadena;
	}
}
