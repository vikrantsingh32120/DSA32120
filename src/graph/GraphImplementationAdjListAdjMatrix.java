package graph;

import java.util.*;

public class GraphImplementationAdjListAdjMatrix {

	public static void main(String[] args) {
		int v=5;
		int e=5;
		int a[][]=new int[v+1][v+1];
		
		ArrayList<LinkedList<Integer>> b=new ArrayList<>();
//		Initializing the adj. list;
		for(int i=0;i<v;i++) {
			b.add(new LinkedList<Integer>());
		}
	}
	public static void addEdge(int[][] a,int source,int dest) {
//		graph is bi-directional
		a[source][dest]=1;
		a[dest][source]=1;
	}
	public static void addEdge(ArrayList<LinkedList<Integer>> a,int source,int dest) {
//		graph is bi-directional
		a.get(source).add(dest);
		a.get(dest).add(source);
	}
}
