package string;

public class StringIntroduction {

	public static void main(String[] args) {
		
		String name="elephant";
		String name2="dog";
		String name3="";
//		String myName=new String("dog");
////		name=myName;
//		
//		System.out.println(myName==name);
//		System.out.println(myName==name2);
		
		
		//charAt() function:
		System.out.println(name.charAt(0)); 
		//length function:
		System.out.println(name.length());
		//sub-string function:
		System.out.println(name.substring(3));
		//sub-string function:
		System.out.println(name.substring(3,6));
		//contain(charSequence ele) function:
		System.out.println(name.contains("ele"));
		
		//equals(object another) function:
		System.out.println(name.equals("elephant"));
		//or:
		System.out.println(name.equals(name2));
		
		//isempty function:
		System.out.println(name3.isEmpty());
		//concat function {also we can add with name=name+""}:
		System.out.println(name.concat(" is wild animal."));
		//replace function:
		System.out.println(name.replace("elephant","lion"));
		
		//split function:
		String cars="hundai,maruti,swift,lamborghini";
		String[] allCars=cars.split(","); //we use anything for where to split;
		for(String car:allCars) {
        System.out.print(car+" ");
		}
		
		         System.out.println();
		         
		//indexOf function:		
		System.out.println(name.indexOf("t"));
		
		//toLowerCase function;
		String name4="BARBER";
		System.out.println(name4.toLowerCase());
		//toUpperCase:
		String name5="cat";
		System.out.println(name5.toUpperCase());
		//trim function:
		String name6="   mango   ";
		System.out.println(name6.trim());
		
		int g=name6.compareTo(name5);
		System.out.println(g);
	}

}
