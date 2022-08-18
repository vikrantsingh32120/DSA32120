package dSA_450;

import java.util.*;

public class ReverseaStringUsingStack {

	public static void main(String[] args) {
		Solution stack=new Solution();
		String s="GeeksforGeeks";
		System.out.println(stack.reverse(s));
	}

}
class Solution {
    
    public String reverse(String S){
        //code here
        Stack<Character> stk=new Stack<>();
        for(char ch:S.toCharArray()){
            stk.add(ch);
        }
        String str="";
        int i=stk.size();
        while(i-- >0){
            str+=stk.pop();
        }
        return str;
    }
}
