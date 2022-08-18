package dSA_450;

import gfgProblems.RotateArray;

public class CyclicallyRotateAnArrayByOne {

	public static void main(String[] args) {
//		int arr[]= {1,2,3,4,5};
//		int n=5;
//		for(int i=0;i<=(n-2)/2;i++){
//            int temp=arr[i];
//            arr[i]=arr[n-2-i];
//            arr[n-2-i]=temp;
//        }
//        int high=n-1;
//        int low=0;
//        while(low<high){
//            int temp=arr[low];
//            arr[low]=arr[high];
//            arr[high]=temp;
//            low++;
//            high--;
//        }


		int nums[]= {1,2,9};
		int k=1;
		k=k%nums.length;
		int low0=0;
		int high1=nums.length-k;
		int low1=high1;
		while(low0<high1-1){
            int temp=nums[low0];
            nums[low0]=nums[high1-1];
            nums[high1-1]=temp;
            low0++;
            high1--;
        }
		
		for(int i:nums) {
			System.out.print(i+" ");
		}
		System.out.println();
        int high2=nums.length-1;
        while(low1<high2){
            int temp=nums[low1];
            nums[low1]=nums[high2];
            nums[high2]=temp;
            low1++;
            high2--;
        }
        for(int i:nums) {
			System.out.print(i+" ");
		}
        System.out.println();
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;
            high--;
        }
		for(int i:nums) {
			System.out.print(i+" ");
		}
	}
        
}
