package Examples.stringExcercises;

public class StringExercises {
	public static String str="Java Exercises";
	public String str1="Java Exercise 1";
	public String str2="Java EXERCISE 1";
	public String str3="PHP Exercises and Python Exercises";
	
	public static void main(String[] args) {
		
		StringExercises strings = new StringExercises();
		charPostion();
		strings.compareStrings();
		strings.ignoreCase();
		strings.contains();
		
	}	
		
		public static void charPostion() {
		
			//Getting character positions at 0 and 10
			char index1=str.charAt(0);
			char index2=str.charAt(10);
		
			System.out.println("Char at 0 index is " + index1);
			System.out.println("Char at 0 index is " + index2);
		}
		
		public void compareStrings() {
			
			//compare two strings lexicographically
			
			
			if (str1.compareTo(str2) < 0 )
			System.out.println("str1 is less than str2");
			else if (str1.compareTo(str2) > 0 )
				System.out.println("str1 is greater than str2");
			else
				System.out.println("Both are equal");
						
			
			
		}
		
		public void ignoreCase(){
		//compare two strings lexicographically, ignoring case differences
			if (str1.compareToIgnoreCase(str2) < 0 )
				System.out.println("str1 is less than str2");
			else if (str1.compareToIgnoreCase(str2) > 0 )
				System.out.println("str1 is greater than str2");
			else
				System.out.println("Both are equal");
				
		}
		
		public void contains() {
			
		String s="and";
		//test if a given string contains the specified sequence of char values.
			  if (str3.contains(s) == true)
				  System.out.println("exists");
			  else
				  System.out.println("does not exists");
			  
			  if (str3.endsWith("es") == true)
				  System.out.println("true");
			  else
				  System.out.println("false");
				  
		

	}
}


