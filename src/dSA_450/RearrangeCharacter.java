package dSA_450;

import java.util.*;

public class RearrangeCharacter {

	public static void main(String[] args) {
//		 maxFreqEle<=n-maxFreqEle+1 return 1 else 0
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    String str=sc.next();
		    int charArr[]=new int[26];
		    for(int c:str.toCharArray()) {
		    	charArr[c-97]++;
		    }
		    Arrays.sort(charArr);
		    if(charArr[26-1]<=str.length()-charArr[26-1]+1) {
		    	System.out.println(1);
		    }else {
		    	System.out.println(0);
		    }
		}
	}
}
