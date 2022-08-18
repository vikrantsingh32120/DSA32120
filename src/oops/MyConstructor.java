package oops;

class new_vehicle{
	int wheels;
	new_vehicle(int wheels /*noOfWheels*/) {    //parameterized constructor.
		this.wheels= wheels/*noOfWheels*/;      //using ""this"" keywords.
	}
}

class vehicle{
	int wheels;
	int headLight;
	String colour;
	vehicle(){          //No-Argument constructor.
		wheels=4;
	}
	vehicle(int wheels,String colours){   //constructor overloding just like method overloding.
		this.wheels=wheels;
		this.colour=colours;
		headLight=2;
	}
	
}

public class MyConstructor {

	public static void main(String[] args) {
		new_vehicle car=new new_vehicle(4);
		new_vehicle scooty=new new_vehicle(2);
	    System.out.println(car.wheels+" "+scooty.wheels);
		
		vehicle cars=new vehicle();
		vehicle scooties=new vehicle();
		vehicle eRikshaw=new vehicle(3,"yellow");
		System.out.println(cars.wheels+" "+scooties.wheels);
		System.out.println(eRikshaw.wheels+" wheels and colour "+eRikshaw.colour);

	}

}
