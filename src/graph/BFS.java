package graph;

import java.util.*;

public class BFS {

	public static void main(String[] args) {
		int v =6;
		ArrayList<LinkedList<Integer>> a=new ArrayList<>();
		boolean[] visited=new boolean[v+1];
		int[] pre=new int[v+1];
		int dist[]=new int[v+1];
		int components=0;
		for(int i=0;i<v+1;i++) {
			if(!visited[i]) {
				components++;
				Bfs(a,i,6,v,dist,pre,visited);
			}
		}
		System.out.println(components);
	}
	public static boolean Bfs(ArrayList<LinkedList<Integer>> a,int source,int dest,int v,int[] dist,int[] pre,boolean[] visited) {
		Queue<Integer> q=new LinkedList<>();
		q.add(source);
		while(!q.isEmpty()) {
			int front=q.poll();
			for(int i=1;i<a.get(front).size();i++) {
				if(a.get(front).get(i)==dest) {
					return true;
				}
				if(!visited[a.get(front).get(i)]) {
					visited[a.get(front).get(i)]=true;
					dist[a.get(front).get(i)]=dist[front]+1;
					pre[a.get(front).get(i)]=front;
					q.add(a.get(front).get(i));
				}
			}
		}
		return false;
	}
}
