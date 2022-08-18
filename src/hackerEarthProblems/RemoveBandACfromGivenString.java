package hackerEarthProblems;

import java.util.Scanner;

public class RemoveBandACfromGivenString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-- >0) {
		String S=sc.next();	
		String S1="";
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)=='b')continue;
			else if(i<S.length()-1 && S.charAt(i)=='a' && S.charAt(i+1)=='c') {
				i++;
				continue;
			}
			S1+=S.charAt(i);
		}
		System.out.println(S1);
		}
	}

}
