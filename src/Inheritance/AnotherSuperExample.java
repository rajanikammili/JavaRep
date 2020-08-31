package Inheritance;

class Person{
	
	int id;
	String empName;
	
	Person(int id, String empName){
		this.id= id;
		this.empName=empName;
	}
}

class Emp extends Person{
	float salary;
	
	Emp(int id, String empName, float salary){
		super(id,empName);
		this.salary=salary;
	}


void display() {
	System.out.println(id + " " + empName + " " + salary);
}
}

public class AnotherSuperExample {

	public static void main(String[] args) {
		
		Emp employee = new Emp(101,"Rajani",10000);
		employee.display();

	}

}
