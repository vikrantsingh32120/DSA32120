package oopsLabRajeevTivariSir;

import java.util.*;

public class FindPrimeNumbersBw1toN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter n-> ");
		int n=sc.nextInt();
		System.out.print("[ ");
		for(int i=3;i<n;i++) {
			boolean isPrime=true;
			for(int j=2;j*j<=i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(!isPrime)continue;
			System.out.print(i+" ");
		}
		System.out.println("]");
	}

}
