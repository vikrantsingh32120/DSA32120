package linkedList;
import linkedList.MyDeque;
public class UseOfMyDeque {

	public static void main(String[] args) throws Exception {
		MyDeque<Integer> d=new MyDeque<>();
		d.addFirst(12);
		d.addFirst(11);
		d.addLast(13);
		d.print();
		d.addLast(14);
		d.print();
		d.removeFirst();
		d.print();
	}

}
