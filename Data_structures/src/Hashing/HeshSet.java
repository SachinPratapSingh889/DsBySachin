package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HeshSet {

	public static void main(String[] args) {
		
		//import java.util.HashSet
		//Create Object of Hashset class
		HashSet<Integer> h = new HashSet<Integer>();
		
		//Insertion of elements
	    h.add(4);
	    h.add(1);
	    h.add(3);
	    h.add(4);
	    
	    //to remove the element, if successfully deleted it returned true else false
	    //h.remove(3);
	    //display of elements
//	    for(Integer i: h) {
//	    	System.out.print(i+" ");
//	    	//this shows hashsets are unordered , we get elements from random places
//	    	//this shows we can't store duplicate elements in hashsets
//	    }
	    
	    //to clone the hashset into other
//	   Object k= h.clone();
//	   System.out.println(k);
	   
	    //to check we have the element or not, it returns boolean value
	  // System.out.println( h.contains(13));
	   
	   //Iterators
	   //set have a iterator method to return Iterator
	   
	   Iterator it= h.iterator();
	   
	   //iterator have two method hasNext() return true if next value present and next(), it return the next value
	   while(it.hasNext())
		   System.out.println(it.next());
	    
	    
	}
	
	
    
}
