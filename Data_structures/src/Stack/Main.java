package Stack;

import LinkedList.SingleLinkedList;

class StackUsingArray {
	
	int []stk;
	int topOfStack=-1;
	
	StackUsingArray(int size) {
		//lets make a stack of size 5
		 this.stk= new int[5];
	     this.topOfStack=-1;
	     
	     System.out.println("Stack of length 5 has been created");
	}
	
	boolean isEmpty() {
		if(topOfStack==-1) {
			System.out.println("Stack is empty");
			return true;
		}
		return false;
	}
	
	 boolean isFull() {
		if(topOfStack==stk.length-1) {
			System.out.println("Stack is full");
			return true;
		}
		return false;
	}
	
	 void push(int num) {
		if(!isFull()) {
			this.topOfStack=topOfStack+1;
			stk[topOfStack]=num;
		}
	}
	
	 int pop( int index) {
		int numtoReturn =stk[topOfStack];
	    this.topOfStack--;
		return numtoReturn;
	}
	
	 int peek() {
		return stk[topOfStack];
	}
	
	 void deleteStack() {
		stk= null;
	}
	
	 void display() {
		 if(stk==null)
			 System.out.println("Stack is deleted");
		 else {
			 for(int i=0;i<=topOfStack;i++) {
				 System.out.print(stk[i]+" ");
			 }
		 }
		
	}
	
}	
 
class StackImplementationUsingLinkedList{
	//Import SingleLinkedList class created
	SingleLinkedList singleLinkedList;
	
	//stack created
	public StackImplementationUsingLinkedList(){
		singleLinkedList= new SingleLinkedList();
	}
	
	public void push(int value) {
	 //always remember whenever push in stack using linked list , push element at head and make it head.
		singleLinkedList.keyInsertAtHead(value);
	}
	
	public void pop() {
		//last element pushed should be poped 
		singleLinkedList.firstDelete();
	}
	
	public int peek() {
		//head is the peek
		if(!isEmpty())
		return singleLinkedList.head.value;
		else
			return -1;
	}
	
	public void delete() {
        if(!isEmpty()) {
        	singleLinkedList.head=null;
        }
	}
	
	public void display() {
		 //always remember whenever push in stack using linked list , push element at head and make it head.
			singleLinkedList.display();
	}
		
	public boolean isEmpty() {
		if(singleLinkedList.head==null)
			return true;
		else
			return false;
	}
	
}
	
public class Main {
	
	public static void main(String[] args) {

	// Q1: what is stack Data structure
	// ans: The stack is a linear data structure that is used to store the collection of objects. It is based on Last-In-First-Out (LIFO).
		
	// In java we have stack class that provides diff methods like push(),pop(),peek()
		
	/*
	 * Implementation of stack using array. Do two things
	 * 1. fixed size array
	 * 2. A variable and name it top.
	 * 
	 */		
		
	 
	 int size=5;
//	 StackUsingArray st= new StackUsingArray(size);
//	 st.isEmpty();
//	 st.isFull();
//     st.push(8);
//    st.push(9);
//	 st.push(67);
//	 st.push(87);
//	 st.push(97);
//	 st.isEmpty();
//	 st.isFull();
//	 int popedNum=st.pop(2);
//     System.out.println(popedNum);
//	 int peekedNumber=st.peek();
//    System.out.println(peekedNumber);
//	 st.deleteStack();
//	 
//	 
//	 we don't define size when implementin stack linked list coz linked list size is never fixed
//	 st.display();
	 StackImplementationUsingLinkedList stackAsList = new StackImplementationUsingLinkedList();
	 stackAsList.push(9);
	 stackAsList.push(12);
	 stackAsList.push(17);
	 stackAsList.push(7);
	 stackAsList.display();
	 boolean ans =stackAsList.isEmpty();
	 System.out.println(ans);
	//Note linked list can't be full any time coz it is not fixed size so no method name isFull is created;
	// stackAsList.pop();
	//int topValue= stackAsList.peek();
	//System.out.println(topValue);
	 stackAsList.delete();
     stackAsList.display();
	}



}
