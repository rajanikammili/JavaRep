package abstractClassesExample5;

public class Chase extends Bank{

	@Override
	public void loan() {
		System.out.println("Bank -- Loan");
		
	}
	
	public int loan(int a, int b) {
		int c= a+b;
		return c;
	}

}
