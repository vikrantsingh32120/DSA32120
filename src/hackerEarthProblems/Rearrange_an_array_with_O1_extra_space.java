package hackerEarthProblems;

import java.util.Arrays;

public class Rearrange_an_array_with_O1_extra_space {

	public static void main(String[] args) {
/*		Given an array arr[] of size N 
		where every element is in the range from 0 to n-1. 
		Rearrange the given array 
		so that arr[i] becomes arr[arr[i]].                     */
		
		int N=5;
		int arr[] ={4,0,2,1,3};
		int tmp[]=new int[N];
		for(int i=0;i<N;i++) {
			tmp[i]=arr[(int)arr[i]];
		}
		for(int i=0;i<N;i++) {
			arr[i]=tmp[i];
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
