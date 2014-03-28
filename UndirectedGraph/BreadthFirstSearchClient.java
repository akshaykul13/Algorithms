package UndirectedGraph;

import java.io.IOException;

import Graph.GraphAPI;
import Graph.GraphClient;

public class BreadthFirstSearchClient {

	public static void main(String[] args) {
		String current;
		try {
			current = new java.io.File( "." ).getCanonicalPath();
			current = current + "\\src\\UndirectedGraph\\BreadthFirstSearchInput.txt";
		    System.out.println(current);
		    GraphClient graphClient = new GraphClient();
		    GraphAPI graph = graphClient.prepareGraph(current);
		    BreadthFirstSearch bfs = new BreadthFirstSearch(graph, 0);
		    System.out.println(bfs);		    
		} catch (IOException e) {				
			e.printStackTrace();
		}		
	}
}
