package UndirectedGraph;

import Graph.GraphAPI;

public class ConnectedComponents {

	private boolean[] marked;
	private int[] id;
	private int count;
	
	public ConnectedComponents(GraphAPI G) {
		marked = new boolean[G.V()];
		id = new int[G.V()];
		for (int v = 0; v < G.V(); v++)
		{
			if (!marked[v])
			{
				dfs(G, v);
				count++;
			}
		}
	 }
	
	public int count() { 
		return count; 
	}
	
	public int id(int v) { 
		return id[v]; 
	}
	
	private void dfs(GraphAPI G, int v) {
		marked[v] = true;
		id[v] = count;
		for (int w : G.adj(v))
			if (!marked[w])
				dfs(G, w);
	}

	public boolean[] getMarked() {
		return marked;
	}

	public void setMarked(boolean[] marked) {
		this.marked = marked;
	}

	public int[] getId() {
		return id;
	}

	public void setId(int[] id) {
		this.id = id;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
}