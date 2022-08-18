package hackerEarthProblems;

import java.util.Scanner;

public class GoingToOffice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double D=sc.nextDouble();
		
		double Oc=sc.nextDouble();
		double Of=sc.nextDouble();
		double Od=sc.nextDouble();
		
		double Cs=sc.nextDouble();
		double Cb=sc.nextDouble();
		double Cm=sc.nextDouble();
		double Cd=sc.nextDouble();
		
		double cost1=Od*(D-Of)+Oc;
		//System.out.println(cost1);
		double cost2=Cb+(D*Cd)+(D/Cs)*Cm;
		//System.out.println(cost2);
		
		if (cost2>=cost1) {
			System.out.println("Online Taxi");
			//System.exit(0);
		}else {
			System.out.println("Classic Taxi");
		}
	}
}
