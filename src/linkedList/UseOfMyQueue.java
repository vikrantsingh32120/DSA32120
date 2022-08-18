package linkedList;
import linkedList.MyQueue;
public class UseOfMyQueue {

	public static void main(String[] args) {
		MyQueue<Integer> q=new MyQueue<>();
		System.out.println(q.dequeue());
		q.enqueue(12);
		q.enqueue(15);
		q.enqueue(32);
		
		System.out.println(q.dequeue());
		q.print();
		System.out.println(q.peek());
	}

}
