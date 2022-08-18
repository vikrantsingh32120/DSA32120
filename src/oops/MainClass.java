package oops;

//class cat{
//	boolean hasFur;
//	String colour,bread;
//	int legs,eyes;
//	
//	public void walk() {
//		System.out.println("Cat is walking.");
//	}
//	public void eat() {
//		System.out.println("Cat is eating.");
//	}
//	public void discription() {
//		System.out.println("my cat has "+legs+" legs and "+eyes+" eyes.");
//	}
//}

class Dog{
	String bread,name;
	
	public void jump() {
		System.out.println("my dog "+name+" is jumping.");
	}
	public void discription(){
		System.out.println("my dog name is "+name+" and its bread is "+bread);
	}
}

public class MainClass {

	public static void main(String[] args) {
		
//		cat cat1=new cat();
//		cat cat2=new cat();
//		
//		cat1.colour="brown";
//		cat1.eyes=2;
//		cat1.legs=4;		
//		cat1.eat();
//		cat1.walk();
//		cat1.discription();
//		System.out.println("============================");
//		cat2.colour="black";
//		cat2.eyes=2;
//		cat2.legs=3;
//		cat2.walk();
//		cat2.eat();
//		cat2.discription();

		Dog dog1=new Dog();
		Dog dog2=new Dog();
		
		dog1.bread="Huskey";
		dog1.name="Browny";
		
		dog2.bread="Poodle";
		dog2.name="Mr. Moolchand Ji";
		
		dog1.jump();
		dog2.jump();
		dog1.discription();
		dog2.discription();
	}

}
