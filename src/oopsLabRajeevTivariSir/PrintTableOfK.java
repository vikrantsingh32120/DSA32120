package oopsLabRajeevTivariSir;

import java.util.*;

public class PrintTableOfK {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter k-> ");
		int k=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(k+" X "+i+" = "+i*k);
		}
	}

}
