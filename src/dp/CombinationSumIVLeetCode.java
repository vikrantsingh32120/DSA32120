package dp;
import java.util.*;
public class CombinationSumIVLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// using recursion
    public int find(int[] nums,int tar){
        if(tar<0)return 0;
        else if(tar==0)return 1;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=find(nums,tar-nums[i]);
        }
        return ans;
    }
    
     // using recursion+memoization
    public int findMem(int[] nums,int tar,int[] dp){
        if(tar<0)return 0;
        else if(tar==0)return 1;
        else if(dp[tar]!=-1)return dp[tar];
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=findMem(nums,tar-nums[i],dp);
        }
        dp[tar]=ans;
        return dp[tar];
    }
 // using tabulation
    public int findTab(int[] nums,int tar){
        int dp[]=new int[tar+1];
        dp[0]=1;
        for(int i=1;i<=tar;i++){
            for(int j=0;j<nums.length;j++){
                if(i>=nums[j]){
                    dp[i]+=dp[i-nums[j]];
                }
            }
        }
        return dp[tar];
    }
    public int combinationSum4(int[] nums, int target) {
        // return find(nums,target);
        
        // int dp[]=new int[target+1];
        // Arrays.fill(dp,-1);
        // return findMem(nums,target,dp);
        
        return findTab(nums,target);
    }
}
