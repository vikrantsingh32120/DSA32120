import java.util.Scanner;
import java.util.Arrays;
class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i:arr)System.out.print(i+" ");
            int index=1;
            int sum=0;
            for(int i=0;i<n/4;i++){
                sum+=arr[index];
                index+=4;
            }
            System.out.println(sum);
        }

	}
}

