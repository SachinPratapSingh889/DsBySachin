package Hashing;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapOperations {

	public static void main(String[] args) {
    
		HashMap<String, Integer> map = new HashMap<>();	
		
		//HashMap stores values in key, keys are always unique but values can be same, value pairs with put() methods
		
		map.put("Agra", 81);
		map.put("Bulandshahr",13);
		map.put("Noida", 16);
		map.put("Lucknow", 12);
		//if we try to put another same key than it will first check if key exist or not
		//if key already exist than updates the associated value otherwise add the key normally.
		map.put("Noida",11);
		
		//get value using key using get function
		System.out.println(map.get("Bulandshahr"));
		//we can't get keys using values because all the keys are unique but values can be same for two unique keys
	
		//to check if we the key or not , it returns boolean
		map.containsKey("agra");
		
		//to check if we have the value or not, it returns boolean
		map.containsValue(12);
		
		//to remove a pair using the key
		map.remove("Agra");
		
		//display a map
		//map doesn't have iterators
		
		//map has .keySet() method that return a set of all the keys 
//		Set<String> s= map.keySet();
//		for(String i: s) {
//			System.out.println(i+" "+map.get(i));
//		}
		
		//Another method to display is entrySet
		//Map has a .entrySet method that return the entry/pair of type Map.Entry<K, V>
		//use a for each loop to iterate the hasmap
		for(Map.Entry<String, Integer>e : map.entrySet()) {
			 System.out.println(e.getKey()+" "+e.getValue());
		}
		
		
	}

}
