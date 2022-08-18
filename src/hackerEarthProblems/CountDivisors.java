package hackerEarthProblems;

import java.util.Scanner;

public class CountDivisors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int r=sc.nextInt();
		int k=sc.nextInt();
		int count=0;
		for(int j=i;j<=r;j++) {
			if(j%k==0)count++;
		}
		System.out.println(count);
	}

}
