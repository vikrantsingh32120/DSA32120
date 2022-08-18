package dSA_450;
import java.util.*;
public class NextGreaterElementGFG {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		int n=4;
		long arr[]= {1,3,2,4};
        long a[]=new long[n];
        Arrays.fill(a,-1);
        for(int i=0;i<n;i++){ 
            if(st.isEmpty()){
                st.push(i);
                continue;
            }
            if(arr[i]<arr[st.peek()]){
                st.push(i);
                continue;
            }
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                a[st.pop()]=arr[i];
           }
            st.push(i);
        }
        for(long i:a) {
        	System.out.print(i+" ");
        }
	}

}
