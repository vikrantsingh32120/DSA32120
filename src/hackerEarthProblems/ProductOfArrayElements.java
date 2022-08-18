package hackerEarthProblems;

import java.util.Scanner;

public class ProductOfArrayElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int a[]=new int[n];
		long mod=(long)Math.pow(10,9)+7;  //math.pow() gives double value.
		for(int x=0;x<n;x++) {
			a[x]=sc.nextInt();
		}
		long result=1;
		for(int x=0;x<n;x++) {
		result=result*a[x]%mod;      //do not use *= operator and Math.pow() direct.
		}		
		System.out.println(result);
		}
		
	}


