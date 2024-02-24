package String;

import java.util.*;

public class StringProvblems {

	public static void reverseStringByWords(String s) {
		String[] st = s.split(" ");
		StringBuilder ans = new StringBuilder();
		for (int i = st.length - 1; i >= 0; i--) {
			if (ans.isEmpty()) {
				ans.append(st[i]);
			} else {
				ans.append(" " + st[i]);
			}
		}
		System.out.println(ans);
	}

	public static void reverseStringByWordsSecondApproach(String s) {

		int i = s.length() - 1;
		StringBuilder ans = new StringBuilder();

		while (i >= 0) {

			while (i >= 0 && s.charAt(i) == ' ')
				i--;

			int j = i;

			while (i >= 0 && s.charAt(i) != ' ') {
				i--;
			}

			if (ans.isEmpty()) {
				ans.append(s.substring(i + 1, j + 1));
			} else {
				ans.append(" " + s.substring(i + 1, j + 1));
			}

		}
		System.out.println(ans);
	}

	public static void longestCommonPrefix(String[] s) {

		StringBuilder ans = new StringBuilder();
		Arrays.sort(s);
		int len = s[0].length();

		for (int i = 0; i < len; i++) {
			if (s[0].charAt(i) == s[s.length - 1].charAt(i)) {
				ans.append(s[0].charAt(i));
			} else
				break;
		}
		System.out.println("Longest common prefix: " + ans);

	}
    public static int value(char ch) {
    	switch (ch) {
		case 'I':
			return 1;
		case 'V':
		    return 5;
        case 'X':
			return 10;
        case 'L':
        	return 50;
        case 'C':
        	return 100;
        case 'D':
            return 500;
        case 'M':
        	return 1000;
        default:
        	return 0;
		}
    }
	public static void romanToInteger(String s) {
        int sum=0;
		for(int i =0; i<s.length();i++) {
						
			if((i+1<s.length())&& value(s.charAt(i))< value(s.charAt(i+1))){
				sum= sum- value(s.charAt(i));
			}
			else
				sum= sum+value(s.charAt(i));
		}
		System.out.println(sum);
	}
	
	public static void integerToRoman(int num) {
        
		StringBuilder ans= new StringBuilder();
		int[] values= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] st= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		
		
		for(int i=0; i<values.length;i++) {
			while(num>=values[i]) {
				ans.append(st[i]);
				num=num-values[i];
			}
		}
		
		System.out.println(ans);
	}

	public static void panagramChecking(String s) {
		HashSet h = new HashSet();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
				h.add(s.charAt(i));

			else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				// s.charAt(i).toLowerCase();
				char ch = Character.toLowerCase(s.charAt(i));
				h.add(ch);
			}

		}
		if (h.size() == 26) {
			System.out.println("Panagram");
		} else {
			System.out.println("Not Panagram");
		}
	}
	
	public static void closestString(ArrayList<String>s , String word1, String word2) {
		int dis1=-1,dis2=-1;
		for(int i=0;i<s.size();i++) {
			if(s.get(i)==word1) {
				dis1=i;
			}
			if(s.get(i)==word2) {
				dis2=i;
			}
		}
		System.out.println(Math.abs(dis2-dis1));
	}
	

	public static void main(String[] args) {
		/*
		 * String s="Hello to the world"; reverseStringByWords(s);
		 * reverseStringByWordsSecondApproach(s);
		 */

		/*
		 * String[] s= {"geeksforgeeks", "geeks", "geek", "g"};
		 *  longestCommonPrefix(s);
		 */

		
		/*
		 * String s= "MCMIV"; int a=1904; romanToInteger(s); integerToRoman(a);
		 */
		 

		/*
		 * String s = "The quick brown fox jumps over the lazy dog";
	     * panagramChecking(s);
		 */
		
		//String[] s = {"the", "quick", "brown" ,"fox" ,"quick"};
		ArrayList<String> s = new ArrayList<>();
	    s.add("the");
	    s.add("quick");
	    s.add("brown");
	    s.add("fox");
	    s.add("quick");
	    String word1 = "fox";
	    String word2 = "the";
	    
	    closestString(s,word1,word2);
	}

}
