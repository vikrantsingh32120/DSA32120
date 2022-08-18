package anagramOfStrings;

import java.util.Scanner;

public class ReverseWordInGivenString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter words:");
		String a=sc.nextLine();
		String words[]=a.split(" ");
		String reversedString="";
		
		System.out.println("reverse of words:");
		for(int i=words.length-1;i>=0;i--) {
			String reverseWord="";
			String word=words[i];			
			for(int j=0;j<word.length();j++) {
				reverseWord+=word.charAt(j);
			}
			if(reverseWord.isEmpty())continue;
//			System.out.print(reverseWord+" ");
			reversedString+=reverseWord+" ";
		}
		System.out.println(reversedString);
	}

}
