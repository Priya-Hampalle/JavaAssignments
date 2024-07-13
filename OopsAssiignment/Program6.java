package OopsAssiignment;
//Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). 
//Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to 
//calculate the area and perimeter of a circle.
class Shapes{
	void getPerimeter() {
		System.out.println("this method is for finding Perimeter of shape");
	}
	void getArea() {
		System.out.println("this method is for finding Area of shape");
	}
}
class Circles extends Shapes{
	double pi=3.14;
	int r=3;
	void getPerimeter() {
		double p= 2*pi*r;
		System.out.println("Perimeter of circle is :"+p);
	}
	void getArea() {
		double a= pi*r*r;
		System.out.println("Area of circle is :"+a);
	}
}

public class Program6 {

	public static void main(String[] args) {
		Circles c1=new Circles();
		c1.getPerimeter();
		c1.getArea();

	}

}
