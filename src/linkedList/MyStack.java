package linkedList;

public class MyStack {

	public static void main(String[] args) throws Exception {
		VactorAndStack<Integer> stack=new VactorAndStack<>();
//		stack.pop();
		System.out.println(stack.peep());
		stack.push(13);
		stack.push(14);
		stack.push(19);
		stack.push(20);
		int peeped=stack.peep();
		System.out.println(peeped);
		int pooped=stack.pop();
		System.out.println(pooped);
		System.out.println(stack.peep());
	}

}
