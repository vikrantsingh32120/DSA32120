package userInput;

import java.util.Scanner;

public class ProjectSimpleInterest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter principal amount=");
		int principal=sc.nextInt();
		
		System.out.print("enter rate of interest=");
		float rate=sc.nextFloat();
		
		System.out.print("enter time=");
		float time=sc.nextFloat();
		
		float simpleInterest=(float)principal*rate*time/100;
		
		System.out.print("your simple interest is=");
		System.out.print(simpleInterest+"Rs");

	}

}
