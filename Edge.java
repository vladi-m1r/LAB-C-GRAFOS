
public class Edge<E> {
	
	protected Vertex<E> refDest;
	protected int weight;
	protected int status; // 0=sin explorar, 1=descubierto y 2=back
	
	public Edge(Vertex<E> refDest){
		this(refDest, -1);
	}
	
	public Edge(Vertex<E> refDest, int weight) {
		this.refDest = refDest;
		this.weight = weight;
	}
	
	@SuppressWarnings("unchecked")
	public boolean equals(Object o) {
		if(o instanceof Edge<?>) {
			Edge<E> e = (Edge<E>)o;
			return this.refDest.equals(e.refDest);
		}
		return false;
	}
	
	public String toString() {
		if(this.weight > -1) return this.refDest.data + "[" + this.weight + "], ";
		return this.refDest.data + ", ";
	}
}
