package dp;
import java.util.*;
public class MinCostClimbingStair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 // using memozation
      static int find(int n,int[] dp,int[] cost){
          if(n==0)return dp[n]=cost[0];
          else if(n==1)return dp[n]=cost[1];
          else if(dp[n]!=-1)return dp[n];
          dp[n]=cost[n]+Math.min(find(n-1,dp,cost), find(n-2,dp,cost))%100000007;
          return dp[n];
      }
     
    //  using tabulation
    static int find1(int n,int[] cost){
        int dp[]=new int[n+1];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<n;i++){
            dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[n-1],dp[n-2]);
     }
    
	//  space optimization in O(1)
	  static int find2(int n,int[] cost){
	     int pre2=cost[0];
	     int pre1=cost[1];
	     for(int i=2;i<n;i++){
	         int curr=cost[i]+Math.min(pre1,pre2);
	         pre2=pre1;
	         pre1=curr;
	     }
	     return Math.min(pre1,pre2);
	  }
    
    static int minCostClimbingStairs(int[] cost , int n) {
        //Write your code here
        // int dp[]=new int[n+1];
        // Arrays.fill(dp,-1);
        // return Math.min(find(n-1,dp,cost),find(n-2,dp,cost));
        
//        return find1(n,cost);
        
        return find2(n,cost);
    }
    
}
