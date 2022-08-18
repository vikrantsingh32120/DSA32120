package hackerEarthProblems;

import java.util.Scanner;

public class NthNumberMadeOfPrimeDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0) {
		int N=sc.nextInt();
		int count=0;
		
		for(int i=2;;i++) {
			String S="";
			S+=i;
			if(S.contains("0") || S.contains("1") || S.contains("4") ||S.contains("6")||S.contains("8")||S.contains("9"))continue;
			System.out.println(S);
			count=count+1;
			if(count==N) {
				System.out.println(i);
				break;
			}
		  }
		}
	}

}
