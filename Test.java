
public class Test {
	public static void main(String[] args) {
		GraphLink<String> mapGrafos = new GraphLink<String>();
		mapGrafos.insertVertex("AQP");
		mapGrafos.insertVertex("Lima");
		mapGrafos.insertVertex("Trujillo");
		mapGrafos.insertEdge("AQP", "Lima");
		mapGrafos.insertEdge("AQP", "Trujillo");
		mapGrafos.insertEdge("Trujillo", "Lima");
		
		mapGrafos.DFS("AQP");
		System.out.println(mapGrafos);
		
		GraphLink<String> mapGrafos2 = new GraphLink<String>();
		mapGrafos2.insertVertex("AQP");
		mapGrafos2.insertVertex("Lima");
		mapGrafos2.insertVertex("Trujillo");
		mapGrafos2.insertVertex("Argentina");
		mapGrafos2.insertEdge("AQP", "Lima");
		mapGrafos2.insertEdge("AQP", "Trujillo");
		mapGrafos2.insertEdge("Trujillo", "Lima");
		mapGrafos2.insertEdge("Argentina", "Lima");
		
		// No esta implementando
		GraphLink.grafoIncluido(mapGrafos, mapGrafos2);
		
		GraphLink<String> mapGrafos3 = new GraphLink<String>();
		mapGrafos3.insertVertex("Words");
		mapGrafos3.insertVertex("Cords");
		mapGrafos3.insertVertex("Corps");
		mapGrafos3.insertVertex("Coops");
		mapGrafos3.insertVertex("Crops");
		mapGrafos3.insertVertex("Drops");
		mapGrafos3.insertVertex("Drips");
		mapGrafos3.insertVertex("Grips");
		mapGrafos3.insertVertex("Gripe");
		mapGrafos3.insertVertex("Grape");
		mapGrafos3.insertVertex("Graph");
		mapGrafos3.insertEdge("Words", "Cords");
		mapGrafos3.insertEdge("Cords", "Corps");
		mapGrafos3.insertEdge("Corps", "Coops");
		mapGrafos3.insertEdge("Coops", "Crops");
		mapGrafos3.insertEdge("Crops", "Drops");
		mapGrafos3.insertEdge("Drops", "Drips");
		mapGrafos3.insertEdge("Drips", "Grips");
		mapGrafos3.insertEdge("Grips", "Gripe");
		mapGrafos3.insertEdge("Gripe", "Grape");
		mapGrafos3.insertEdge("Grape", "Graph");
		System.out.println(mapGrafos3);
	}
}
