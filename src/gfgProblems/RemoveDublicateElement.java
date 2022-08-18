package gfgProblems;

public class RemoveDublicateElement {
	public static void main(String[] args) {
		int arr[]= {2};
		int n=arr.length;
		int previous=0;
		int index=0;
		int count=0;
		for(int i=0;i<n;i++) {
			if(previous!=arr[i]) {
				previous=arr[i];
				count++;
			}
		}
		previous=0;
		int arr1[]=new int[count];
		for(int i=0;i<count;i++) {
			if(previous!=arr[i]) {
				arr1[index++]=arr[i];
				previous=arr[i];
			}
		}
		System.out.println(count);
		for(int i:arr1)System.out.print(i+" ");
	}
}
