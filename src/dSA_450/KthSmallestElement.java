package dSA_450;
import java.util.*;
public class KthSmallestElement {

	public static void main(String[] args) {
//		for kth min element
		Queue<Integer> q=new PriorityQueue<>();
		int arr[]= {4,10,15,7,20};
		for(int i:arr) {
			q.add(i);
		}
		int k=3;
		while(k-->1) {
			System.out.println(q.poll());
		}
		System.out.println(q.peek());
		
//		for kth max element
		System.out.println("--------------------------------------");
		Queue<Integer> q1=new PriorityQueue<>(Collections.reverseOrder());
		for(int i:arr) {
			q1.add(i);
		}
		int k1=3;
		while(k1-->1) {
			System.out.println(q1.poll());
		}
		System.out.println(q1.peek());
	}

}
