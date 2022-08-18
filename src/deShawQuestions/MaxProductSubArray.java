package deShawQuestions;

public class MaxProductSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	long maxProduct(int[] a, int n) {
        // code here
        long ans=Integer.MIN_VALUE;
        long temp=1;
        for(int i=0;i<n;i++){
          temp*=a[i];
          ans=Math.max(temp,ans);
          if(temp==0)temp=1;
        }
        temp=1;
        for(int i=n-1;i>=0;i--){
          temp*=a[i];
          ans=Math.max(temp,ans);
          if(temp==0)temp=1; 
        }
        
        return ans;
    }
}
