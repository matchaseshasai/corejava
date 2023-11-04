package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String[] names = {"abc","xyz","pqr"};
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		// adding data to the list
		list1.add("Akshay");
		list1.add("Priya");
		list1.add("Pankaj");
		
		System.out.println(list1);
		
		//retrieving data at 3rd position
		
		System.out.println("The element at third position:"+list1.get(2));
		
		
		//removing the data
		list1.remove(0);
		System.out.println(list1);
		System.out.println("The element at third position:"+list1.get(0));
		
		list1.add("Deepa");
		list1.add("Aparna");
		System.out.println(list1);
		
		//print the last name in the array list
		System.out.println("The element at the last position: " +list1.get(list1.size()-1));
		
		//Change the value at third position
		list1.set(2, "Savitha");
		System.out.println(list1);
		
		//Iterate through the list
		for(int i=0; i<list1.size();i++) {
			System.out.println("Data at index "+i+" is : "+list1.get(i));
		}
		
		for(String name : list1) {
			System.out.println(name);
		}
		
		//Sort the array list in ascending order
		Collections.sort(list1);
		System.out.println("Sorted list of the array list in ascending order : "+list1	);
		
		//Sort the array list in descending order
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println("Sorted list of the array list in descending order : "+list1	);
	}
		
}
