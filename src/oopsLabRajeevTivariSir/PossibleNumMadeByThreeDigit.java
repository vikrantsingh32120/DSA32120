package oopsLabRajeevTivariSir;

import java.util.Scanner;

public class PossibleNumMadeByThreeDigit {

	public static void main(String[] args) {
		System.out.print("Name:Alok dixit\nRoll no:R214220129\n");
		Scanner sc=new Scanner(System.in);
		String[] c= {sc.next(),sc.next(),sc.next()};
		System.out.println(c[0]+c[1]+c[2]+"\n"+c[0]+c[2]+c[1]);
		System.out.println(c[1]+c[0]+c[2]+"\n"+c[1]+c[2]+c[0]);
		System.out.println(c[2]+c[1]+c[0]+"\n"+c[2]+c[0]+c[1]);
	}

}
