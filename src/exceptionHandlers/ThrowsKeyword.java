package exceptionHandlers;

public class ThrowsKeyword {

	public static void main(String[] args) throws ArithmeticException {
		ThrowsKeyword obj= new ThrowsKeyword();
		obj.sum();

	}
	
	public void sum() throws ArithmeticException {
		div();
	}
	
	public void div() throws ArithmeticException {
		int i=9/0;
		System.out.println(i);
	}

}
