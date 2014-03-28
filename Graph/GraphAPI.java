package Graph;

import java.util.ArrayList;

public class GraphAPI {

	private final int V;
	private int E;	
	private ArrayList<Integer>[] adj;
	
	public ArrayList<Integer>[] getAdj() {
		return adj;
	}

	public void setAdj(ArrayList<Integer>[] adj) {
		this.adj = adj;
	}

	public int V() {
		return V;
	}
	
	public int E() {
		return E;
	}
	
	public void setE(int E) {
		this.E = E;
	}
	
	public GraphAPI(int V) {
		this.V = V;
		adj = (ArrayList<Integer>[])new ArrayList[V];
		for(int v=0; v<V; v++){
			adj[v] = new ArrayList<Integer>();
		}
	}
	
	public void addEdge(int v, int w){
		adj[v].add(w);
		adj[w].add(v);
	}
	
	public Iterable<Integer> adj(int v){
		return adj[v];
	}
	
	public static int degree(GraphAPI G, int v) 
	{ 
		int degree = 0; 
		for (int w : G.adj(v)) degree++; 
		return degree; 
	}
	
	public static int maxDegree(GraphAPI G) 
	{
		int max = 0; 
	 	for (int v = 0; v < G.V(); v++){
	 		if (degree(G, v) > max)
	 			 max = degree(G, v);	
	 	}		 
	 	return max;
	}
	
	public static double averageDegree(GraphAPI G) 
	{ 
		return 2.0 * G.E() / G.V(); 
	}
	
	public static int numberOfSelfLoops(GraphAPI G) 
	{
		int count = 0;
		for (int v = 0; v < G.V(); v++)
			for (int w : G.adj(v)) 
				if (v == w) count++; 
		return count/2; // each edge counted twice 
	}
}
