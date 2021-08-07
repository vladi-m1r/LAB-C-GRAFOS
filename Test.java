
public class Test {
	public static void main(String[] args) {
		GraphLink<String> mapGrafos = new GraphLink<String>();
		mapGrafos.insertVertex("AQP");
		mapGrafos.insertVertex("Lima");
		
		mapGrafos.insertVertex("Trujillo");
		mapGrafos.insertEdge("AQP", "Lima");
		mapGrafos.insertEdge("AQP", "Trujillo");
		mapGrafos.insertEdge("Trujillo", "Lima");
		System.out.println(mapGrafos);
		mapGrafos.DFS("AQP");
		System.out.println(mapGrafos);
	}
}
