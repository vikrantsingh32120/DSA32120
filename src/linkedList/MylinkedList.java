package linkedList;

public class MylinkedList {
	
	static node head;
	
	void add(int data) {
		node toAdd=new node(data);
		if(isEmpty()) {
			head=toAdd;
			return;
		}
		node temp=head;
		while(temp.next!=null) {
			temp=temp.next; 
		}
		temp.next=toAdd;
	}
 void addNewNodeAtHead(int data) {
		node toAdd=new node(data);
		node temp=head;
		toAdd.next=temp;
		head=toAdd;
	}
	
	void addAtPosition(int index,int data) {
		node temp=head;
		node toAdd=new node(data);
		if(index==0) {
			addNewNodeAtHead(data);
		}else {
		for(int i=0;i<index-1;i++) {
			temp=temp.next;
		}
		toAdd.next=temp.next;
		temp.next=toAdd;
		}
	}
	void reverse() {
		node temp=null;
		while(head!=null) {
			node next=head.next;
			head.next=temp;
			temp=head;
			head=next;
		}
		head=temp;
	}
	void remove(int index) {
		node temp =head;
		for(int i=0;i<=index-2;i++) {
			temp=temp.next;		
		}
		if(index==0)head=temp.next;
		else temp.next=temp.next.next;
	}
	boolean isEmpty() {
		return head==null;
	}
	
	void print() {
		node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	static class node{
		int data;
		node next;
		
		public node(int data) {
			this.data=data;
			next=null;
		}
	}
}