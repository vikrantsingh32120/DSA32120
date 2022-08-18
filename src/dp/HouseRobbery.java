package dp;

import java.util.ArrayList;

public class HouseRobbery {

	public static void main(String[] args) {
		// https://leetcode.com/problems/house-robber-ii/submissions/

	}
	 public int rob(int[] nums) {
	        int n=nums.length;
	        if(n==1)return nums[0];
	        
	        ArrayList<Integer> first=new ArrayList<>();
	        ArrayList<Integer> second=new ArrayList<>();
	        
	        for(int i=0;i<n;i++){
	            if(i!=n-1)first.add(nums[i]);       
	            if(i!=0)second.add(nums[i]);
	        }
	        return Math.max(find(first),find(second));
	    }
	    
	    public int find(ArrayList<Integer> nums){
	        int pre2=0;
	        int pre1=nums.get(0);
	        for(int i=1;i<nums.size();i++){
	            int incl=pre2+nums.get(i);
	            int excl=pre1+0;
	            int ans=Math.max(incl,excl);
	            pre2=pre1;
	            pre1=ans;
	        }
	        
	        return pre1;
	    }
}
