package Graph;

import java.util.ArrayList;

public class DiGraphAPI {

	private final int V;
	private int E;	
	private ArrayList<Integer>[] adj;
		
	public DiGraphAPI(int V) {
		this.V = V;
		adj = (ArrayList<Integer>[])new ArrayList[V];
		for(int v=0; v<V; v++){
			adj[v] = new ArrayList<Integer>();
		}
	}
	
	public void addEdge(int v, int w){
		adj[v].add(w);		
	}
	
	public Iterable<Integer> adj(int v){
		return adj[v];
	}
	
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
	
}
