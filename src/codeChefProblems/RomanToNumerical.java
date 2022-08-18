package codeChefProblems;

import java.util.Scanner;

public class RomanToNumerical {
	
	static int getValue(char str) {
		if(str=='I')return 1;
		else if(str=='V')return 5;
		else if(str=='X')return 10;
		else if(str=='L')return 50;
		else if(str=='C')return 100;
		else if(str=='D')return 500;
		else if(str=='M')return 1000;
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   int sum=0;
		   String str=sc.next();
		   for(int i=0;i<str.length();i++){
		     if(i+1<str.length()){
		     if(getValue(str.charAt(i))>=getValue(str.charAt(i+1))){
		       sum+=getValue(str.charAt(i));
		     }else{
		       sum=getValue(str.charAt(i+1))-getValue(str.charAt(i))+sum;
		       i++;
		     }
		     }else{
		       if(sum<getValue(str.charAt(i))) {
		    	   sum=getValue(str.charAt(i))-sum;
		       }else {
		    	   sum+=getValue(str.charAt(i)); 
		       }
		     }
		   }
		   System.out.println(sum);

	}

}
