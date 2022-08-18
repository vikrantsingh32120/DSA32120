package hackerEarthProblems;

import java.util.Scanner;

public class MrXbirthParty {

	public static void main(String[] args) {
		/* He wants to buy such a packet which contains
		number of chocolates,
		which can be distributed equally among all of his friends.*/
		Scanner sc=new Scanner(System.in);		
		int N=sc.nextInt();
		int M=sc.nextInt();
		if(M%N==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
