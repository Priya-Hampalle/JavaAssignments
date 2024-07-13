package OopsAssiignment;

//Write a Java program to create a class called Vehicle with a method called drive().
//Create a subclass called Car that overrides the drive() method to print "Repairing a car".
class Vehicle1 {
	void drive() {

	}
}

class Car1 extends Vehicle1 {
	void drive() {
		System.out.println("Repairing car");
	}
}

public class Program7 {

	public static void main(String[] args) {
		Car1 c=new Car1();
		c.drive();
	}

}
