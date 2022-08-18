package hackerEarthProblems;
import java.util.Scanner;
public class CostOfBalloons {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int i=0;i<T;i++) {
		    int colourOne=sc.nextInt();
            int colourTwo=sc.nextInt();                      
            int n=sc.nextInt();
            int c1=0;
            int c2=0; 
            for(int j=0;j<n;j++){
                int A=sc.nextInt();
                if(A==1)c1++;
                int B=sc.nextInt();
                if(B==1)c2++;
            }
            int min1=colourOne*c1+colourTwo*c2;
            int min2=colourOne*c2+colourTwo*c1;
            System.out.println(Math.min(min1, min2));
        }
            
	}

}
