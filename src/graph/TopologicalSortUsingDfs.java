package graph;
import java.util.*;
public class TopologicalSortUsingDfs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
//        boolean vis[]=new boolean[V];
//        Stack<Integer> ans=new Stack<>();
//        for(int i=0;i<V;i++){
//            if(!vis[i]){
//                dfs(i,adj,vis,ans);
//            }
//        }
//        int res[]=new int[V];
//        for(int i=0;i<V;i++){
//            res[i]=ans.pop();
//        }
//        return res;
//    }
//    static void dfs(int v,ArrayList<ArrayList<Integer>> adj,boolean[] vis,Stack<Integer> ans){
//        vis[v]=true;
//        
//        for(int it:adj.get(v)){
//            if(!vis[it]){
//                dfs(it,adj,vis,ans);
//            }
//        }
//        ans.push(v);
		
		// ---using bfs
//		use 'Integer' or it will give tle in some testcases
		 ArrayList<Integer> ans=new ArrayList<>();
	        Queue<Integer> q=new LinkedList<Integer>();
	        int res[]=new int[V];
	        
	        int inDeg[]=new int[V];
	        for(ArrayList<Integer> e:adj){
	            for(int i:e){
	              inDeg[i]++; 
	            }
	        }
	        
	        for(int i=0;i<V;i++){
	            if(inDeg[i]==0){
	                q.add(i);
	            }
	        }
	        int c=0;
	        while(!q.isEmpty()){
	            Integer cur=q.poll();
	            res[c++]=cur;
	            for(Integer it:adj.get(cur)){
	                if(--inDeg[it]==0){
	                    q.add(it);
	                }
	                
	            }
	        }
	        return res;
    }
}
