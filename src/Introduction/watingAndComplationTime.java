package Introduction;
import java.util.Arrays;
import java.util.Scanner;
public class watingAndComplationTime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[4];
		int b[]=new int[4];
		int complationTime=0;
		int watingTime=0;
		for(int i=0;i<4;i++) {
			watingTime=complationTime;
			System.out.println("p"+(i+1)+"-------------------");
			System.out.println("wating time:"+watingTime);
			System.out.print("brust time:");
			a[i]=sc.nextInt();
			b[i]=i+1;
			complationTime+=a[i];
			System.out.println("complation time="+complationTime);
		}
		System.out.println("Before swaping:");
		for(int i=0;i<4;i++) {
			System.out.println("P"+b[i]+":"+a[i]);
		}
		
		for(int i=0;i<4-1;i++) {    
			for(int j=0;j<4-1-i;j++) {
				if( a[j+1] < a[j] ) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					
					int temp2=b[j+1];
					b[j+1]=b[j];
					b[j]=temp2;
					}
				}
		}
		for(int i:b)System.out.println(i);
		System.out.println("After swaping:");
		for(int i=0;i<4;i++) {
			System.out.println("P"+b[i]+":"+a[i]);
		}
		
	}

}
