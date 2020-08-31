package Examples;

public class IfCondition {
	int age=3;
	int num=7;
	public static void main(String[] args) {
		IfCondition ifcond = new IfCondition();
		ifcond.SimpleIf();
		ifcond.evenOdd();
		ifcond.ladderIfElse();
		ifcond.nestedIfs();

	}
	
	public void SimpleIf() {
		if (age>18)
			System.out.println("age is greater than 18");
		else
			System.out.println("age is less than 18");
	}
	
	public void evenOdd() {
		/*if (num%2 == 0)
			System.out.println("Even number");
		else System.out.println("Odd number");*/
		String output = (num%2 == 0) ? "Even number" : "Odd number";
		System.out.println(output);
	}
	
	public void ladderIfElse() {
		int marks=20;
		if (marks < 40)
			System.err.println("Fail");
		else if (marks >= 40 && marks < 60)
			System.out.println("Third Grade");
		else if (marks >= 60 && marks < 80)
			System.out.println("Second Grade");
		else 
			System.out.println("First Grade");
	}
	
	public void nestedIfs() {
		int age=19;
		int weight=60;
		
		if (age >= 18){
			
			if (weight > 55) {
				
				System.out.println("Eligible for blood donation");
			}
			else 
				System.out.println("Weight is less than 55");
				
			}
			else
				System.out.println("Not eligible for blood donation");
			
		}
			
				
			
	}
	

