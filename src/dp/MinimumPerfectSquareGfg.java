package dp;

public class MinimumPerfectSquareGfg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// using recursion;
    int find(int n){
        if(n==0)return 0;
        int ans=n;
        for(int i=1;i*i<=n;i++){
            ans=Math.min(ans,1+find(n-i*i));
        }
        return ans;
    }
    
     // using memoization;
    int findMem(int n,int dp[]){
        if(n==0)return 0;
        else if(dp[n]!=-1)return dp[n];
        int ans=n;
        for(int i=1;i*i<=n;i++){
            ans=Math.min(ans,1+findMem(n-i*i,dp));
        }
        dp[n]=ans;
        return dp[n];
    }
    
    // using tabulation;
    int findTab(int n){
        int dp[]=new int [n+1];
        for(int j=1;j<=n;j++){
            int ans=j;
            for(int i=1;i*i<=j;i++){
                ans=Math.min(ans,1+dp[j-i*i]);
            }
            dp[j]=ans;
        }
        return dp[n];
    }
    public int MinSquares(int n)
    {
        // Code here
        // return find(n);
        
        // int[] dp=new int[n+1];
        // Arrays.fill(dp,-1);
        // return findMem(n,dp);
        
        return findTab(n);
    }
}
