package OopsAssiignment;
//Write a Java program to create an abstract class Bird with abstract methods fly() and makeSound(). Create subclasses Eagle and Hawk that extend the Bird class 
//and implement the respective methods to describe how each bird flies and makes a sound.
abstract class Bird1{
	abstract void fly();
	abstract void makeSound();
}
class Eagle extends Bird1{
	void fly() {
		System.out.println("Eagle fly high in sky");
	}
	void makeSound() {
		System.out.println("Eagle sound is soft, high-pitched, and repeated several times");
	}
}
class Hawk extends Bird1{
void fly() {
	System.out.println("Hawk fly high in sky but not more than eagle");
	}
	void makeSound() {
		System.out.println("hawks more often make hoarser screeching sounds");
	}
}
public class Program11 {

	public static void main(String[] args) {
		Eagle e= new Eagle();
		Hawk h=new Hawk();
		e.fly();
		e.makeSound();
		h.fly();
		h.makeSound();

	}

}
