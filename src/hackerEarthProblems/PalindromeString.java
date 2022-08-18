package hackerEarthProblems;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
        String a=sc.nextLine().toLowerCase();
        String result="";
        for(int i=a.length()-1;i>=0;i--){
            result+=a.charAt(i);            
        }
        
       String isPalindrome=a.equals(result)?"YES":"NO";
       System.out.println(isPalindrome);
	}

}
