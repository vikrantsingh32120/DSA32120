package hackerEarthProblems;

import java.util.Scanner;

public class ToggleString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		String result="";
		for(char e:S.toCharArray()) {
			String word="";
			word+=e;         //can't use String word+=e;
			String a=word.toLowerCase();
			String b=word.toUpperCase();
			if(word.equals(a))result+=word.toUpperCase();
			else result+=word.toLowerCase();
			
		}
		System.out.println(result);
	}

}
