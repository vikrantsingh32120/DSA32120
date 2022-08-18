package dSA_450;

import java.util.*;

public class TheCelebrityProblemGFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sol s=new Sol();
		int n=3;
		int M[][]= {{0,1,0},
				    {0,0,0},
				    {0,1,0}};
		System.out.println(s.celebrity(M, n));
	}

}
class Sol
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    // 	O(n) approach-------------
    int c=0;
    for(int i=0;i<n;i++){
        if(M[c][i]==1)c=i;
    }
    
    for(int i=0;i<n;i++){
        if(i!=c && (M[c][i]==1 || M[i][c]==0))return -1;
    }
    return c;
    	
    // 	o(n^2) approach-----------
    // 	int in[]=new int[n];
    // 	int out[]=new int[n];
    // 	int ans=-1;
    // 	for(int i=0;i<n;i++){
    // 	    for(int j=0;j<n;j++){
    // 	        if(M[i][j]==1){
    // 	            out[i]++;
    // 	            in[j]++;
    // 	        }
    // 	    }
    // 	}
    // 	    for(int i=0;i<n;i++){
    // 	        if(in[i]==n-1 && out[i]==0)return i;
    // 	    }
    // 	    return ans;
    }
}