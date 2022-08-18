package string;

import java.util.Scanner;

public class JavaStringTokens_hackerRank_javaChallangeProblem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        if(s.length()==0)System.out.println(0);
       else{ String tokens[]=s.split("[!,?._'@\\s]+"); //split by any regular expression.
        System.out.println(tokens.length);
        for(String a:tokens){
           System.out.println(a); 
        }
        scan.close();
       }

	}

}
