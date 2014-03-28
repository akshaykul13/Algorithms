package UndirectedGraph;

import java.io.IOException;

import Graph.GraphAPI;
import Graph.GraphClient;

public class DepthFirstSearchClient {

	public static void main(String[] args) {
		String current;
		try {
			current = new java.io.File( "." ).getCanonicalPath();
			current = current + "\\src\\UndirectedGraph\\DepthFirstSearchInput.txt";
		    System.out.println(current);
		    GraphClient graphClient = new GraphClient();
		    GraphAPI graph = graphClient.prepareGraph(current);
		    DepthFirstSearch dfs = new DepthFirstSearch(graph, 0);
		    System.out.println(dfs.hasPathTo(9));
		    System.out.println(dfs.pathTo(4));
		} catch (IOException e) {				
			e.printStackTrace();
		}			
	}
}
