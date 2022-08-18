package linkedList;

import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
		List<Integer> ll=new LinkedList<>();
		List<Integer> al=new ArrayList<>();
//		ll.add(12);
//		ll.add(122);
//		System.out.println(ll.get(1));
//		ll.toArray();
//		System.out.println(ll);
		runTime(ll);
		runTime(al);

	}
	
	static void runTime(List<Integer> l) {
		long start=System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			l.add(0,i);
		}
		long end=System.currentTimeMillis();
		System.out.println(l.getClass().getName() +"--> "+(end-start));
	}

}
