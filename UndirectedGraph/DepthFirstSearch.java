package UndirectedGraph;

import java.util.Stack;

import Graph.GraphAPI;

public class DepthFirstSearch {

	private boolean[] marked;
	private int[] edgeTo;
	private int s;
	
	public DepthFirstSearch(GraphAPI G, int s)
	{
		this.s = s;
		marked = new boolean[G.V()];		
		edgeTo = new int[G.V()];	
		for(int i=0; i<G.V(); i++){
			edgeTo[i] = -1;
		}
		dfs(G, s);
	}
	
	private void dfs(GraphAPI G, int v)
	{
		marked[v] = true;
		for (int w : G.adj(v))
			if (!marked[w])
			{
				dfs(G, w);
				edgeTo[w] = v;
			}
	 }
	
	public boolean hasPathTo(int v)
	{ 
		return marked[v]; 
	}
	
	public Iterable<Integer> pathTo(int v)
	{
		if (!hasPathTo(v)) return null;
		Stack<Integer> path = new Stack<Integer>();
		for (int x = v; x != s; x = edgeTo[x])
			path.push(x);
		path.push(s);
		return path;
	 }

	public boolean[] getMarked() {
		return marked;
	}

	public void setMarked(boolean[] marked) {
		this.marked = marked;
	}

	public int[] getEdgeTo() {
		return edgeTo;
	}

	public void setEdgeTo(int[] edgeTo) {
		this.edgeTo = edgeTo;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}
	
	
}
