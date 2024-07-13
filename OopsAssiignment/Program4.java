package OopsAssiignment;
//Write a Java program to create a class Vehicle with a method called speedUp(). 
//Create two sub classes Car and Bicycle Override the speedUp() method in each subclass to increase the vehicle's speed differently.
class Vehicle{
	void speedup() {
		System.out.println("Speed vary as type of vehicle varry");
	}
}
class Car extends Vehicle{
	void speedup() {
		System.out.println("Car gives more speed limit ");
	}
}
class Bicycle extends Vehicle{
	void speedup() {
		System.out.println("Bicycle have low speed");
	}
}
public class Program4 {

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		Car c=new Car();
		Bicycle b=new Bicycle();
		v.speedup();
		c.speedup();
		b.speedup();
	}

}
