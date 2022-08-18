package hackerEarthProblems;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		int[] A=new int[256];
		String S1="";
		for(char e:S.toCharArray()) {
			int index=(int)e;
			if(A[index]==0) {
				S1+=e;
				A[index]+=1;
			}
		}
		System.out.println(S1);
	}

}
