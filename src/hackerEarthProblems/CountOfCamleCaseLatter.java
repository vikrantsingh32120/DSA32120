package hackerEarthProblems;

import java.util.Scanner;

public class CountOfCamleCaseLatter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++) {
			String S=sc.next();
			int count=0;
			for(int j:S.toCharArray()) {
				if(j>=65 && j<=90) {
					count++;
				}
				
			}
			System.out.println(count);
		}

	}

}
