package OopsAssiignment;
//Write a program to implement a class “student” with the following members. Name of the student.
//Marks of the student obtained in three subjects. Function to assign initial values.
//Function to compute total average. Function to display the student’s name and the total marks. 
//Write an appropriate main() function to demonstrate the functioning of the above


public class Student1 {
	int[] marks = new int[3];
    String name;
    public Student1( String n, int a, int b, int c) {
        name = n;
        marks[0] = a;
        marks[1] = b;
        marks[2] = c;
    }
    public void assigndata() {
        name = "null";
        marks[0] = 0;
        marks[1] = 0;
        marks[2] = 0;
    }
    public void avg() {
        int s = 0;
        for (int i = 0; i < 3; i++) {
            s += marks[i];
        }
        int avg=s/3;
        System.out.println("Avarage of 3 subject is: "+avg);
    }
    public void display() {
        System.out.println("Student's Name : " + name);
        for (int i = 0; i < 3; i++) {
            System.out.println("Mark " +( i + 1) + " : " + marks[i]);
        }
    }
	public static void main(String[] args) {
		Student1 st = new Student1("Priya", 76, 97, 68);
		st.display();
		st.avg();


	}

}
