package linkedList;

public class PriorityQueueImplementationUsingCBT {

	public static void main(String[] args) {
//		Using myPriorityQueue class (min heap)
		MyPriorityQueue p=new MyPriorityQueue();
//		int a[]= {4,10,3,5,1};
		int a[]= {10,9,8,7,6,5,4,3,2,1};
		for(int i:a)p.Add(i);
		while(p.peek()!=-1)System.out.print(p.remove()+" ");
		
//		Using myPriorityQueue class (max heap)
//		MyMaxPriorityQueue p1=new MyMaxPriorityQueue();
//		for(int i:a)p1.Add(i);
//		while(p1.peek()!=-1)System.out.print(p1.remove()+" ");
	}
}
