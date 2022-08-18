package hackerEarthProblems;

import java.util.Arrays;

public class CheckTwoArrayAreEqualOrNot {

	public static void main(String[] args) {
		int arr[]= {1,2,5,4,4};
		int arr1[]= {1,2,4,4,5};
		Arrays.sort(arr);
		Arrays.sort(arr1);
		System.out.println(Arrays.equals(arr, arr1));
	}

}
