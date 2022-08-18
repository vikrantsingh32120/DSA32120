package tree;

import java.util.*;

public class KGoodTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            if(n==1 || n==2) {
            	System.out.println(1);
            	continue;
            }
            int ans=2;
            for(int i=3;i<n;i++){
                int a=n-i;
                int b=i-1;
                if(a%b==0)ans++;
            }
            System.out.println(ans);
        }
        sc.close();
	}

}
