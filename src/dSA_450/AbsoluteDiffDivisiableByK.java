package dSA_450;

import java.util.*;

public class AbsoluteDiffDivisiableByK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int arr[] = {3, 7, 11};
		int k = 4;
		System.out.println(countPairs(n, arr, k));
	}
	static long countPairs(int n, int[] arr, int k) {
		// code here
// 		https://www.youtube.com/watch?v=QD1e6XYej0U totural link
		long f[]=new long[k+1];
		for(int i=0;i<n;i++){
		    arr[i]%=k;
		}
		for(int i=0;i<n;i++){
			f[arr[i]]++;
		}
		long sum=0;
		for(long i:f){
		        sum+=(i*(i-1))/2;
		}
		return sum;
	}
}
