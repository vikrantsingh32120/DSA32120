package dp;
import java.util.*;
public class MaximizeTheCutSegments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// using recursion;
    int find(int n,int x,int y,int z){
        if(n==0)return 0;
        else if(n<0)return Integer.MIN_VALUE;
        
        int a=find(n-x,x,y,z)+1;
        int b=find(n-y,x,y,z)+1;
        int c=find(n-z,x,y,z)+1;
        
        int ans=Math.max(a,Math.max(b,c));
        return ans;
    }
    
    // using memoization
    int findMem(int n,int x,int y,int z,int[] dp){
        if(n==0)return 0;
        else if(n<0)return Integer.MIN_VALUE;
        else if(dp[n]!=-1)return dp[n];
        
        int a=findMem(n-x,x,y,z,dp)+1;
        int b=findMem(n-y,x,y,z,dp)+1;
        int c=findMem(n-z,x,y,z,dp)+1;
        
        dp[n]=Math.max(a,Math.max(b,c));
        return dp[n];
    }
    
     // using Tabulation
    int findTab(int n,int x,int y,int z){
        int dp[]=new int[n+1];
        Arrays.fill(dp,Integer.MIN_VALUE);
        dp[0]=0;
        
        for(int i=1;i<=n;i++){
            if(i-x>=0)dp[i]=Math.max(dp[i],dp[i-x]+1);
            if(i-y>=0)dp[i]=Math.max(dp[i],dp[i-y]+1);
            if(i-z>=0)dp[i]=Math.max(dp[i],dp[i-z]+1);
        }
        
        if(dp[n]<0)return 0;
        return dp[n];
    }
    
    //Function to find the maximum number of cuts.
    public int maximizeCuts(int n, int x, int y, int z)
    {
       //Your code here
    //   return find(n,x,y,z);
    
    // int dp[]=new int[n+1];
    // Arrays.fill(dp,-1);
    // int ans=findMem(n,x,y,z,dp);
    // if(ans>0)return ans;
    // return 0;
    
    return findTab(n,x,y,z);
    }
}
