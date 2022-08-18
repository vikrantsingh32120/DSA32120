package hackerEarthProblems;

import java.util.Scanner;

public class IsPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		String newS="";
        int isPalindrome=0;
        for(int i=S.length()-1;i>=0;i--){
            newS+=S.charAt(i);
        }
        if(S.equals(newS))isPalindrome=1;
        System.out.println(isPalindrome);
	}

}
