package OopsAssiignment;
//Write a Java program to create an abstract class Person with abstract methods eat() and exercise().
//Create subclasses Athlete and LazyPerson that extend the Person class and implement the respective methods 
//to describe how each person eats and exercises.
abstract class Person{
	abstract void eat();
	abstract void exercise();
}
class Athlete extends Person{
	void eat() {
		System.out.println("Athelete Person has planned and healthy diet");
	}
	void exercise() {
		System.out.println("Athelete Person regularly do excercise");
	}
}
class LazyPerson extends Person{
void eat() {
	System.out.println("Lazy Person has unplanned and unhealthy diet");
	}
	void exercise() {
		System.out.println("Lazy Person regularly do excercise");
	}
}
public class Program10 {

	public static void main(String[] args) {
		Athlete a =new Athlete();
		LazyPerson l=new LazyPerson();
		a.eat();
		a.exercise();
		l.eat();
		l.exercise();

	}

}
