package hackerEarthProblems;

import java.util.Scanner;

public class SumOfArrayElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int result=0;
		for(int e:arr) {
			result+=e;
		}
		System.out.println(result);
	}

}
