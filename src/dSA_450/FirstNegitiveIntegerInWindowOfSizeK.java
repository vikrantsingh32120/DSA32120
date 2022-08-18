package dSA_450;

import java.util.*;

public class FirstNegitiveIntegerInWindowOfSizeK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compute c=new Compute();
		int N = 8;
		long A[] = {-8, 2, 3, -6, 10};
		long B[]= {12,-1,-7,8,-15,30,16,28};
		int K = 3;
		long a[]=c.printFirstNegativeInteger(B, N, K);
		for(long i:a)System.out.print(i+" ");
	}

}
class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        Queue<Long> q=new LinkedList<>();
        long[] ans=new long[N-K+1];
        for(int i=0;i<K-1;i++) {
        	if(A[i]<0)q.add(A[i]);
        }
        for(int i=K-1;i<N;i++) {
        	if(A[i]<0)q.add(A[i]);
        	if(!q.isEmpty()) {
        		ans[i-K+1]=q.peek();
        		if(q.peek()==A[i-K+1])q.poll();
        	}
        	else ans[i-K+1]=0;
        }
        return ans;
    }
}
