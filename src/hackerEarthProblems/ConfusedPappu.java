package hackerEarthProblems;

import java.util.Scanner;

public class ConfusedPappu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-- >0) {
		String S=sc.next();
		String S1=S.replace('6', '9');
		int n=Integer.parseInt(S1)-Integer.parseInt(S);
		System.out.println(n);
		}
	}

}
