package hackerEarthProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Inverse_permutation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0) {
		int n=sc.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		int num=1;
		int pos=0;
		int temp[]=new int[n];
		for(int i=0;i<n;i++) {
			num=i+1;
			for(int j=0;j<n;j++) {
				if(A[j]==num) {
					pos=j+1;
					break;
				}
			}
			System.out.print(pos+" ");
			//temp[i]=pos;
		}
		}
		//System.out.println(Arrays.toString(temp));
	}

}
