package abstractClassesExamples1;

public abstract class Employee {
	
	public abstract void project();
	
	public static void main(String[] args) {
		
		//Employee empObj = new Employee; 
		//(Abstract classes cannot be instantiated, but only can be extended
		
		Employee program=new Programmer();
		//program.project();
		
		Employee manage = new Manager();
		//manage.project();
		
		//creating array of Employee
		
		Employee[] empObjects = new Employee[2];
		empObjects[0]=program;
		empObjects[1]=manage;
		
		for ( Employee emp : empObjects){
			emp.project();
		}
		
		
		
	}

}
