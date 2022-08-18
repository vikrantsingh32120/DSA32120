package hackerEarthProblems;
import java.util.Scanner;

public class Divisiable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long N=sc.nextLong();
		long sum=0;
		long half=(N/2);
		
		for(long i=0;i<N;i++) {
			long n=sc.nextInt();
			long lstdgt=0;
			if(i<half){
				while(n>0) {
					lstdgt=n%10;
					n=n/10;
				}			
			}
			if(i>=half) {
				lstdgt=n%10;
			}
			System.out.println(lstdgt);
			
			sum=sum*10+lstdgt;
			System.out.println(sum);
		}
		if(sum%11==0)System.out.println("OUI");
		else System.out.println("NON");
	}
}

