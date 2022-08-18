package hackerEarthProblems;

import java.util.Scanner;

public class PrintFirstLetterOfEveryWordInTheString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String words[]=s.split(" ");
		String shortForm="";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			char ch=word.charAt(0);
			shortForm+=ch;
		}
		System.out.println(shortForm);
	}

}
