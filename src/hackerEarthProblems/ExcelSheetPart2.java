package hackerEarthProblems;

import java.util.Scanner;

public class ExcelSheetPart2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int j=0;j<T;j++) {
		String S=sc.next();
		
		int ch1=S.length()-1;
		int n=S.length();
		int num=0;
		for(int i=0;i<n;i++) {
			char ch=S.charAt(ch1);
			ch1--;
			int pow=(int)Math.pow(26, i);
			num=num+(ch-64)*pow;
		}
		System.out.println(num);
		}
	}

}
