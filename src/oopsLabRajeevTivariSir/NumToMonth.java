package oopsLabRajeevTivariSir;

import java.util.Scanner;

public class NumToMonth {

	public static void main(String[] args) {
		System.out.println("Name:Alok dixit\nRoll no:R214220129\nEnter n:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch (n){
		case 1:System.out.println("january");
		break;
		case 2:System.out.println("Febuary");
		break;
		case 3:System.out.println("March");
		break;
		case 4:System.out.println("April");
		break;
		case 5:System.out.println("May");
		break;
		case 6:System.out.println("June");
		break;
		case 7:System.out.println("July");
		break;
		case 8:System.out.println("August");
		break;
		case 9:System.out.println("September");
		break;
		case 10:System.out.println("October");
		break;
		case 11:System.out.println("November");
		break;
		case 12:System.out.println("December");
		break;
		default:System.out.println("invalid input, please enter bw [1-12]");
		}
	}

}
