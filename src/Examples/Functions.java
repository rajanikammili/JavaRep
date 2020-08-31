package Examples;

public class Functions {
	
	public static void main(String[] args) {
		Functions fn = new Functions();
		fn.sum();
		fn.sum(3,5);

	}
	
	public void sum() {
		int a =10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	public void sum(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}

}
