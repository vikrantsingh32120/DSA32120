package linkedList;

import java.util.*;

public class ZeroSumSubArray {

	public static void main(String[] args) {
		int arr[]= {3,4,-1,4,3,-6,-7,2};
		Solution sol=new Solution();
		
		List<Integer> a=sol.isZeroSumSubArray(arr);
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("found: "+sol.isZeroSumSubArray1(arr));
	}
	static class Solution{
		public List<Integer> isZeroSumSubArray(int arr[]) {
//			Using Brute Force Approch O(N^2);
			for(int i=0;i<arr.length-1;i++) {
				List<Integer> ans=new ArrayList<>();
				int sum=0;
				for(int j=i;j<arr.length;j++) {
					sum+=arr[j];
					ans.add(arr[j]);
					if(sum==0)return ans;
				}
			}
			return null;
		}
		
		public boolean isZeroSumSubArray1(int arr[]) {
//		using set in O(N) time;
//			Logic :if zero sum preasent in then the commulative sum
//			of two subarray is equal
//			[1,2,-1,-2]
//			<-x->           x==y;
//			<----y---->
			boolean found=false;
			Set<Integer> st=new HashSet<>();
//			HashSet usages hashFunction from HashMap to work in
//			constant time to allocate memory for any element
			int sum=0;
			for(int i:arr) {
				sum+=i;
				st.add(sum);
				if(st.contains(sum)) {
					found=true;
					return found;
				}
			}
			return found;		
		}
	}

}
