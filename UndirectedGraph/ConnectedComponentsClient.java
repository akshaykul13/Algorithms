package UndirectedGraph;

import java.io.IOException;

import Graph.GraphAPI;
import Graph.GraphClient;

public class ConnectedComponentsClient {

	public static void main(String[] args) {
		String current;
		try {
			current = new java.io.File( "." ).getCanonicalPath();
			current = current + "\\src\\UndirectedGraph\\ConnectedComponentsInput.txt";
		    System.out.println(current);
		    GraphClient graphClient = new GraphClient();
		    GraphAPI graph = graphClient.prepareGraph(current);
		    ConnectedComponents cc = new ConnectedComponents(graph);
		    for(int i=0; i<graph.V(); i++)
		    	System.out.print(cc.getId()[i]);		    
		} catch (IOException e) {				
			e.printStackTrace();
		}		
	}
}
