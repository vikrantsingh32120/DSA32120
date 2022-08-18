package oopsLabRajeevTivariSir;

public class ArrayOutOfBond {

	public static void main(String[] args) throws Exception{
		int arr[]=new int[5];
		try {
				arr[10]=10;
			}catch(IndexOutOfBoundsException e){
				System.out.println("Array Index out of bound");
			}
		System.out.println("Exception handled sucessfully");
	}

}
