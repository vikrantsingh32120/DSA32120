package dp;

public class PaintingFenceProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// using recursion;
    long find(int n,int k){
        if(n==1)return k;
        else if(n==2)return k+k*(k-1);
        
        long same=((k-1)*find(n-2,k))%1000000007;
        long diff=((k-1)*find(n-1,k))%1000000007;
        long sum=(same+diff)%1000000007;
        return sum;
    }
    
     // using recursion+memoization;
    long findMem(int n,int k,long[] dp){
        if(n==1)return k;
        else if(n==2)return k+k*(k-1);
        else if(dp[n]!=-1)return dp[n];
        
        long same=((k-1)*findMem(n-2,k,dp))%1000000007;
        long diff=((k-1)*findMem(n-1,k,dp))%1000000007;
        dp[n]=(same+diff)%1000000007;
        return dp[n];
    }
    
    // using tabulation;
    long findTab(int n,int k){
        if(n==1)return k;
        else if(n==2)return k+k*(k-1);
        
        long dp[]=new long[n+1];
        dp[1]=k;
        dp[2]=k+k*(k-1);
        
        for(int i=3;i<=n;i++){
            long same=((k-1)*dp[i-2])%1000000007;
            long diff=((k-1)*dp[i-1])%1000000007;
            dp[i]=(same+diff)%1000000007;
        }
        return dp[n];
    }
    
    // optimising space complixity by O(1);
    long findTab1(int n,int k){
        if(n==1)return k;
        else if(n==2)return k+k*(k-1);
        
        long pre2=k;
        long pre1=k+k*(k-1);
        
        for(int i=3;i<=n;i++){
            long same=((k-1)*pre2)%1000000007;
            long diff=((k-1)*pre1)%1000000007;
            long sum=(same+diff)%1000000007;
            
            pre2=pre1;
            pre1=sum;
        }
        return pre1;
    }
    
    long countWays(int n,int k)
    {
        //code here.
        // return find(n,k);
        
        // long dp[]=new long[n+1];
        // Arrays.fill(dp,-1);
        // return findMem(n,k,dp);
        
        // return findTab(n,k);
        
        return findTab1(n,k);
    }
}
