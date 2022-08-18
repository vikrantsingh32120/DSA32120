package hackerEarthProblems;

import java.util.Arrays;
import java.util.Scanner;

public class NutBoltsProblems {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char nuts[]=new char[n];
		char bolts[]=new char[n];
		for(int i=0;i<n;i++) {
			nuts[i]=sc.next().charAt(0);
		}for(int i=0;i<n;i++) {
			bolts[i]=sc.next().charAt(0);
		}
		Arrays.sort(nuts);
		Arrays.sort(bolts);
		for(char e:nuts)System.out.print(e+" ");
		System.out.println();
		for(char e:bolts)System.out.print(e+" ");
	}

}
