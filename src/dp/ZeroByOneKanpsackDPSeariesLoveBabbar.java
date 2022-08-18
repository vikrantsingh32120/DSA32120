package dp;

public class ZeroByOneKanpsackDPSeariesLoveBabbar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// using recursion
    static int find(int w,int[] wt,int[] val, int n){
        if(n==0){
            if(wt[0]<=w)return val[0];
            else return 0;
        }
        
        int incl=0;
        if(wt[n]<=w){
            incl=val[n]+find(w-wt[n],wt,val,n-1);
        }
        
        int excl=0+find(w,wt,val,n-1);
        int ans=Math.max(incl,excl);
        return ans;
    } 
    
    // using recursion+memoization;
    static int findMem(int w,int[] wt,int[] val, int n,int[][] dp){
        if(n==0){
            if(wt[0]<=w)return val[0];
            else return 0;
        }
        else if(dp[n][w]!=-1)return dp[n][w];
        
        int incl=0;
        if(wt[n]<=w){
            incl=val[n]+findMem(w-wt[n],wt,val,n-1,dp);
        }
        
        int excl=0+findMem(w,wt,val,n-1,dp);
        dp[n][w]=Math.max(incl,excl);
        return dp[n][w];
    } 
    
     // using Tabulation;
    static int findTab(int w,int[] wt,int[] val, int n){
        
        int[][] dp=new int[n][w+1];
        for(int weight=wt[0];weight<=w;weight++){
            if(wt[0]<=weight)dp[0][weight]=val[0];
        }
        for(int idx=1;idx<n;idx++){
            for(int weight=0;weight<=w;weight++){
                int incl=0;
                if(wt[idx]<=weight){
                    incl=val[idx]+dp[idx-1][weight-wt[idx]];
                }
        
                int excl=0+dp[idx-1][weight];
                dp[idx][weight]=Math.max(incl,excl);
            }
        }
        return dp[n-1][w];
    } 
    
    // space optimization in Tabulation;
    static int findTab1(int w,int[] wt,int[] val, int n){
        
        int[] prev=new int[w+1];
        int curr[]=new int[w+1];
        
        for(int weight=wt[0];weight<=w;weight++){
            if(wt[0]<=weight)prev[weight]=val[0];
        }
        
        for(int idx=1;idx<n;idx++){
            for(int weight=0;weight<=w;weight++){
                
                int incl=0;
                
                if(wt[idx]<=weight){
                    incl=val[idx]+prev[weight-wt[idx]];
                }
        
                int excl=0+prev[weight];
                
                curr[weight]=Math.max(incl,excl);
            }
            for(int i=0;i<=w;i++)prev[i]=curr[i];
        }
        return prev[w];
    } 
    
    // more space optimization in space optimization;
    static int findTab2(int w,int[] wt,int[] val, int n){
        
        int[] prev=new int[w+1];
        
        for(int weight=wt[0];weight<=w;weight++){
            if(wt[0]<=weight)prev[weight]=val[0];
        }
        
        for(int idx=1;idx<n;idx++){
            for(int weight=w;weight>=0;weight--){
                
                int incl=0;
                
                if(wt[idx]<=weight){
                    incl=val[idx]+prev[weight-wt[idx]];
                }
        
                // int excl=0+prev[weight];
                
                prev[weight]=Math.max(incl,prev[weight]);
            }
        }
        return prev[w];
    } 
    
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
        //  return find(W,wt,val,n-1);
        
        // int[][] dp=new int[n+1][W+1];
        // for(int i=0;i<dp.length;i++)Arrays.fill(dp[i],-1);
        // return findMem(W,wt,val,n-1,dp);
        
        // return findTab(W,wt,val,n);
        
        // return findTab1(W,wt,val,n);
        
        return findTab2(W,wt,val,n);
    } 
}
