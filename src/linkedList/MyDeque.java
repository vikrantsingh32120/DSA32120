package linkedList;

import java.util.*;

public class MyDeque<E> {
	private node<E> head, rear;
	
	class node<E>{
		E data;
		node<E> next, prev;
		
		public node(E data){
			this.data=data;
			next=null;
			prev=null;
		}
	}
	
	public void addFirst(E data) {
		node<E> toAdd=new node<>(data);
		if(head==null) {
			head=rear=toAdd;
			return;
		}
		toAdd.next=head;
		head.prev=toAdd;
		head=toAdd;
	}
	
	public void addLast(E data) {
		node<E> toAdd=new node<>(data);
		if(head==null) {
			head=rear=toAdd;
			return;
		}
		toAdd.prev=rear;
		rear.next=toAdd;
		rear=toAdd;
	}
	
	public E removeFirst() throws Exception{
		if(head==null){
			throw new Exception("No such element");
		}
		E data=head.data;
		head=head.next;
		head.prev=null;
		if(head==null)rear=null;
		return data;
	}
	
	public E removeLast() throws Exception{
		if(head==null){
			throw new Exception("No such element");
		}
		E data=rear.data;
		rear=rear.prev;
		rear.next=null;
		if(rear==null)head=null;
		return data;
	}
	
	public E getFirst() throws Exception{
		if(head==null) {
			throw new Exception("No such element");
		}
		return head.data;
	}
	
	public E getLast() throws Exception{
		if(head==null) {
			throw new Exception("No such element");
		}
		return rear.data;
	}
	
	public void print() {
		node<E> temp=head;
		if(head==null) {
			System.out.println("null");
			return;
		}
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}
