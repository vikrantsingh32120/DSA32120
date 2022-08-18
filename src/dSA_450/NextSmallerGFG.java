package dSA_450;
import java.util.*;
public class NextSmallerGFG {

	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
// 		Arrays.sort(arr);
		for(int i:arr)System.out.print(i+" ");
// 		code here
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[n];
        Arrays.fill(ans,-1);
        for(int i=0;i<n;i++){
            if(st.isEmpty() || arr[st.peek()]<=arr[i]){
                st.push(i);
                continue;
            }
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                ans[st.pop()]=arr[i];
            }
            st.push(i);
        }
        System.out.println();
        for(int i:ans)System.out.print(i+" ");
	}

}
