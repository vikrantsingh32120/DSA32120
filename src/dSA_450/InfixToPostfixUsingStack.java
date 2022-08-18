package dSA_450;

import java.util.Stack;

public class InfixToPostfixUsingStack {
	private String opr="-+*/";
	private String postfix="";
	String evavulateInfixToPostfix(String infix) {
		Stack<String> s=new Stack<>();
		for(int i=0;i<infix.length();i++) {
			String ch="";
			ch+=infix.charAt(i);
			if(!opr.contains(ch)) {
				postfix+=ch;
				continue;
			}
			if(s.isEmpty()) {
				s.push(ch);
				continue;
			}else {
				if(opr.indexOf(s.peek())<opr.indexOf(ch)) {
					s.push(ch);
					continue;
				}
				while(!s.isEmpty() && opr.indexOf(s.peek())>opr.indexOf(ch)){
					if(opr.indexOf(s.peek())>=opr.indexOf(ch)) {
						postfix+=s.pop();
					}
				}
				if(!s.isEmpty() && opr.indexOf(s.peek())==opr.indexOf(ch)) {
					postfix+=s.pop();
			}
				s.push(ch);
			}
	}

		while(!s.isEmpty()) {
			postfix+=s.pop();
		}
		return postfix;
	}

}
