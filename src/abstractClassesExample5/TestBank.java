package abstractClassesExample5;

public class TestBank {

	public static void main(String[] args) {
		Chase cb = new Chase();
		cb.credit();
		cb.debit();
		cb.loan();
		System.out.println(cb.loan(10, 20));
		
		Bank b = new Chase();  //dynamic Polymorphism
	
		b.credit();
		b.debit();
		b.loan();

	}

}
