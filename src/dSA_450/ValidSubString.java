package dSA_450;

import java.util.*;

public class ValidSubString {

	public static void main(String[] args) {
		String s="))()(()";
		Solution sol=new Solution();
		System.out.println(sol.findMaxLen(s));
	}
	
	static class Solution {
	    int findMaxLen(String S) {
	        Stack<Integer> st=new Stack<>();
	        st.push(-1);
	        int maxLen=0;
	        int n=S.length();
	        for(int i=0;i<n;i++){
	            char ch=S.charAt(i);
	            if(ch=='('){
	                st.push(i);
	                continue;
	            }else{
	                st.pop();
	                if(!st.isEmpty()){
	                    int len=i-st.peek();
	                    if(maxLen<len)maxLen=len;
	                }else{
	                    st.push(i);
	                }
	            }
	        }
	        return maxLen;
	    }
	}
}

