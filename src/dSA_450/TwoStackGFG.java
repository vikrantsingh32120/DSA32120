package dSA_450;

import java.util.*;

public class TwoStackGFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stacks stk=new Stacks();
		TwoStack sq=new TwoStack();
		stk.push1(2, sq);
		stk.push1(3, sq);
		stk.push2(4, sq);
		
		System.out.println(stk.pop1(sq));
		System.out.println(stk.pop2(sq));
		System.out.println(stk.pop2(sq));
	}
}
class TwoStack{

	int size;
	int top1,top2;
	int arr[] = new int[100];

	TwoStack()
	{
		size = 100;
		top1 = -1;
		top2 = size;
	}
}
class Stacks{
	    //Function to push an integer into the stack1.
	    void push1(int x, TwoStack sq)
	    {
	        if(sq.top1<0){
	            sq.arr[sq.top1+1]=x;
	            sq.top1++;
	        }else{
	            sq.arr[sq.top1+1]=x;
	            sq.top1++;
	        }
	    }

	    //Function to push an integer into the stack2.
	    void push2(int x, TwoStack sq)
	    {
	        if(sq.top2==sq.size){
	        sq.arr[sq.top2-1]=x;
	        sq.top2--;
	        }else{
	            sq.arr[sq.top2-1]=x;
	            sq.top2--;
	        }
	    }

	    //Function to remove an element from top of the stack1.
	    int pop1(TwoStack sq)
	    {
	        int data=-1;
	        if(sq.top1!=-1){
	            data=sq.arr[sq.top1];
	            sq.top1--;
	        }
	        return data;
	    }

	    //Function to remove an element from top of the stack2.
	    int pop2(TwoStack sq)
	    {
	        int data=-1;
	        if(sq.top2!=sq.size){
	            data=sq.arr[sq.top2];
	            sq.top2++;
	        }
	        return data;
	    }
	}
