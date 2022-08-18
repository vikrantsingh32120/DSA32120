package hackerEarthProblems;

import java.util.Scanner;

public class Duration {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n>0) {
			int SH=sc.nextInt(); int SM=sc.nextInt();
			int EH=sc.nextInt(); int EM=sc.nextInt();
			
			int totlMin1=(SH*60)+SM;
			int totlMin2=(EH*60)+EM;
			int totalMin=totlMin2-totlMin1;
			int workingHr=totalMin/60;
			int workingMn=totalMin%60;
			System.out.println(workingHr+" "+workingMn);
			n--;
		}

	}

}
