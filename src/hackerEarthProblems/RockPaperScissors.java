package hackerEarthProblems;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// The winning rules of RPS are given below:
              //Rock crushes scissor.
              //Scissor cuts paper.
              //Paper envelops rock.
		Scanner sc=new Scanner(System.in);		
		int T=sc.nextInt();
		while(T-- >0) {
			String S=sc.next();
			if(S.equals("RR") || S.equals("SS") || S.equals("PP")) {
				System.out.println("DRAW");
			}
			else if(S.equals("RS") || S.equals("SP") || S.equals("PR"))
				System.out.println("A");
			else {
				System.out.println("B");
			}
//			char A=S.charAt(0);char B=S.charAt(1);
//			if(A==B)System.out.println("DRAW");
//			else {
//				if(A=='R' && B=='S')System.out.println('A');
//				if(A=='S' && B=='P')System.out.println('A');
//				if(A=='P' && B=='R')System.out.println('A');
//				if(B=='R' && A=='S')System.out.println('B');
//				if(B=='S' && A=='P')System.out.println('B');
//				if(B=='P' && A=='R')System.out.println('B');
//			}
			}
		}

	}

