package hackerEarthProblems;

import java.util.Scanner;

public class Find_duplicates_under_given_constraints {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0) {
		int A[]=new int[10];
		for(int i=0;i<10;i++){
		    A[i]=sc.nextInt();
		    }
		int index=1;
		for(int i=0;i<10;i++){
		    if(A[i]==A[i+1]) {
		    	System.out.println(A[i]);
		    	break;
		    }
		}
		}
	}

}
