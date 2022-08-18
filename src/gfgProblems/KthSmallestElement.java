package gfgProblems;

import java.util.*;

public class KthSmallestElement {

	public static void main(String[] args) {
		int n=5;
		int arr[]= {7,10,4,20,15};
		int K=3;
		Arrays.sort(arr);
        System.out.println(arr[K-1]);
	}

}
