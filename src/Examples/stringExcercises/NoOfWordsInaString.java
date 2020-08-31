package Examples.stringExcercises;

import java.util.Scanner;

public class NoOfWordsInaString {

	public static void main(String[] args) {
		Scanner strobj = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str=strobj.nextLine();
		String[] strarr=str.split(" ");
		System.out.println("Number of words " + strarr.length);
		
		for(String eachstr:strarr) 
		{
			if (eachstr.equals("java"))
			{
				System.out.println("Found");
				break;
			}
			else 
				System.out.println("Not found");
					
		}
			
	}

}

