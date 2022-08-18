package dSA_450;

public class MinNoOFJumpsToReachTheEndOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10, 8, 12, 17, 1, 21, 5, 17, 20, 11,
				5, 27, 23, 8, 12, 18, 16, 12, 9, 8, 17, 12,
				23, 26, 0, 5, 9, 24, 10};
		int arr1[]= {1,1,0,1};
		int a=minJumps(arr1);
		System.out.println(a);
	}
	static int minJumps(int[] arr){
        // your code here
        int n=arr.length;
        if(arr[0]==0)return -1;
        else if(arr.length<2)return 0;
        int jumps=0;
        
        for(int i=0;i<arr.length;){
            jumps++;
            int mxRch=arr[i]+i;
            if(mxRch==0)return -1;
            if(mxRch>=n-1)return jumps;
            int mxIndx=mxRch+arr[mxRch];
            int indx=mxRch;
            while(mxRch>i){
                if(mxRch+arr[mxRch]>mxIndx){
                    mxIndx=arr[mxRch]+mxRch;
                    indx=mxRch;
                }
                mxRch-=1;
            }
            if(mxIndx==indx)return -1;
            i=indx;
        }
        return jumps;
    }
}
