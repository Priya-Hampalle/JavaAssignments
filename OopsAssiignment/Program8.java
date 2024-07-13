package OopsAssiignment;

//Write a Java program that creates a class hierarchy for employees of a company. 
//The base class should be Employee, with subclasses Manager, Developer, and Programmer. 
//Each subclass should have properties such as name, address, salary, and job title. 
//Implement methods for calculating bonuses, generating performance reports, and managing projects
class Employee {
	private String name;
	private String address;
	private double salary;
	private String jobTitle;

	public Employee(String name, String address, double salary, String jobTitle) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.jobTitle = jobTitle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public void calculateBonus() {
		System.out.println("Bonus");
	}

	public void generatePerformanceReport() {
		System.out.println("Performanace");
	}

	public void manageproject() {
		System.out.println("Project");
	}

}

class Manager extends Employee {
	public Manager(String name, String address, double salary, String jobTitle) {

		super(name, address, salary, jobTitle);
		System.out.println("Name of employee: " + name);
		System.out.println("Address of employee :" + address);
		System.out.println("Salary of employee:" + salary);
		System.out.println("Designation of employee:" + jobTitle);
		System.out.println();
	}

	public void calculateBonus() {
		double B = getSalary() * 0.50;
		System.out.println(getName() + "Manager got bonus :" + B);
	}

	public void generatePerformanceReport() {
		System.out.println("Performance of manager " + getName() + "is Excellent");
	}

	public void manageproject() {
		System.out.println("Manager" + getName() + " manage project well");
	}
}

class Developer extends Employee {
	public Developer(String name, String address, double salary, String jobTitle) {

		super(name, address, salary, jobTitle);
		System.out.println("Name of employee: " + name);
		System.out.println("Address of employee :" + address);
		System.out.println("Salary of employee:" + salary);
		System.out.println("Designation of employee:" + jobTitle);
		System.out.println();
	}

	public void calculateBonus() {
		double B = getSalary() * 0.60;
		System.out.println(getName() + "Developer got bonus :" + B);
	}

	public void generatePerformanceReport() {
		System.out.println("Performance of Developer " + getName() + "is Excellent");
	}

	public void manageproject() {
		System.out.println("Developer" + getName() + " manage project well");
	}
}

class Programmer extends Employee {
	public Programmer(String name, String address, double salary, String jobTitle) {

		super(name, address, salary, jobTitle);
		System.out.println("Name of employee: " + name);
		System.out.println("Address of employee :" + address);
		System.out.println("Salary of employee:" + salary);
		System.out.println("Designation of employee:" + jobTitle);
		System.out.println();
	}

	public void calculateBonus() {
		double B = getSalary() * 0.25;
		System.out.println(getName() + "Programmer got bonus :" + B);
	}

	public void generatePerformanceReport() {
		System.out.println("Performance of Programmer " + getName() + "is Excellent");
	}

	public void manageproject() {
		System.out.println("Programmer" + getName() + " manage project well");
	}
}

public class Program8 {

	public static void main(String[] args) {
		Manager m = new Manager("Sumit Chatarji", "Yerwada", 200000.0, "Manager");
		m.calculateBonus();
		m.generatePerformanceReport();
		m.manageproject();
		System.out.println();
		System.out.println();
		Developer d = new Developer("Pooja Savant", "Hinjewadi", 100000.0, "Developer");
		d.calculateBonus();
		d.generatePerformanceReport();
		d.manageproject();
		System.out.println();
		System.out.println();
		Programmer p = new Programmer("Rudraksha Hampalle", "Ravet", 150000.0, "Programmer");
		p.calculateBonus();
		p.generatePerformanceReport();
		p.manageproject();

	}

}
