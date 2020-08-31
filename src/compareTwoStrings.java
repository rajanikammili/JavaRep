import java.util.Scanner;

public class compareTwoStrings {

	public static void main(String[] args) {
		String str1;
		String str2;
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter a string1 : ");
		str1=myObj.next();
		System.out.println("Enter a string2 : ");
		str2=myObj.next();
			if (str1.equalsIgnoreCase(str2)) {
				System.out.println("Both strings are same");
			}
			else {
					System.err.println("Both strings are not same");
			}
			}
		}

	


