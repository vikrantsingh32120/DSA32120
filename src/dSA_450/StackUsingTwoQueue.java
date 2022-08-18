package dSA_450;
import java.util.*;
public class StackUsingTwoQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queues q=new Queues();
		q.push(2);
		q.push(3);
		System.out.println(q.pop());
		q.push(4);
		System.out.println(q.pop());
	}

}
class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    // Your code here
	    q2.add(a);
	    while(!q1.isEmpty()) {
	    	q2.add(q1.remove());
	    }
	    while(!q2.isEmpty()) {
	    	q1.add(q2.remove());
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
