package hackerEarthProblems;

import java.util.Scanner;

public class MakingLaddus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int k=sc.nextInt();
		    int n=sc.nextInt();
		    
		    int suger[]=new int[n*2];
		    for(int i=0;i<suger.length;i++){
		        suger[i]=sc.nextInt();
		    }
		    boolean cef=false;
		    for(int i=0;i<suger.length;i+=2){
		        if(suger[i+1]<=k){
		            if(suger[i]+y>=x){
		                cef=true;
		                break;
		            }
		        }
		            
		        else{
		        	cef=false;
		            continue;
		        }
		    }
		    if(cef)System.out.println("LuckyChef");
		    else System.out.println("UnluckyChef");
		    
		}

	}

}
