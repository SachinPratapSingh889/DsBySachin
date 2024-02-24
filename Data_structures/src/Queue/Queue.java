package Queue;

import LinkedList.SingleLinkedList;
import LinkedList.SingleLinkedList.Node;

class LinearQueue {

	int[] linearQueue;
	int beginingPointer = -1;
	int topPointer = -1;

	public void create(int size) {
		linearQueue = new int[size];
		System.out.println("A linear queue of size 6 is created");
	}

	public boolean isEmpty() {
		if (beginingPointer == -1)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (topPointer == linearQueue.length - 1)
			return true;
		else
			return false;
	}

	public void enQueue(int element) {
		// add elements on front of queue/array
		if (!isFull()) {
			if (beginingPointer == -1) {
				beginingPointer = 0;
				topPointer++;
				linearQueue[topPointer] = element;
			} else {
				topPointer++;
				linearQueue[topPointer] = element;
			}
		} else
			System.out.println("Queue is already full");

	}

	public int deQueue() {
		// dequeue means return/remove the front element and remember after removing
		// most front element the elements behind it never step by one ahead(they stays
		// at their place) otherwise queue will never be full;
		if (!isEmpty()) {
			int elementToPop = linearQueue[beginingPointer];
			beginingPointer++;
			// imp:beginingPointer>topPointer means we just poped the last element, so queue
			// is empty now
			if (beginingPointer > topPointer) {
				beginingPointer = topPointer = -1;
			}
			return elementToPop;
		} else {
			System.out.println("Queue is already empty , nothing to Pop");
			return -1;
		}
	}

	public int peek() {
		// return the most front element in queue
		if (!isEmpty())
			return linearQueue[beginingPointer];
		else
			return -1;
	}

	public void delete() {
		// return the most front element in queue
		if (!isEmpty())
			linearQueue = null;
	}

	public void display() {
		for (int i : linearQueue)
			System.out.println(i);
	}
}

class CircularQueue {

	// Why we need circular queue:- Suppose our queue is full (begining pointer is
	// at 0 index and top pointer is at length-1 index , if we dequeue a element our
	// begining pointer shift to one and that cell gets dismissed and still our
	// queue shows full because the dismissed cell is not resusable we cant enqueue
	// element at that cell , suppose we have dequeue all the element still we cant
	// use dismissed cells. thats a wastage of space so we use Circular queues.
	// In short we face problem of empty cells in linear queue

	int[] circularQueue;
	int beginingPointer;
	int topPointer;

	public void create(int size) {
		// same as linear queue
		circularQueue = new int[size];
		beginingPointer = -1;
		topPointer = -1;
	}

	public boolean isEmpty() {
		// same as linear queue
		if (beginingPointer == -1)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (beginingPointer == 0 && topPointer == circularQueue.length - 1)
			return true;
		else if (beginingPointer != 0 && beginingPointer == topPointer + 1)// like beginpointer is at 3 and top is at 4
																			// mean no empty cells in between begin and
																			// top cells
			return true;
		else
			return false;
	}

	public void enQueue(int element) {
		if (!isFull()) {
			if (beginingPointer == -1) {
				beginingPointer = 0;
				topPointer++;
				circularQueue[topPointer] = element;
			} else {
				if (topPointer == circularQueue.length - 1) {
					topPointer = 0;
				} else {
					topPointer++;
				}
				circularQueue[topPointer] = element;
			}
		} else
			System.out.println("circular queue is full");

	}

	public int deQueue() {
		if (!isEmpty()) {
			int result = circularQueue[beginingPointer];
			circularQueue[beginingPointer] = 0;

			if (topPointer == beginingPointer) {
				// list has been ended completely after poping out all the elements
				topPointer = beginingPointer = -1;
			} else if (beginingPointer == circularQueue.length - 1) {
				beginingPointer = 0;
			} else
				beginingPointer++;
			return result;
		} else
			return -1;
	}

	public int peek() {
		if (!isEmpty()) {
			int result = circularQueue[beginingPointer];
			return result;
		} else
			return -1;
	}

	public void delete() {
		circularQueue = null;
	}

	public void display() {
		for (int i : circularQueue)
			System.out.println(i);
	}

}

class LinearQueueUsingLinkedList {
     SingleLinkedList cll;
     
     public LinearQueueUsingLinkedList() {
    	 cll = new SingleLinkedList();
     }
     
     public void enQueue(int element) {
    	 cll.addNode(element);
     }
     
     public void deQueue() {
    	 cll.firstDelete();
     }
     
     public int peek() {
    	return cll.head.value;
     }
     
     public void delete() {
    	 cll.deleteEntireLinkedList(cll);
     }
     
     public void display() {
    	 cll.display();
     }
}

public class Queue {
	public static void main(String[] args) {
		//  Operations for linear Queue using array
//			LinearQueue qu = new LinearQueue();
//			qu.create(6);
//			boolean ans = qu.isEmpty();
//			System.out.println(ans);
//			boolean ans1 = qu.isFull();
//			System.out.println(ans1);
//			qu.enQueue(3);
//			qu.enQueue(4);
//			qu.enQueue(5);
//			qu.enQueue(2);
//	        System.out.println(qu.deQueue());
//	        System.out.println(qu.deQueue());
//			qu.enQueue(12);
//
//	        qu.peek();
//	        qu.delete();
//			qu.display();

		// Operations for Circular Queue using array
//		CircularQueue cqu = new CircularQueue();
//		cqu.create(5);
//			System.out.println(cqu.isEmpty());
//			System.out.println(cqu.isFull());
//		cqu.enQueue(3);
//		cqu.enQueue(4);
//		cqu.enQueue(5);
//		cqu.enQueue(2);
//		cqu.enQueue(32);

//		cqu.display();
//		System.out.println("--------------");

//
//	        cqu.deQueue();
//		System.out.println(cqu.deQueue());
//		System.out.println(cqu.deQueue());
//		System.out.println(cqu.deQueue());
//		System.out.println(cqu.deQueue());
//
//		cqu.enQueue(62);
//		cqu.enQueue(992);
//		cqu.enQueue(5492);
//		cqu.enQueue(602);

//
//
//	    System.out.println(cqu.deQueue());
//      cqu.display();

//      cqu.deQueue();
//		System.out.println("peek " + cqu.peek());
//	        cqu.delete();
//		cqu.display();
//		System.out.println(cqu.isFull());

		// LinearQueue Using linked list operations
//		LinearQueueUsingLinkedList quLL = new LinearQueueUsingLinkedList();
//		quLL.enQueue(9);
//		quLL.enQueue(2);
//		quLL.enQueue(12);
//		quLL.enQueue(29);
//		quLL.deQueue();
//		quLL.deQueue();
//		System.out.println(quLL.peek()); 
//	    quLL.display();
//        quLL.delete();

	}
}
