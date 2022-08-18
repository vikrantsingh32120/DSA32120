package linkedList;

import java.util.ArrayList;

public class MyMaxPriorityQueue {

	public ArrayList <Integer> arr1=new ArrayList<>();
	
//	add function
	void Add(int data) {
		arr1.add(data);
		if(arr1.size()>1) {
			upHeapify(arr1.size()-1);
		}
	}
//	upHeapify
	void upHeapify(int i) {
		if(i==0)return;
		
		int pi=(i-1)/2;
		if(arr1.get(i)>arr1.get(pi)) {
			swap(i,pi);
			upHeapify(pi);
		}
	}

//	swap function
	void swap(int i, int pi) {
		int iData=arr1.get(i);
		int piData=arr1.get(pi);
		arr1.set(i, piData);
		arr1.set(pi, iData);
	}
//	remove function
	int remove() {
    	if(arr1.isEmpty()) {
    		System.out.println("noSuchElementException");
    		return -1;
    	}
    	else if(arr1.size()<=2)return arr1.remove(0);
		swap(0, arr1.size()-1);
		int val=arr1.remove(arr1.size()-1);
		downHeapify(0);
		return val;
	}
	
//	downHeapify
	void downHeapify(int i) {
    	if(i==arr1.size()-1)return;
    	int max=i;
    	int lCi=2*i+1;
    	if(lCi<arr1.size() && arr1.get(lCi)>arr1.get(max)) {
    		max=lCi;
    	}
    	
    	int rCi=2*i+2;
    	if(rCi<arr1.size() && arr1.get(rCi)>arr1.get(max)) {
    		max=rCi;
    	}
    	
    	if(max!=i) {
    		swap(i, max);
        	downHeapify(max);
    	}
    }
//	peek function
	int peek() {
    	if(arr1.size()==0) {
    		System.out.println("nullPointException");
    		return -1;
    	}
    	return arr1.get(0);
    }

}
