class Employee {
	String name;
	int yearOfJoining;
	String address;
	
	Employee(String name, int yearOfJoining, String address){ // parameterized constructor for initializing instance variables 
		this.name = name; 
		this.yearOfJoining = yearOfJoining;
		this.address = address;
	}
	
	void print() { // printing name, yearOfJoining, address of each object
		System.out.println(this.name + "\t\t" + this.yearOfJoining + "\t\t" + this.address); 
	}

}
public class Question_2 {
	
	public static void main(String[] args) {
		
		// creating obj1, obj2, obj3 of class Employee with parameterized constructor
		Employee obj1 = new Employee("Robert", 1994, "64C- WallsStreat"); 
		Employee obj2 = new Employee("Sam", 2000, "68D- WallsStreat");
		Employee obj3 = new Employee("John", 1999, "26B- WallsStreat");
		
		System.out.println("Name\tYear of joining \tAddress");
		obj1.print();
		obj2.print();
		obj3.print();
	}
}
