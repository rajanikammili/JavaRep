package Examples;

public class CallByValCallByReference {
	int p=20;
	int q=40;
	public static void main(String[] args) {
		int x=10;
		int y=20;
		CallByValCallByReference obj = new CallByValCallByReference();
		int n=obj.testSum(x, y);
		System.out.println("Call by Value : " + n);
		
		System.out.println("Call by Reference");
		System.out.println("Before swap : ");
		System.out.println("p : " + obj.p);
		System.out.println("q : " + obj.q);
		obj.swap(obj);
		System.out.println("After swap : ");
		System.out.println("p : " + obj.p);
		System.out.println("q : " + obj.q);
	}
	
	public int testSum(int a,int b) {
		
		
		int c=a+b;
		return c;
	}
	
	public void swap(CallByValCallByReference ref) {
		int temp;
		temp=ref.p;
		ref.p=ref.q;
		ref.q=temp;
		
		
	}

	}


