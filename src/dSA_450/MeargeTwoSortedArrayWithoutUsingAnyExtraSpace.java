package dSA_450;

import java.util.Arrays;

public class MeargeTwoSortedArrayWithoutUsingAnyExtraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {};
		int arr2[]= {1,9,6,9,8,5,0};
		merge(arr1, arr2, arr1.length, arr2.length);
		for(int i:arr1)System.out.print(i+" ");
		for(int i:arr2)System.out.print(i+" ");
	}

	public static void merge(int arr1[], int arr2[], int n, int m) {
        // using gap Algo.
        int gap=n+m;
        
        while(gap>1){
            gap=(gap/2)+(gap%2);
//            System.out.println("gap="+gap);
            int p1=0;
            int p2=gap;
            if(p1<n && p2<n){
                while(p1<n && p2<n){
                    if(arr1[p1]>arr1[p2]){
                        int temp=arr1[p1];
                        arr1[p1]=arr1[p2];
                        arr1[p2]=temp;
                    }
                    p1++;
                    p2++;
                }
            }
            if(p1<n && p2>=n){
                p2=0;
                while(p1<n && p2<m){
                    if(arr1[p1]>arr2[p2]){
                        int temp=arr1[p1];
                        arr1[p1]=arr2[p2];
                        arr2[p2]=temp;
                    }
                    p1++;
                    p2++;
                }
            }
            if(p1>n && p2<m){
                p1=0;
                while(p1<m && p2<m){
                   if(arr2[p1]>arr2[p2]){
                       int temp=arr2[p1];
                       arr2[p1]=arr2[p2];
                       arr2[p2]=temp;
                   }
                   p1++;
                   p2++;
                }
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
        }
	}
}
