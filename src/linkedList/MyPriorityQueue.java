package linkedList;

import java.util.*;

public class MyPriorityQueue {

	public ArrayList<Integer> arr=new ArrayList<>();
	
	void Add(int data) {
		arr.add(data);
		if(arr.size()>1) {
			upHeapify(arr.size()-1);
		}
	}
	
	void upHeapify(int i) {
		if(i==0)return;
		
		int pi=(i-1)/2;
		if(arr.get(i)<arr.get(pi)) {
			swap(i,pi);
			upHeapify(pi);
		}
	}
	void swap(int i, int pi) {
		int iData=arr.get(i);
		int piData=arr.get(pi);
		arr.set(i, piData);
		arr.set(pi, iData);
	}
    int remove() {
    	if(arr.isEmpty()) {
    		System.out.println("noSuchElementException");
    		return -1;
    	}
    	else if(arr.size()<=2)return arr.remove(0);
		swap(0, arr.size()-1);
		int val=arr.remove(arr.size()-1);
		downHeapify(0);
		return val;
	}
    
    void downHeapify(int i) {
    	if(i==arr.size()-1)return;
    	int min=i;
    	int lCi=2*i+1;
    	if(lCi<arr.size() && arr.get(lCi)<arr.get(min)) {
    		min=lCi;
    	}
    	
    	int rCi=2*i+2;
    	if(rCi<arr.size() && arr.get(rCi)<arr.get(min)) {
    		min=rCi;
    	}
    	
    	if(min!=i) {
    		swap(i, min);
        	downHeapify(min);
    	}
    }
    
    int peek() {
    	if(arr.size()==0) {
    		System.out.println("nullPointException");
    		return -1;
    	}
    	return arr.get(0);
    }
}
