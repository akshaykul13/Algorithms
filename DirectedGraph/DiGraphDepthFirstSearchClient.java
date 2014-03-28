package DirectedGraph;

import java.io.IOException;

import Graph.GraphAPI;
import Graph.GraphClient;

public class DiGraphDepthFirstSearchClient {

	public static void main(String[] args) {
		String current;
		try {
			current = new java.io.File( "." ).getCanonicalPath();
			current = current + "\\src\\DirectedGraph\\DiGraphDepthFirstSearchInput.txt";
		    System.out.println(current);
		    GraphClient graphClient = new GraphClient();
		    GraphAPI graph = graphClient.prepareGraph(current);
		    DiGraphDepthFirstSearch dfs = new DiGraphDepthFirstSearch(graph, 0);
		    System.out.println(dfs.hasPathTo(9));
		    System.out.println(dfs.pathTo(4));
		} catch (IOException e) {				
			e.printStackTrace();
		}			
	}
}
