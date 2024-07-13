package OopsAssiignment;
//Write a Java program to create a base class Animal (Animal Family) with a method called Sound(). 
//Create two subclasses Bird and Cat.
//Override the Sound() method in each subclass to make a specific sound for each animal.
class Animal{
	void sound() {
		System.out.println("Each animal has their own sound");
	}
}
class Bird extends Animal{
	void sound() {
		System.out.println("Bird have high pitch sound ");
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("Cat sound is meow meow!");
	}
}
public class Program3 {

	public static void main(String[] args) {
		Animal a=new Animal();
		Bird b=new Bird();
		Cat c=new Cat();
		a.sound();
		b.sound();		
		c.sound();

	}

}
