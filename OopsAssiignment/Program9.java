package OopsAssiignment;
//Write a Java program to create an abstract class Animal with an abstract method called sound().
//Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound 
//for each animal.
abstract class Animal1{
	abstract void sound();
	
}
class Lion extends Animal1{
	void sound() {
		System.out.println("Lion is more louder than other animal roar");
	 }
	
}
class Tiger extends Animal1{
	void sound() {
		System.out.println("Tiger is lower roar than Lion");
	 }
}
public class Program9 {

	public static void main(String[] args) {
		Lion l=new Lion();
		Tiger t =new Tiger();
		l.sound();
		t.sound();

	}

}
