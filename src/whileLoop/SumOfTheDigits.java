package whileLoop;
import java.util.Scanner;

public class SumOfTheDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		
		while(temp>0) {
			int lastdigit=temp%10;
			temp/=10;     //reinitialisation;
			sum+=lastdigit;
		}
		System.out.println("the sum of the digit of "+n+" is "+sum);
		
//		to find out digit by maths formula.
		int digit=(int)Math.log10(n) +1;
		System.out.println(digit+" digit;");
	}

}
