package hackerEarthProblems;

import java.util.*;

public class LeftRotation {

	public static void main(String[] args) {
		List<Integer> lis=new LinkedList<Integer>();
	int d=4;
	int n=5;
	lis.add(1);
	lis.add(2);
	lis.add(3);
	lis.add(4);
	lis.add(5);
	int len=lis.size();
    int turns=d%len;
    for(int i=0;i<turns;i++) {
    	System.out.println("_________________________");
        int temp=lis.get(0);
        System.out.println(temp);
        for(int j=0;j<len-1;j++) {
            lis.set(j,lis.get(j+1));
        }
        lis.set(len-1,temp);
    }
	System.out.println(lis);
//	Object[] arr=lis.toArray();
//	int len=arr.length;
//	for(int i=0;i<d%n;i++) {
//		int temp=(int)arr[0];
//		for(int j=0;j<n-1;j++) {
//			arr[j]=arr[j+1];
//		}
//		arr[n-1]=temp;
//	}
//	for(Object i:arr) {
//		System.out.println(i);
//	}
	
////	arrays to linklist:
//	LinkedList<Integer> lis1=new LinkedList<Integer>();
//	Collections.addAll(lis1,arr);
	}
}
