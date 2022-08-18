package userInput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

////		int x= sc.nextInt();
////		
////		double y= sc.nextDouble();
////		
////		System.out.println(x);
////		
////		System.out.println(y);
//		
////		String hello=sc.nextLine();
//		
//		String hi=sc.nextLine();
//		
////		System.out.println(hello);
//		
//		System.out.println(hi);
		 
         System.out.println("================================");
         for(int i=0;i<3;i++){
             String s1=sc.nextLine();
             int x=sc.nextInt();
             System.out.println(s1+"        "+x);
         }
         System.out.println("================================");
	}

}
