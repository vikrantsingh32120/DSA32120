package dSA_450;

import java.util.Scanner;
import java.util.Stack;
import dSA_450.InfixToPostfixUsingStack;
public class EvavulatePostfix {

	public static void main(String[] args) {
		InfixToPostfixUsingStack calPostfix=new InfixToPostfixUsingStack();
		Scanner sc=new Scanner(System.in);
		String infix="2*4+4/2";
		System.out.println("infix-> "+infix);
		String s=calPostfix.evavulateInfixToPostfix(infix);
		System.out.println("postfix-> "+s);
		calculator c=new calculator();
		System.out.println("solution->"+c.evavulatePostfix(s));		
	}

}
class calculator{
	private String opr="-+*/";
	private Stack<Integer> stk=new Stack<>();
	public int evavulatePostfix(String s) {
		int ans=0;
		for(int i=0;i<s.length();i++) {
			String ch="";
			ch+=s.charAt(i);
			if(!opr.contains(ch)) {
				stk.push(Integer.parseInt(ch));
				continue;
			}
			int b=stk.pop();
			int a=stk.pop();
			switch(ch){
			case "-": 
		    		  stk.push(a-b);
					  break;
			case "+":
			          stk.push(a+b);
			          break;
			case "*":
					  stk.push(a*b);
		              break;
			case "/":
				      stk.push(a/b);
	                  break;
			}
		}
		return stk.peek();
	}
}
