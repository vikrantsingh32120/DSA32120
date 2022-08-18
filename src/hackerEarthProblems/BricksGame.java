package hackerEarthProblems;

import java.util.Scanner;

public class BricksGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int D=n;
		for(int i=1;i<=n;i++) {
			D=D-i;
			int patlu=D;
			//System.out.println(patlu);
			if(patlu<=0) {
				System.out.println("Patlu");
				break;				
			}
			D=D-i*2;
			int motu=D;
			//System.out.println(motu);
			if(motu<=0) {
				System.out.println("Motu");
				break;
			}
			
		}

	}

}
