package Examples.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		
		//ArrayList<String> array =new ArrayList<String>();
		List<String> array = new ArrayList<String>(); //ArrayList<String>() is implemented from List
		
		array.add("Name1");
		array.add("NAme 2");
		
		for (String printArray : array) {
			System.out.println(printArray);
		}

	}

}
