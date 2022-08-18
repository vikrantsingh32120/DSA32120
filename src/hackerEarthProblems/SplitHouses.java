package hackerEarthProblems;

import java.util.Scanner;

public class SplitHouses {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number = sc.nextInt(); 
        String village = sc.next();
         if(village.contains("HH")){
             System.out.println("NO"); 
         }else if(village.contains(".")){
             village=village.replace('.','B');
             System.out.println("YES"); 
             System.out.println(village); 
         }else if(village.contains("H")){
             System.out.println("YES"); 
             System.out.println(village); 
         }
	}
}
