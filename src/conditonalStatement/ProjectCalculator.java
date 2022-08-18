package conditonalStatement;
import java.util.Scanner;

public class ProjectCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter 1st number-: ");
		int a=sc.nextInt();
		
		System.out.print("enter 2nd number-: ");
		int b=sc.nextInt();
		
		int result=0;
		
		System.out.print("enter operator  -: ");
		sc.nextLine();
		char operators=sc.nextLine().charAt(0);  //taking char from string.
		
		switch(operators) {
		case '+' :result=a+b;
		break;
		case '-' :result=a-b;
		break;
		case '*' :result=a*b;
		break;
		case '/' :result=a/b;
		break;
		case '%' :result=a%b;
		break;
		default  :System.out.println("invalid operator");
		}
		System.out.print("result          -: "+result);
	}

}
