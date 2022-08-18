package deShawQuestions;

import java.util.*;

public class MajorityElementgfg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5 ;
		int A[] = {3,1,3,3,2};
		System.out.println(majorityElement(A, N));
	}
	static int majorityElement(int a[], int size)
    {
        // your code here
		HashMap<Integer,Integer> arr=new HashMap<>();
        for(int i=0;i<size;i++) {
        	if(arr.containsKey(a[i])) {
        		arr.replace(a[i], arr.get(a[i])+1);
        	}else {
        		arr.put(a[i], 1);
        	}
        }
        int ans[]=new int[2];
        for(int key:arr.keySet()) {
        	if(arr.get(key)>ans[1]){
        	    ans[0]=key;
        		ans[1]=arr.get(key);
        	}
        }
		if(ans[1]>size/2)return ans[0];
		return -1;
    }
}
