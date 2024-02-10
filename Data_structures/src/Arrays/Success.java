package Arrays;

import java.util.HashMap;
import java.util.Map;

public class Success {
	
	static void q1(int a[]) {
		//Java Program to copy all elements of one array into another array
		int n = a.length;
		int b[]= new int[n];
		for(int i=0 ; i< n;i++) {
			b[i]= a[i];
		}
		display(b);
	}
    static void q2(int[] a , int n) {
      //search for array element
    	for(int i=0; i< a.length; i++) {
    		if(a[i]==n) {
    			System.out.println("Element found on "+ i +" index");
    		return ;
    		}
    	}
    	System.out.println("Element doesn't exist"); 
	}
    static void q3(int[] a, int index) {
    	//delete an element in array
        for(int i=index;i<a.length-1;i++ ) {
        	a[i]=a[i+1];
        }
        int b[] = new int[a.length-1];
        for(int i=0; i< a.length-1;i++) {
        	b[i]=a[i];
        }
        display(b);
    }
    static void q4(int [] a) {
    	//counting the frequencies
    	//sol 1 brute force
    	int []freq= new int[a.length];
    	int visited = -1;
    	for(int i=0; i< a.length;i++)
    	{
    		int count =1;
    		for(int j=i+1; j< a.length;j++) {
    			if(a[i]==a[j]) {
    				count++;
    				freq[j]=visited;
    			}
    		}
    		if(freq[i]!= visited)
    		freq[i]=count;
    	}
    	for(int k=0;k<a.length;k++) {
    		if(freq[k]!= visited)
    		System.out.println(a[k]+" "+freq[k]);
    	}
    	//sol2 using hashmap
    	HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
    	for( int i=0 ;i< a.length;i++) {
    		if(mp.containsKey(a[i])) {
    			mp.put(a[i], mp.get(a[i])+1);
    		}
    		else {
    			mp.put(a[i],1);
    		}
    	}
    	displayHashMap(mp);
    	//Note :- hashmap returns random order while iteration , to preserve insertion order use LinkedHashMap
    	
    }
    
    static void q5(int a[], int n){
    	//Rotate array left by n positions
    	for(int i=0;i< n;i++) {
    		int first =a[0];
    		for(int j=0;j< a.length-1;j++) {
    			a[j]=a[j+1];
    		}
    		a[a.length-1]= first;
    	}
    	display(a);
    }
    
    static void q6(int [] a) {
    	//print array in reverse
    	int j= a.length -1;
    	for( ;j!=-1;j--){
    		System.out.print(a[j]+" ");
    	}
    }
    
    static void q7(int []a) {
    	//print odd positions
//    	for(int i=0; i<a.length; i=i+2) {
//    		System.out.print(a[i]+" ");
//    	}
    	//print even postions
    	for(int i=1; i<a.length; i=i+2) {
    		System.out.print(a[i]+" ");
    	}
    }
    
    static void q8(int a[]) {
    	// Java Program to print the largest element in an array
        int max=a[0];
    	for(int i=1;i < a.length;i++) {
    		
    		if(a[i]>max)
    			max=a[i];
    	}
    	System.out.println(max);
    	// Java Program to print the smallest element in an array
        int min=a[0];
    	for(int i=1;i < a.length;i++) {
    		
    		if(a[i]<min)
    			min=a[i];
    	}
    	System.out.println(min);
    	
    }
    
    static void q9(int a[], int n) {
    	//right rotate array with n positions
    	for(int i=0;i< n;i++) {
    		int last=a[a.length-1];
    		for(int j=a.length-2;j>=0;j--) {
    			a[j+1]=a[j];
    		}
    		a[0]=last;
    	}
    	display(a);
    }
    
    static void q10(int a[]) {
    	//3rd max element
    	
    	int max=a[0];
    	for(int i=1;i<a.length;i++) {
    		if(a[i]>max)
    			max=a[i];
    	}
    	int max2=a[0];
    	for(int j=1;j<a.length;j++) {
    		if(a[j]>max2 && a[j] != max)
    			max2= a[j];
    	}
    	int max3=a[0];
    	for(int j=1;j<a.length;j++) {
    		if(a[j]>max3 && a[j] != max &&a[j]!=max2)
    			max3= a[j];
    	}
    	System.out.println(max3);
    }
    
    static void q11(int arr[]) {
    	//delete duplicate element in sorted array
    	// for unsorted array store elements in set because set doesn't contain duplicate elements
    	int temp[]= new int[arr.length];
    	int j=0;
    	 for(int i=0;i< arr.length-1;i++) {
    		 
    		 if(arr[i]!=arr[i+1]) {
    			 temp[j]=arr[i];
    			 j++;
    		 }
    		 
    	 }
    	 temp[j]=arr[arr.length-1];
    	 display(temp);
    	
    }
    
    static void q12(int a[], int n) {
    	//Linear search
    	for(int i =0; i< a.length;i++) {
    		if(a[i]==n) {
              System.out.println(n+" found on index "+i);
              return;
    		}
    	}
        System.out.println(n+" doesn't found");
        //Note:- Improve linear searc
       // when a element is found swap it with previous element or move it to 0th index
        //so that if we find it again in future , it would be found faster
    }

    static void q13(int a[], int key) {
    	//Binary search with looping o(logn)
    	int min=0;
    	int max=a.length-1;
    	int mid;
    	while(min<=max) {
    		mid= (min+max)/2;
    		if(a[mid]==key) {
                System.out.println(key+" found on index "+mid);
                return;
    		}else if(a[mid]>key) {
    			max= mid-1;
    		}
    		else {
    			min=mid+1;
    		}
    	}
    }
    
    static void q14(int a[], int key, int min , int max) {
    	//Recursive binary search
    	int mid= (min+max)/2;
    	if(a[mid]==key) {
    		 System.out.println(key+" found on index "+mid);
             return;
    	}
    	else if(a[mid]>key) {
    		q14(a , key, min , mid-1);
    	}
    	else {
    		q14(a, key , mid+1, max);
    	}
    	
    }
    
    static void q15(int a[]) {
    	//reverse array
    	int []b= new int[a.length];
    	for(int i=a.length-1 ,j=0 ;i>=0;i--,j++) {
    		b[j]= a[i];
    		
    	}
    	display(b);
    }
    
    static void q16(int a[]) {
    	//check if array is sorted
    	for(int i=0; i<a.length-1;i++) {
    		if(a[i]>a[i+1])
    		{
    			System.out.println("Not sorted");
    			return;
    		}
    		
    		
    	}
		System.out.println("sorted");

    }
    
    static void q17(int a[], int b[]) {
    	//Merge two array
    	int c[]= new int[a.length+b.length];
    	int i=0, j=0 ,k=0;
    	for(;i<a.length && j<b.length;k++) {
    		if(a[i]<=b[j]) {
    			c[k]=a[i];
    			i++;
    		}
    		else {
    			c[k]=b[j];
    			j++;
    		}
    	}
    	for(;i<a.length;i++,k++) {
    		c[k]=a[i];
    	}
    	for(;j<b.length;j++,k++) {
    		c[k]=b[j];
    	}
    	
    	display(c);
    	//Method 2 : put a[] value in a treemap then [] in same treeemap and display the keys
    	//treemap sort the keys automatically
    }
    
    static void q18(int c[]) {
    	//find missing in first n natural num
    	for(int i=0; i< c.length;i++) {
    		if(c[i]!=i+1) {
    			System.out.println(i+1 +" is missing");
    			return;
    		}
    			
    	}
    }
    
    static void q19(int c[]) {
    	//find missing in n natural num
    	int diff= c[0];
    	for(int i=1; i< c.length-1;i++) {
    		if(c[i]-i!=diff) {
    			System.out.println(c[i]-1+" is missing");
    			return;
    		}
    			
    	}
    }
    
    static void q20(int c[]) {
    	//find multipal missing in n natural num
    	int diff= c[0];
    	for(int i=0; i<c.length;i++) {
    		if(c[i]-i!=diff) {
    			System.out.println(c[i]-1+ " is missing");
    			diff=c[i]-i;
    		}
    	}
    }
    
    static void q21(int c[],int n) {
    	//find two sum
    	//brute forge
//    	for(int i=0 ;i< c.length-1;i++) {
//    		for(int j=i+1; j<c.length;j++) {
//    			if(c[i]+c[j]==n) {
//    				System.out.println(c[i]+" "+c[j]);
//    				
//    			}
//    		}
//    	}
    	//by using set
    	Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<c.length;i++) {
        	int diff= n-c[i];
        	int result[]= null;
        	if(mp.containsKey(diff)) {
        		result = new int[2];
                result[0] = c[i]; 
                result[1] = diff;
                display(result);
          	}
        	else {
        		mp.put(c[i], 1);
        	}
        }
       
        
    }
    
	static void display(int[] b) {
		for(int i=0;i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		
	}
	
	static void displayHashMap(HashMap<Integer, Integer> mp) {
		for(Map.Entry<Integer , Integer> display :mp.entrySet()) {
			System.out.println(display.getKey()+" "+display.getValue());
		}
		
	}

	public static void main(String[] args) {
		int a[] = {4,10,12,40,46,86,96};
		//q1(a);
		//q2(a , 5);
		//q3(a,3);
		//q4(a);
		//q5(a,4);
		//q6(a);
		//q7(a);
		//q8(a);
		//q9(a, 3);
		//q10(a);
		//q11(a);
		//q12(a,5);
		//q13(a, 4);
		//q14(a,96,0,a.length-1);
		//q15(a);
		//q16(a);
		//int b[] = {9,11,33,108};
		//q17(a,b);
//		int c[]= {1,2,3,4,6,7,8};
//		q18(c);
		//int c[]= {6,7,8,10,11,12};
		//q19(c);
		//int c[]= {6,7,8,10,12};
		//q20(c);
		q21(a,50);
	}

	

}
