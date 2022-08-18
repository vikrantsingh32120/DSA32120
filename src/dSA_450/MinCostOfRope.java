package dSA_450;

import java.util.PriorityQueue;

public class MinCostOfRope {

	public static void main(String[] args) {
		int arr[]={4,2,7,6,9};
		System.out.println(getMinCost(arr));
	}
	static int getMinCost(int arr[]) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i:arr)pq.add(i);
		int sum[]=new int[arr.length-1];
		int index=0;
		while(pq.size()>1) {
			sum[index]=pq.poll()+pq.poll();
			pq.add(sum[index]);
			index++; 
		}
		int ans=0;
		for(int i:sum)ans+=i;
		return ans;
	}
}
