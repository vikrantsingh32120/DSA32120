package linkedList;

public class VactorAndStack<E> {
	
	node<E> head;
	
	void push(E data){
		node<E> toAdd=new node<E>(data);
		if(head==null) {
			head=toAdd;
			return;
		}
		node<E> temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=toAdd;
	}
	
	E pop() throws Exception {
		if(head==null) {
			throw new Exception("Pooping from empty stack");
		}
		node<E> temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		E data=temp.next.data;
		temp.next=null;
		return data;
	}
	
	E peep(){
		if(head==null)return null;
		node<E> temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		return temp.data;
	}
	
	static class node<E>{
		E data;
		node<E> next;
		public node(E data) {
			this.data=data;
			next=null;
		}
	}

}
