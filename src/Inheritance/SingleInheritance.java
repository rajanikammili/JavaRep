package Inheritance; //Single Inheritance

class Employee{ //parent class
	 float salary=40000;
	}

	class SingleInheritance extends Employee{
	 int bonus=10000;
	 //salary=25000;
	 public static void main(String args[]){
	   SingleInheritance p=new SingleInheritance();
	   System.out.println("Programmer salary is:"+p.salary);
	   System.out.println("Bonus of Programmer is:"+p.bonus);
	}
	}

