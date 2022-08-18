package graph;

import java.util.*;

//----using kruskal algo;
class Edge implements Comparable<Edge>{
  int src,dst,wt;
  Edge(int src,int dst,int wt){
      this.src=src;
      this.dst=dst;
      this.wt=wt;
  }
  public int compareTo(Edge that){
      return this.wt-that.wt;
  }
}
public class AruskalAlgoMST {
	
	static int[] p;  // global parent class
    static int find(int x){
        if(p[x]==x)return x;
        return find(p[x]);
    }
    
    static void union(int a,int b){
        int x=find(a);
        int y=find(b);
        if(x==y)return;
        p[y]=x;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) {
	        // Add your code here
	        
	        // -----------using kruskal algo
	        boolean[][] added=new boolean[V][V];
	        ArrayList<Edge> edges=new ArrayList<>();
	        for(int i=0;i<V;i++){
	            for(int j=0;j<adj.get(i).size();j++){
	                ArrayList<Integer> curr=adj.get(i).get(j);
	                if(!added[i][curr.get(0)]){
	                    added[i][curr.get(0)]=true;
	                    added[curr.get(0)][i]=true;
	                    edges.add(new Edge(i,curr.get(0),curr.get(1)));
	                }
	            }
	        }
	        
	        p=new int[V];
	        for(int i=0;i<V;i++){
	            p[i]=i;
	        }
	        
	        Collections.sort(edges);
	        int ans=0;
	        int count=1;  //for V-1 itrations
	        for(int i=0;count<V;i++){
	            Edge ed=edges.get(i);
	            int x=find(ed.src);
	            int y=find(ed.dst);
	            if(x!=y){
	                union(x,y);
	                ans+=ed.wt;
	                count++;
	            }
	        }
	        return ans;
	    }
}
