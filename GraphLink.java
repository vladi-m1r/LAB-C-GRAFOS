
public class GraphLink<E> {
	
	protected LinkedList<Vertex<E>> listVertex;
	
	public GraphLink() {
		listVertex = new LinkedList<Vertex<E>>();
	}
	
	public void insertVertex(E data) {
		Vertex<E> nuevo = new Vertex<E>(data);
		if(this.listVertex.search(nuevo) != null) {
			System.out.println("Vertice ya fue insertado anteriormente...");
			return;
		}
		this.listVertex.insertFirst(nuevo);
	}
	
	public void insertEdge(E verOri, E verDes) {
		this.insertEdge(verOri, verDes, -1);
	}
	
	public void insertEdge(E verOri, E verDes, int weight) {
		Vertex<E> refOri = this.listVertex.search(new Vertex<E>(verOri));
		Vertex<E> refDes = this.listVertex.search(new Vertex<E>(verDes));
		
		if(refOri == null || refDes == null) {
			System.out.println("Vertice origen y/o destino no existen...");
			return;
		}
		
		if(refOri.listAdj.search(new Edge<E>(refDes)) != null) {
			System.out.println("Arista ya fue insertada anteriormente...");
			return;
		}
		
		refOri.listAdj.insertFirst(new Edge<E>(refDes, weight));
		refDes.listAdj.insertFirst(new Edge<E>(refOri, weight));
	}
	
	public String toString() {
		return this.listVertex.toString();
	}
	
	private void initLabel() {
		Node<Vertex<E>> aux = this.listVertex.first;
		for(; aux != null; aux = aux.getNext()) {
			aux.data.status = 0;
			Node<Edge<E>> auxE = aux.data.listAdj.first;
			for(; auxE != null; auxE = auxE.getNext()) {
				auxE.data.status = 0;
			}
		}
	}
	
	public void DFS(E data) {
		Vertex<E> v = this.listVertex.search(new Vertex<E>(data));
		if(v == null) {
			System.out.println("Vertice no existe para hacer DFS...");
			return;
		}
		initLabel();
		DFSRec(v);
	}
	
	private void DFSRec(Vertex<E> v) {
		v.status = 1;
		Node<Edge<E>> e = v.listAdj.first;
		
		for(; e!= null; e = e.getNext()) {
			if(e.data.status == 0) {
				Vertex<E> w = e.data.refDest;
				if(w.status == 0) {
					e.data.status = 1;
					DFSRec(w);
				}else
					e.data.status = 2;
			}
		}
	}
}
