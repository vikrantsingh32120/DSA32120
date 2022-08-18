package loops;
import java.util.Scanner;

public class SeariesSumOf1ByN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter the value of n=  " );
		int n=sc.nextInt();
		float sum=0;
		
		for(float i=1;i<=n;i++) {
			sum+=1/i;
			System.out.println(1/i+"+");
		}
		System.out.print("The sum of series,1+1/2+1/3+...+1/n= "+sum);
	}

}
