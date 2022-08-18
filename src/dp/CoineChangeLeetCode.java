package dp;

import java.util.*;

public class CoineChangeLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        dp[0]=0;
        Arrays.fill(dp,-1);
        int ans=minCoins(amount,coins,dp);
        if(ans==Integer.MAX_VALUE)ans=-1;
        return ans;
    }
    
    static int minCoins(int n, int a[], int dp[]) {	
		if(n == 0) return 0;		
		int ans = Integer.MAX_VALUE;		
		for(int i = 0; i<a.length; i++)
		{
			if(n-a[i] >= 0) {
				int subAns;
				if(dp[n-a[i]] != -1) {
					subAns = dp[n-a[i]];
				} else {
					subAns = minCoins(n-a[i], a, dp);
				}
				if(subAns != Integer.MAX_VALUE && 
						subAns + 1 < ans) {
					ans = subAns + 1;
				}
			}
		}
		return dp[n] = ans;
	}
    
    static int minCoin1(int amount,int[] coin) {
    	int dp[]=new int[amount+1];
    	Arrays.fill(dp, Integer.MAX_VALUE);
    	dp[0]=0;
    	for(int i=0;i<=amount;i++) {
    		for(int j=0;j<coin.length;j++) {
    			if(i-coin[j]>=0 && dp[i-coin[j]]!=Integer.MAX_VALUE) {
    				dp[i]=Math.min(dp[i], 1+dp[i-coin[j]]);
    			}
    		}
    	}
		if(dp[amount]==Integer.MAX_VALUE)return -1;
		return dp[amount];
    }
}
