
public class Vertex<E> {
	
	protected E data;
	protected LinkedList<Edge<E>> listAdj;
	protected int status; // 0 -> sin explorar, 1-> visited
	
	public Vertex(E data) {
		this.data = data;
		listAdj = new LinkedList<Edge<E>>();
	}
	
	@SuppressWarnings("unchecked")
	public boolean equals(Object o){
		if(o instanceof Vertex<?>) {
			Vertex<E> v = (Vertex<E>)o;
			return this.data.equals(v.data);
		}
		return false;
	}
	
	public String toString() {
		return this.data + " -->" + this.listAdj.toString()+"\n";
	}
}
