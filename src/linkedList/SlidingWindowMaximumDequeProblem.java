package linkedList;

import java.util.*;

public class SlidingWindowMaximumDequeProblem {

	public static void main(String[] args) {
		int arr[]= {1,4,6,8,3};
		int k=3;
		Solution s=new Solution();
		int a[]=s.maxSlidingWindow(arr,k);
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	static class Solution {
	    public int[] maxSlidingWindow(int[] arr, int k) {
	    	Deque<Integer> dq=new LinkedList<>();
	    	int n=arr.length;
	    	int ans[]=new int[n-k+1];
	    	int i=0;
	    	for(;i<k;i++) {
	    		while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[i]) {
	    			dq.removeLast();
	    		}
	    		dq.addLast(i);
	    	}
	    	
	    	for(;i<n;i++) {
	    		ans[i-k]=dq.peekFirst();
	    		while(!dq.isEmpty() && dq.peekFirst()<=i-k) {
	    			dq.removeFirst();
	    		}
	    		while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[i]) {
	    			dq.removeLast();
	    		}
	    		dq.addLast(i);
	    	}
	    	ans[i-k]=dq.peekFirst();
	    	
	    	for(int j=0;j<ans.length;j++) {
	    		ans[j]=arr[ans[j]];
	    	}
	        return ans;
	    }
	}
	
}
