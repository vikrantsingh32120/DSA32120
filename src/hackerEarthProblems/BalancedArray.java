package hackerEarthProblems;

public class BalancedArray {

	public static void main(String[] args) {
		int arr[]= {1,4,6,2,6,4};
		int half=arr.length/2;
		int sum1=0;
		int sum2=0;
		for(int i=0;i<arr.length;i++) {
			if(i<half)sum1+=arr[i];
			else sum2+=arr[i];
		}
		int max=(int)Math.max(sum1, sum2);
		if(max==sum1)System.out.println(sum1-sum2);
		else System.out.println(sum2-sum1);
	}

}
