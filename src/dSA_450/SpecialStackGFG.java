package dSA_450;

import java.util.*;

public class SpecialStackGFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GfG spstk=new GfG();
		Stack<Integer> s=new Stack<Integer>();
		s.push(10);
		s.push(12);
		s.push(5);
		s.push(19);
		s.push(23);
		System.out.println(spstk.min(s));
	}

}
class GfG{
	public void push(int a,Stack<Integer> s)
	{
	    //add code here.
	    s.push(a);
	}
	public int pop(Stack<Integer> s)
        {
            //add code here.
		return s.pop();
	}
	public int min(Stack<Integer> s)
        {
           //add code here.
		int n=s.size();
		int min=s.peek();
		for(int i:s) {
			min=Math.min(min,i);
		}
		return min;
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           //add code here.
		return s.peek()==s.get(n-1);
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           //add code here.
		return s.isEmpty();
	}
}
