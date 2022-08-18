package hackerEarthProblems;

import java.util.Scanner;

public class ClosingBracketIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		int pos=sc.nextInt();
		int opBrc=0;
		int clBrc=0;
		for(int i=pos;i<S.length();i++) {
			if(S.charAt(i)=='[')opBrc++;
			if(S.charAt(i)==']')clBrc++;
			if(opBrc-clBrc==0) {
				System.out.println(i);
				break;
			}
		}
	}

}
