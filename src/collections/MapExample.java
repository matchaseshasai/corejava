package collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		
		map1.put("Item1", 100);
		map1.put("Item2", 200);
		map1.put("Item3", 100);
		map1.put("Item4", 50);
			
		System.out.println(map1);
		
		// find the price of item4 from map
		System.out.println("Value of Item 4  : " + map1.get("Item4"));
		
		//Remove an element 
		map1.remove("Item2");
		System.out.println(map1);
		
		//Fetching keys and values :
		
		for(int i : map1.values()) {
			System.out.println("Value is : " +i);
		}
		
		for(String key : map1.keySet()) {
			//System.out.println("Key is : "+key);
			System.out.println("Value of the element "+key+" is : "+map1.get(key));
		}
		
		
		//Assignment :
		//occurance of each world in "clean world green world happy world"
		
		HashMap<String,Integer> map2 = new HashMap<String,Integer>();
		String str = "clean world green world happy world";
		
		String[] array1 = str.split(" ");
		int ini=1;
		for(String var : array1) {
			if(map2.containsKey(var)) {
				map2.put(var, map2.get(var)+1);
			}else {
			map2.put(var, ini);
			}	
		}
		System.out.println(map2);
	}

}
