package UndirectedGraph;

import java.util.LinkedList;
import java.util.Queue;

import Graph.GraphAPI;

public class BreadthFirstSearch {

	private boolean[] marked;
	private int[] edgeTo;
	private int s;
	
	public BreadthFirstSearch(GraphAPI G, int s){
		this.s = s;
		marked = new boolean[G.V()];		
		edgeTo = new int[G.V()];	
		for(int i=0; i<G.V(); i++){
			edgeTo[i] = -1;
		}
		bfs(G, s);
	}
	
	private void bfs(GraphAPI G, int s) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(s);
		marked[s] = true;
		while (!q.isEmpty())
		{
			int v = q.remove();
			for (int w : G.adj(v))
			{
				if (!marked[w])
				{
					q.add(w);
					marked[w] = true;
					edgeTo[w] = v;
				}	
			}
		}
	 }
}
