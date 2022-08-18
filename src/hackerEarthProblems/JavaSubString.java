package hackerEarthProblems;

import java.util.Scanner;

public class JavaSubString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0) {
		String S=sc.next();
		int L=sc.nextInt(); int R=sc.nextInt()+1; //Assuming 0 based indexing.
		System.out.println(S.substring(L,R));
		}

	}

}
