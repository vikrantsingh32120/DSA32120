package linkedList;
import linkedList.VactorAndStack.node;
public class MyQueue<E> {
	private node<E> head, rear;
	
	public void enqueue(E data){
		node<E> toAdd=new node<>(data);
		if(head==null) {
			head=rear=toAdd;
			return;
		}
		else {
			rear.next=toAdd;
			rear=rear.next;
		}
	}
	
	public E dequeue(){
		if(head==null)return null;
		else {
			E data=head.data;
			head=head.next;
			if(head==null)rear=head;
			return data;
		}
	}
	
	public void print() {
		node<E> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public E peek() {
		return head.data;
	}
}
