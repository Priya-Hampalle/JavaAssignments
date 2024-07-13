package OopsAssiignment;
//Write a Java program to declare a class called "Student" with a name and age attributes.
//Create two instances of the "Student" class, set their attributes using the constructor, and print their name and age.

	

public class Student {
	String name;
	int age;
	Student(String s,int a){
		System.out.println("The name and age of sudent is: "+ s +" "+ a);
	}
	Student(){
		name="Sandeep";
		age=34;
		
	}
	public static void main(String[] args) {
		new Student("Priya",29);
		Student st2=new Student();
		System.out.println("The name and age of sudent is: "+st2.name +" "+ st2.age);

	}

}
