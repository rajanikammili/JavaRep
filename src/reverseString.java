import java.util.Scanner;
import java.lang.String;
public class reverseString {

	public static void main(String[] args) {
		String str; 
		int len,i;
		Scanner string =new Scanner(System.in);
		System.out.println("Enter a String : ");
		str=string.nextLine();
		len=str.length();
		System.out.println(str.length());
		for(i=len-1;i>=0;i--) {
			System.out.print(str.charAt(i));
			
		}	
		}
}

	


