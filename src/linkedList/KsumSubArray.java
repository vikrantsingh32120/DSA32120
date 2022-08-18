package linkedList;

import java.util.*;

public class KsumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,-1,4,3,-6,-7,2};
		Set<Integer> st=new HashSet<>();
		int k=7;
		int sum=0;
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			st.add(arr[i]);
			if(i==0)continue;
			if(st.contains(sum-k)) {
				found=true;
				break;
			}
		}
		System.out.println("found: "+found);
	}

}
