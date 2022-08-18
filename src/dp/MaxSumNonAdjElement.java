package dp;

public class MaxSumNonAdjElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//	using recursion
	 int find(int arr[],int n){
	        if(n<0)return 0;
	        if(n==0)return arr[0];
	        
	        int incl=find(arr,n-2)+arr[n];
	        int excl=find(arr,n-1)+0;
	        return Math.max(incl,excl);
	    }
	    // using memoization
	    int findMem(int arr[],int n,int[] dp){
	        if(n<0)return 0;
	        else if(n==0)return arr[0];
	        else if(dp[n]!=-1)return dp[n];
	        
	        int incl=findMem(arr,n-2,dp)+arr[n];
	        int excl=findMem(arr,n-1,dp)+0;
	        dp[n]=Math.max(incl,excl);
	        
	        return dp[n];
	    }
	    
	    // using tabulation
	    int findTab(int arr[]){
	        int dp[]=new int[arr.length];
	        dp[0]=arr[0];
	        for(int i=1;i<dp.length;i++){
	            int incl;
	            if(i>1)incl=dp[i-2]+arr[i];
	            else incl=arr[i];
	            int excl=dp[i-1]+0;
	            dp[i]=Math.max(incl,excl);
	        }
	        return dp[arr.length-1];
	    }
	    
	 // optimising space complixity by O(1);
	    // using tabulation
	    int findTab1(int arr[]){
	        int pre2=0;
	        int pre1=arr[0];
	        for(int i=1;i<arr.length;i++){
	            int incl=pre2+arr[i];
	            int excl=pre1+0;
	            
	            int ans=Math.max(incl,excl);
	            
	            pre2=pre1;
	            pre1=ans;
	        }
	        return pre1;
	    }
	    
	    int findMaxSum(int arr[], int n) {
	        // code here
	        // return find(arr,n-1);
	        
	        // int dp[]=new int[n+1];
	        // Arrays.fill(dp,-1);
	        // return findMem(arr,n-1,dp);
	        
	        return findTab(arr);
	    }
}
