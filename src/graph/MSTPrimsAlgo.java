package graph;

import java.util.*;

class Pair implements Comparable<Pair>{
    Integer v;
    Integer wt;
    public Pair(Integer v,Integer wt){
        this.wt=wt;
        this.v=v;
    }
    public int compareTo(Pair that){
        return this.wt-that.wt;
    }
}
public class MSTPrimsAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
    {
        // Add your code here
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(0,0));
        int ans=0;
        boolean vis[]=new boolean[V];
        while(pq.size()!=0){
            Pair cur=pq.remove();
            int u=cur.v;
            if(vis[u]){
                continue;
            }
            vis[u]=true;
            ans+=cur.wt;
            ArrayList<ArrayList<Integer>> it=adj.get(u);
            for(ArrayList<Integer> ls:it){
                Integer v=ls.get(0);
                Integer wt=ls.get(1);
                if(vis[v]==false){
                    pq.add(new Pair(v,wt));
                }
            }
        }
        return ans;
    }
}
