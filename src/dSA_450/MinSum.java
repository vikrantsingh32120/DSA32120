package dSA_450;

import java.util.*;

public class MinSum {
	public static void main(String args[]) {
//		int n=28;
//		int arr[]={1,1,5,2,7,6,1,4,2,3,2,2,1,6,8,5,7,6,1,8,9,2,7,9,5,4,3,1};
		int n=1;
		int arr[]= {1111111};
//		int n=5;
//		int arr[]= {1,4,3,7,9};
		System.out.println(solve(arr,n));
	}
	static String solve(int[] arr, int n) {
		if(n==0)return "0";
        else if(n<2)return Integer.toString(arr[0]);
        else{
    	Arrays.sort(arr);
    	String a="";
    	String b="";
    	for(int i=0;i<n;i++) {
    		if(i%2==0) {
    			int num=arr[i];
    			if(a.length()==0 && arr[i]==0)continue;
    			a+=Integer.toString(num);
    		}else {
    			int num=arr[i];
    			if(b.length()==0 && arr[i]==0)continue;
    			b+=Integer.toString(num);
    		}
    	}
     	System.out.println(a+" "+b);		
    	return sum(a,b);
        }
}
	public static String sum(String a,String b) {
		ArrayList<String> res = new ArrayList<String>();
        String myString = null;
        int i = a.length() - 1;
        int j = b.length() - 1;
        if(j>i) {
        	String temp=a;
        	a=b;
        	b=temp;
        	int tmp=i;
        	i=j;
        	j=tmp;
        }
        Integer carry = 0;
        while(i>=0 && i>j){       	
            int i1 = Integer.parseInt(Character.toString(a.charAt(i)));
            int i2;
            try{
            i2 = Integer.parseInt(Character.toString(b.charAt(j)));
            }catch(Exception e) {
            	i2=0;
            }
            Integer i3  = i1 + i2 + carry;
            if(i3 > 9){
                carry = 1;
                i3 = i3 - 10;
            }else carry = 0;
            res.add(i3.toString());
            i--;j--;
            if(i < 0){
                res.add(carry.toString());
                break;
            }
        }
        Collections.reverse(res);
        String ans="";
        boolean isFound=false;
        for(String ch:res) {
        	if(!ch.equals("0"))isFound=true;
        	if(isFound)ans+=ch;
        }
        return ans;
	}
}
