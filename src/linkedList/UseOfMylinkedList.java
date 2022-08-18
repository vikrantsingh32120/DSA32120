package linkedList;

import linkedList.MylinkedList.node;

public class UseOfMylinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MylinkedList myll=new MylinkedList();
		myll.add(5);
		myll.add(7);
		myll.add(12);
		myll.add(13);
		myll.add(14);
//		myll.print();
//		myll.remove(0);
//		myll.print();
//	    myll.addNewNodeAtHead(188);
//	    myll.print();
//		myll.addAtPosition(0, 111);
//		myll.print();
		myll.reverse();
		myll.print();
		}
	}
