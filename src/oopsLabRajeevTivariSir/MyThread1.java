package oopsLabRajeevTivariSir;

class MyClass implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println(Thread.currentThread().getId()+" value: "+i);
		}try {
			Thread.sleep(100);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class MyThread1 {

	public static void main(String[] args) {
		Thread t1=new Thread(new MyClass());
		Thread t2=new Thread(new MyClass());
		t1.start();
		t2.start();

	}

}
