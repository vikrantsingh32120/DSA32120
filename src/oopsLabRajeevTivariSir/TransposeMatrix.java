package oopsLabRajeevTivariSir;

public class TransposeMatrix {

	public static void main(String[] args) {
		int m=Integer.parseInt(args[0]);
		int n=Integer.parseInt(args[1]);
		int a[][]=new int[m][n];
		int index=2;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=Integer.parseInt(args[index++]);
			}
		}
		System.out.println("matrix a[][] is:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("transpose of given matrix a[][] is:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}

}
