package hackerEarthProblems;
import java.util.Scanner;
public class FactorialUsingRecursion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of repeatation: ");
		int t=sc.nextInt();
		while(t-- >0) {
		System.out.print("Enter any integer: ");
		Long a=sc.nextLong();
		System.out.println("factorial of "+a+" is: "+factorial(a));
		}		
	}
	public static Long factorial(Long n) {
		if(n==0 || n==1) {
			return (long) 0;
		}else {
			Long factorial = (long) 1;
			while(n >1) {
				 factorial*=n;
				 n--;
			}
			return factorial;
		}		
	}
}

