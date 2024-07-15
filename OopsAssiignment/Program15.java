package OopsAssiignment;
//Write two interfaces “Fruit” and “Vegetable” containing methods ‘hasAPeel’ and ‘hasARoot’.
//Now write a class “Tomato” implementing Fruit and Vegetable. Instantiate an object of Tomato. Print the details of this object

interface Fruit{
void hasAPeel();

}
interface Vegitable{

void hasARoot();
}
class Tomato implements Fruit,Vegitable{
public void hasAPeel() {
		System.out.println("Tomato has a peel");
}
public void hasARoot() {
		System.out.println("Tomato has a root");
}

}
public class Program15 {

	public static void main(String[] args) {
		
		Tomato t=new Tomato();
		t.hasARoot();
		t.hasAPeel();
	}

}
