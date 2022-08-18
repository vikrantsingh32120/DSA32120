package dSA_450;

import java.util.*;

public class maxHistogramAreaGFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n=5;
		long[] hist= {5,4,3,2,1};
		System.out.println(getMaxArea(hist, n));
		System.out.println("\n\n---------------------");
		long[] hist1= {1,2,3,4,5};
		System.out.println(getMaxArea(hist1, n));
		System.out.println("\n\n---------------------");
		long[] hist2= {1};
		System.out.println(getMaxArea(hist2, 1));
	}
	public static long getMaxArea(long hist[], long n) 
    {
        // your code here
        Stack<Integer> st=new Stack<>();
        int lb[]=new int[(int) n];
        Arrays.fill(lb, -1);
        int rb[]=new int[(int) n];
        Arrays.fill(rb, (int)n);
        for(int i=0;i<n;i++){
            if(st.isEmpty() || hist[i]>hist[st.peek()]){
                st.push(i);
                continue;
            }
            while(!st.isEmpty() && hist[i]<hist[st.peek()]){
                rb[st.pop()]=i;
            }
            st.push(i);
        }
        
        for(int i=(int) (n-1);i>=0;i--){
            if(st.isEmpty() || hist[i]>hist[st.peek()]){
                st.push(i);
                continue;
            }
            while(!st.isEmpty() && hist[i]<hist[st.peek()]){
                lb[st.pop()]=i;
            }
            st.push(i);
        }
        
        
        long maxAr=0;
        for(int i=0;i<n;i++){
        	System.out.println(lb[i]+" "+rb[i]+" ->>"+hist[i]);
            long width=(rb[i]-lb[i]-1);
            System.out.println("width->>"+width);
            long area=hist[i]*width;
            if(area>maxAr)maxAr=area;
        }
        return maxAr;
    }

}
