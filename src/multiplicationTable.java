import java.util.Scanner;
public class multiplicationTable {

	public static void main(String[] args) {
		int num, i=1;
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num= myObj.nextInt();
		//for(i=1;i<=10;i++) {
		
		while(i<=10) {
			System.out.println(num + " X " + i + " = " + (num*i));
			i++;
		}
		

	}
	
}
