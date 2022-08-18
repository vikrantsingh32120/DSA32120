package hackerEarthProblems;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChanduProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0) {
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}		
		int b[]=new int[n1];
		for(int i=0;i<n1;i++) {
			b[i]=sc.nextInt();
		}
		int index=0;
		int[] c=new int[n+n1];
		
		for(int i=0;i<2;i++) {
			if(i==0) {
				for(int j=0;j<n;j++) {
				c[index++]=a[j];
				}
			}else {
				for(int j=0;j<n1;j++) {
				c[index++]=b[j];
				}
			}
		}
		System.out.println(Arrays.toString(c));
		Arrays.sort(c);
		
		for(int i=n+n1-1;i>=0;i--) {
			System.out.print(c[i]+" ");
		}
	}

	}

}
