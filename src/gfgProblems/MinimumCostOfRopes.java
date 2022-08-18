package gfgProblems;

import java.util.Arrays;

public class MinimumCostOfRopes {

	public static void main(String[] args) {
		int n=5;
		int[] arr= {4, 2, 7, 6, 9};
		Arrays.sort(arr);
		int sum=0;
		for(int i=0;i<n-1;i++) {
			int temp=arr[i]+arr[i+1];
			sum+=temp;
			System.out.println(sum);
			arr[i]=0;
			arr[i+1]=temp;
			}
		System.out.println(sum);
	}
}
