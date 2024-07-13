package OopsAssiignment;

import java.util.Scanner;

//Write a Java program to create an interface Shape with the getArea() method. 
//Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.
//Implement the getArea() method for each of the three classes.

interface Shape {
	void getArea();
}

class Rectangle implements Shape {
	public void getArea() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Length of rectangle:");
		int l = scan.nextInt();
		System.out.println("Enter breadth of rectangle");
		int b = scan.nextInt();
		int c = l * b;
		System.out.println("Area of Rectangle is:" + c);
		scan.close();
	}
}

class Circle implements Shape {
	public void getArea() {
		double pi = 3.14, c;
		int r = 2;
		c = pi * r * r;
		System.out.println("Area of Circle is:" + c);

	}
}

class Triangle implements Shape {
	public void getArea() {
		int h = 3;
		System.out.println("Enter height of Triangle:" + h);
		int b = 6;
		System.out.println("Enter Base of Triangle:" + b);
		double c = (h * b) / 2;
		System.out.println("Area of Triangle is:" + c);

	}
}

class Calculation {
	static void permit(Shape sh) {
		sh.getArea();
	}
}

public class Program2 {
	public static void main(String[] args) {
		Rectangle o1 = new Rectangle();
		Circle o2 = new Circle();
		Triangle o3 = new Triangle();
		Calculation.permit(o1);
		Calculation.permit(o2);
		Calculation.permit(o3);
	}

}
