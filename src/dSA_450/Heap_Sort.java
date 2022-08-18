package dSA_450;
import java.util.*;

public class Heap_Sort {

	void printArray(int arr[],int n)
    {
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        Heap_Sort hs = new Heap_Sort();
        int arr[] = new int[1000000];
        int T = sc.nextInt();
        while(T>0)
        {
            int n = sc.nextInt();
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
                
            Solutio ob=new Solutio();
            ob.heapSort(arr, n);
            hs.printArray(arr,n);
            T--;
        }
    }
}
class Solutio
{
    void Add(ArrayList<Integer> arr,int data) {
		arr.add(data);
		System.out.println(arr);
		if(arr.size()>1) {
			upHeapify(arr, arr.size()-1);
		}
	}
	 int remove(ArrayList<Integer> arr) {
	    	if(arr.isEmpty()) {
//	    		System.out.println("noSuchElementException");
	    		return -1;
	    	}
	    	else if(arr.size()<=2)return arr.remove(0);
			swap(arr, 0, arr.size()-1);
			int val=arr.remove(arr.size()-1);
			downHeapify(arr, 0);
			return val;
		}
	    
	    void downHeapify(ArrayList<Integer>arr,int i) {
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
	    		swap(arr, i, min);
	        	downHeapify(arr, min);
	    	}
	    }
	    
	 void swap(ArrayList<Integer> arr,int i, int pi) {
			int iData=arr.get(i);
			int piData=arr.get(pi);
			arr.set(i, piData);
			arr.set(pi, iData);
		}
	 //Heapify function to maintain heap property.
	 void upHeapify(ArrayList<Integer> arr,int i) {
			if(i==0)return;
			
			int pi=(i-1)/2;
			if(arr.get(i)<arr.get(pi)) {
				swap(arr, i,pi);
				upHeapify(arr, pi);
			}
		}
	    void heapSort(int arr[], int n)
	    {
	        //code here
	    	ArrayList<Integer> arr1=new ArrayList<>();
			 for(int i=0;i<n;i++)Add(arr1,arr[i]);
			 for(int i=0;i<n;i++) {
				arr[i]=remove(arr1);
			 }
	        
	    }
 }

