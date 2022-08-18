package whileLoop;
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();		//Initialization		
		int temp=n;
		int reversed=0;
		
		while(temp>0) {
			int lastdigit=temp%10;
			temp/=10;
			System.out.print(lastdigit+" ");
			System.out.println(temp+" ");
			reversed=reversed*10+lastdigit;
		}
		String rvrs=reversed==n?" is the palindrome number.":" is not the palindrome number.";
		System.out.print(rvrs);
		
//		if(reversed==n) {
//			System.out.print(n+" is the palindrome number.");			
//		}else {
//		System.out.print(n+" is not the palindrome number.");
//		}
	}
}

