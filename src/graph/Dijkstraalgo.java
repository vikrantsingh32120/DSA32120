package graph;

import java.util.*;
//class Pair implements Comparable<Pair>{
//	int v,wt;
//	Pair(int v,int wt){
//		this.wt=wt;
//		this.v=v;
//	}
//	public int compareTo(Pair that) {
//		return this.wt-that.wt;
//	}
//}

public class Dijkstraalgo {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        boolean vis[]=new boolean[V];
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        int ans[]=new int[V];
        
        Arrays.fill(ans,1000000);
        pq.add(new Pair(S,0));
        ans[S]=0;
        
        while(pq.size()!=0){
           Pair curr=pq.remove();
           
           int u=curr.v;
           
           if(vis[u]==true){
               continue;
           }
           
           vis[u]=true;
           ArrayList<ArrayList<Integer>> nb=adj.get(u);
           for(ArrayList<Integer> it:nb){
               int vrtx=it.get(0);
               int wt=it.get(1);
               if(ans[vrtx]>ans[u]+wt){
                   ans[vrtx]=ans[u]+wt;
                   pq.add(new Pair(vrtx,ans[vrtx]));
               }
           }
        }
        return ans;
    }
}
