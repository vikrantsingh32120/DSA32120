package encapsuletation;

//import hackerEarthProblems.ReverseStringWordByWord;

public class Encapsulation {

	public static void main(String[] args) {
		
		Student obj=new Student();
//		ReverseStringWordByWord str=new ReverseStringWordByWord();
//		System.out.println(str.reverseString(" vik    s "));
		obj.setAge(21);
		obj.setName("vikrant singh");
		System.out.println(obj.getAge()+" "+obj.getName());
		
	}

}
