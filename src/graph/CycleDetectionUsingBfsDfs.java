package graph;
import java.util.*;

public class CycleDetectionUsingBfsDfs {
	static class Node{
		int n;
		int pre;
		public Node(int n,int pre) {
			this.n=n;
			this.pre=pre;
		}
	}
	public static void main(String[] args) {

	}
	public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
            // using bfs 
              if(bfs(adj,i,vis))return true; 
            //using dfs
            // if(dfs(i,adj,vis,-1))return true;
            }
        }
        return false;        
    }
	
	//---using bfs
	public boolean bfs(ArrayList<ArrayList<Integer>> adj,int source,boolean[] vis){
        Queue<Node> q=new LinkedList<>();
        q.add(new Node(source,-1));
        vis[source]=true;
        
        while(!q.isEmpty()){
            int front=q.peek().n;
            int p=q.peek().pre;
            q.remove();
            for(int nebhour:adj.get(front)){
                if(!vis[nebhour]){
                    vis[nebhour]=true;
                    q.add(new Node(nebhour,front));
                }else if(nebhour!=p){
                    return true;
                }
            }
        }
        return false;
    }
    
    // ---using DFS
    public boolean dfs(int v,ArrayList<ArrayList<Integer>> adj,boolean[] vis,int parent){
        vis[v] = true;
       
       for(int i:adj.get(v)){
           if (!vis[i]) {
               if(dfs(i,adj,vis,v)) return true;
           }else if(i!=parent)return true;
       }
       return false;
    }
}
