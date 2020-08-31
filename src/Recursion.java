
public class Recursion {
	static int n=10;
	public static void main(String[] args) {
		Recursion recur = new Recursion();
		recur.reduce(n);

	}
	
	public void reduce(int n) {
		if (n >= 0) {
			System.out.println(n);
			reduce(n-1);
			//System.out.println(n);
	}
		
	
}
}
