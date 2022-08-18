package graph;

import java.util.*;

public class DetectCycleInDirectedGrapUsingDfs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean[] vis=new boolean[V];
        boolean[] recS=new boolean[V];
        for(int i=0;i<V;i++){
           if(!vis[i]){
               if(dfs(i,adj,vis,recS))return true;
           }
        }
        return false;
    }
    public boolean dfs(int v,ArrayList<ArrayList<Integer>> adj,boolean[] vis,boolean[] recS){
        vis[v]=true;
        recS[v]=true;
        for(int it:adj.get(v)){
            if(!vis[it]){
                if(dfs(it,adj,vis,recS))return true;
            }else if(recS[it]){
                return true;
            }
        }
        recS[v]=false;
        return false;
    }
}
