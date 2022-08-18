package dSA_450;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> input=new LinkedList<>();
		input.add(1);
		input.add(2);
		input.add(3);
		Queue<Integer> output=new LinkedList<>();
		output.add(2);
		output.add(1);
		output.add(3);
		Stack<Integer> st=new Stack<>();
		while(!input.isEmpty()) {
			int ele=input.poll();
			if(ele==output.peek()) {
				output.poll();
				while(!st.isEmpty()) {
					if(st.peek()==output.peek()) {
						st.pop();
						output.poll();
					}else {
						break;
					}
				}
			}else {
				st.push(ele);
			}
			}
		if(st.isEmpty() && input.isEmpty())System.out.println(true);
		else System.out.println(false);
	}

}
