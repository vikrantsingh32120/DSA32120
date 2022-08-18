package hackerEarthProblems;

import java.util.Scanner;

public class CountingGame_gfg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0) {
		String S=sc.next();
		int count=1;
		for(int i=0;i<S.length();i++) {
			char ch=S.charAt(i);
			if(ch>=65 && ch<=90)count++;
		}
		System.out.println(count);
		}
	}

}
