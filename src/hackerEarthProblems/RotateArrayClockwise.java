package hackerEarthProblems;

import java.util.Arrays;

public class RotateArrayClockwise {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,8,9,6,7};
		int D=2;
		int[] a=Arrays.copyOfRange(arr,0,D);
		int[] b=Arrays.copyOfRange(arr, D, arr.length);
		for(int e:b) {
			System.out.print(e+" ");
		}
		for(int e:a) {
			System.out.print(e+" ");
		}
	}
}
