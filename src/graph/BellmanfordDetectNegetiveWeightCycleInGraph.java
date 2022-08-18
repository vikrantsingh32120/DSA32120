package graph;

import java.util.*;

public class BellmanfordDetectNegetiveWeightCycleInGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int isNegativeWeightCycle(int n, int[][] edge)
    {
        //code here
        int dist[]=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0]=0;
        for(int count=0;count<n;count++){
            for(int j=0;j<edge.length;j++){
                int source=edge[j][0];
                int dest=edge[j][1];
                int wt=edge[j][2];
                if(dist[source]!=Integer.MAX_VALUE && dist[dest]>dist[source]+wt){
                    dist[dest]=dist[source]+wt;
                }
            }
        }
        
        for(int j=0;j<edge.length;j++){
                int source=edge[j][0];
                int dest=edge[j][1];
                int wt=edge[j][2];
                if(dist[source]!=Integer.MAX_VALUE && dist[dest]>dist[source]+wt){
                    return 1;
                }
            }
        return 0;
    }
}
