package Examples;

public class TryCatch {
	static String txt;
	public static void main(String[] args) throws Exception {
		
		divide(10,1);
		try {
//			int i=10/0;
//			System.out.println(i);
			
			int len=txt.length();
						
			System.out.println(len);
			System.out.println(txt.getClass());
		}
		catch (ArithmeticException ex) {
			System.out.println("Arithmetic Exception Found");
		}
		catch (NullPointerException ex) {
			ex.printStackTrace();
			System.out.println("");
			System.out.println("");
			System.out.println(ex.getMessage());
			//System.out.println("Null Pointer Exception Found");
			System.out.println("");
			System.out.println("");
			System.out.println(ex.toString());
		}
		catch(Exception e){
			System.out.println(e.fillInStackTrace());
			System.out.println("Please enter valid value");
		}
		finally {
			System.out.println("Finally ececuted");
		}
		System.out.println("Out side of Exception");
		
		
	}		
		
		public static void divide(int a , int b) throws Exception {  //user defined Exception
			
			if (b==0) {
				throw new Exception("b value shoul not be zero");
			}
			int c=a/b;
			System.out.println(c);
		}
		
		
	}


