package hackerEarthProblems;

import java.util.Scanner;

public class Prateek_problem {

	public static void main(String[] args) {
		// Prateek wants to give a party to
		//his N friends on his birthday, 
		// where each friend is numbered from 1 to N. [hackerEarth]
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int Arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			Arr[i]=sc.nextInt();
		}
		int sum=0;
		boolean isExist=false;
		for(int j=0;j<n;j++) {
			sum=0;
		for(int i=j;i<n;i++) {
			if(sum<x) {
				sum+=Arr[i];
				System.out.println(sum);
			}
			if(sum==x) {
				isExist=true;
				break;
			}
			if(sum>x) {
				continue;
			}
		}
		if(sum==x)break;
		}
		if(isExist)System.out.println("YES");
		else System.out.println("NO");
	}

}
