package dSA_450;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQueue {

	public static void main(String[] args) {
		Queues1 q=new Queues1();
		q.push(2);
		q.push(3);
		q.push(4);
		System.out.println(q.pop());
		q.push(5);
		System.out.println(q.pop());

	}

}
class Queues1
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    // Your code here
	    q1.add(a);
	    int n=q1.size()-1;
	    while(n-- >0) {
	    	int i=q1.remove();
	    	q1.add(i);
	    }
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
	    // Your code here
    	if(!q1.isEmpty())return q1.remove();
    	return -1;
    }
	
}