package dp;

public class DisarrangementOfBalls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 // using recursion+memoization;
    static long find(int n,long[] dp){
        if(n==1)return 0;
        if(n==2)return 1;
        if(dp[n]!=-1)return dp[n];
        
        dp[n]=((n-1) * (find(n-2,dp)+find(n-1,dp)))%1000000007;
        
        return dp[n];
     }
    
     // using Tabulation;
    static long findTab(int n){
        long mod=1000000007;
        long dp[]=new long[n+1];
        
        dp[1]=0;
        dp[2]=1;
        for(int i=3;i<=n;i++){
            long temp= ((i-1) * (dp[i-2] + dp[i-1]))%mod;
            dp[i]=temp;
        }
        
        return dp[n];
     }
    
     // space optimizatiion in tabulation;
    static long findTab1(int n){
        long mod=1000000007;
        if(n==1)return 0;
        else if(n==2)return 1;
        long pre2=0;
        long pre1=1;
        for(int i=3;i<=n;i++){
            long ans= ((i-1) * (pre2 + pre1))%mod;
            pre2=pre1;
            pre1=ans;
        }
        
        return pre1;
     }
    
    static long disarrange(int N){
        // code here
        // long dp[]=new long[N+1];
        // Arrays.fill(dp,-1);
        // return find(N,dp);
        
        // return findTab(N);
        
        return findTab1(N);
    }
}
