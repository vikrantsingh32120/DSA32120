package gfgProblems;

import java.util.Scanner;

public class SaradProblemsHackerrank {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            String s=sc.next().toLowerCase();
            String s1="";
            for(char a:s.toCharArray()){
                if (!(a=='a' | a=='e' | a=='i' | a=='o' | a=='u')){
                    s1+="."+a;
                }
            }
            System.out.println(s1);
        }

	}

}
