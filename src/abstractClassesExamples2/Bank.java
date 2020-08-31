package abstractClassesExamples2;

public abstract class Bank {
	
	abstract int getRateOfinterest();
	
	public static void main(String[] args) {
		
		Bank b= new Boa();
		int interest=b.getRateOfinterest();
		
		System.out.println(interest);
		
		
	}
	

}
