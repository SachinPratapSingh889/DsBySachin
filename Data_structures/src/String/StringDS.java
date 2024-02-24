package String;

public class StringDS {
	
	 static void reverseString(String s) {
        //Method 1: to print reversely this as character array
		 for(int i=s.length()-1; i>=0;i--) {
			 System.out.print(s.charAt(i));
		 }
		 
		//Method 2: to put char in a new String
		String ans= "";
		for(int i=s.length()-1; i>=0;i--) {
			ans=ans+ s.charAt(i);
		 }
		System.out.println(ans);
		 
	 }
	 
     static void removeWhiteSpaces(String s) {
    	 
    	 for(int i=0;i<s.length();i++) {
    		 if(s.charAt(i)!=' ')
    			 System.out.print(s.charAt(i));
    	 }
    	 
     }
     
     static void revWord(String st) {
    	 
    	 String s[]= st.split(" ");
    	 String ans = "";
         for (int i = s.length - 1; i >= 0; i--) {
             ans += s[i] + " ";
         }
          
         System.out.println(
             ans);
     }

	public static void main(String[] args) {
		// String is nothing but a character array

		// Ways to store String
		String s = new String("loading ninjas"); // using new operator.
		String s1 = "loading ninjas"; // using double quotes.

		// Use of charAt()- returns the character
		//char c = s.charAt(0);
		//System.out.println(c);
		
		// Use of indexOf(char)- returns the index of character
		//System.out.println(s.indexOf('a')); output: 2
		//System.out.println(s.indexOf('in')); output: 4
	
		// Use of lastIndexOf(char)- returns the index of character from last
		//System.out.println(s.indexOf('a')); output: 12

		// Use of contains(char)- returns the index of character from last
				//System.out.println(s.contains('a')); output: true  (returns boolean trur if exist false if not
		
		// s.length()- returns the lenght of String
		
		// s.startsWith('l') true and s.endsWith('l') false
		// compare two strings:- 2 methods
		// s.equalsIgnoreCase(s1):- it checks the value and returns true if both string are equal and igones cases
		// s.equals(s1):- it checks the value and returns true if both string are equal and don't ignore cases
		// s.compareTo(s1) :- it checks the ascii code of first letter of first string and first letter of second string and will return the difference if diff is 0 both are equal is diff is +ve s is grater than s1 if diff is -ve than s is smaller than s2
		// s==s1 :- it checks the references (so don't use it) it will return false for this case
        
		//string are immutable in JAVA Immutable means unmodifiable or unchangeable.(Because of security reasons, java made strings immutable0
		//System.out.println(s); :- this will printe complete string no need to run a for loop over character array
		
		//Concat Operator:-   (+) is used to add/concate two strings. Look deeply in following examples
		String x="sachin is best";
		//String y="Pratap";
//		System.out.println(x+y); : Output: sachinPratap
//		System.out.println(x+10); : Output: sachin10
//		System.out.println(x+y+10+20); : Output: sachinPratap1020
//		System.out.println(10+20+x+y+10); : Output: 30sachinPratap10
//		System.out.println(x+10-5); : Output: error(coz deepak10 -5 is not a valid, we can't do string - int)
        
		//concate method
		//x.concat(y); it returns a concanted string
		//System.out.println(x.concat(y));
		
		
        //substring() method: we can use this by two ways : a- x.substring(int beginIndex)  b- x.substring(int beginindex, int stopIndex)
		//System.out.println(x.substring(2)); Output - chin is best (returned the substring starting index 2 till the en)
		//System.out.println(x.substring(2,8)); //Output - chin i (returned the substring starting index 2 till the stop-1 index I.e. till 7th index)

		
        //s.isEmpty() return true if string is empty
		String b="sachin is iscon";
		//s.replace("is","was"); :- Output  sachin was wascon
		//s.replaceFirsr("is","was"); :- Output  sachin was iscon (only first is will be replace)
		//s.replaceAll(regex,"was");
		
		
		
		
		//System.out.println(x.trim()); trim() method removes the starting and ending spaces  (not the middle ones)
		
		//DSA questions of strings  
		//reverseString(s);
		//removeWhiteSpaces(s);
		
		String st = "Dudu loves bubu";
		revWord(st);
		
		
		
	}

	

}
