package LinkedList;

public class SingleLinkedList {
	
	class Node{
		 int value;
		 Node next;
		  
		 public Node(int value) {
			 this.value= value;
			 this.next= null;
		 }
	}
	
	Node head= null;
	Node tail= null;
	
    public void addNode(int value) {
    	Node newNode = new Node(value);
    	if(head==null) {
    		//If this is the first and last node (Only Node of linkedList)
    		head= newNode;
    		tail= newNode;
    	}
    	else {
    		//add this node to the last at tail
    		tail.next=newNode;
    		tail= newNode;
    		
    	}
    }
    
    public void lastDelete() {
    	Node current= head;
    	Node temp= null;
    	while(current.next!= null) {
    		temp=current;
    		current= current.next;
    	}
    	temp.next= null;
        tail=temp;
    	
    }
    
    public void firstDelete() {
    	Node current = head;
    	current= current.next;
    	head=current;
    }
    
    public void keyDelete(int key) {
    	Node current= head;
    	Node prev= null;
    	if(key==head.value) {
    		firstDelete();
    	}
    	else if(key==tail.value) {
    		lastDelete();
    	}
    	else {
    		while(current.value!=key) {
            	prev=current;
            	current=current.next;
            }
            prev.next=current.next;
    	}
        
    }
    
    public void keyInsert(Node nodeToInsert) {
    	
    	nodeToInsert.next=head;
    		head=nodeToInsert;
    		
    	
    }
    
    
    public void keyInsetAtLast(Node nodeToInsert) {
    	
    	tail.next=nodeToInsert;
    	tail=nodeToInsert;
    }
    
    public void keyInsetAtRandom(Node nodeToInsert , int pos) {
    	Node temp=head;
    	Node prev=null;
    	int i=1;
    	while(i<pos) {
    		i++;
    		prev=temp;
    		temp=temp.next;
    	}
    	prev.next=nodeToInsert;
    	nodeToInsert.next=temp;
    	
    }
    
    public void checkIfSorted(SingleLinkedList sll) {
    	Node temp= sll.head;
    	while(temp.next!=null) {
    		if(temp.value>temp.next.value) {
    			System.out.println("Not sorted");
        		return;
    		}
    		temp=temp.next;
    	}
		System.out.println(" sorted");
    }
    
    public void countingAndSumOfNodes(SingleLinkedList sll) {
    	int sum=0;
    	int node=0;
    	Node temp= sll.head;
    	
    	while(temp!=null) {
    		node++;
    		sum+=temp.value;
    		temp=temp.next;
    	}
    	System.out.println(node+" "+sum);
    }
    
    public void reverseLinkedList(SingleLinkedList sll) {
    	//sliding pointers approach
    	Node p= sll.head;
    	Node q=null;
    	Node r= null;
    	while(p!=null) {
    		r=q;
    		q=p;
    		
    		p=p.next;
    		q.next=r;
    		
    	}
    	while(q!=null) {
    		System.out.print(q.value+" ");
    		q=q.next;
    	}
    }
    
    public void concatTwoLinkedList(SingleLinkedList sll1, SingleLinkedList sll2) {
    	Node p= sll1.head;
    	while(p.next!=null) {
    		p=p.next;
    	}
    	p.next=sll2.head;
    	sll2.head=null;
        display();
    }
    
    public void mergeTwoLinkedList(Node head1, Node head2) {
    	//Node head1= sll.head;
    	//Node head2= sll2.head;
    	Node dummyNode= new Node(0);
    	Node tail= dummyNode;
    	
    	while(true) {
    		if(head1==null) {
    			tail.next=head2;
    			break;
    		}
    		else if(head2==null) {
    			tail.next=head1;
    			break;
    		}
    		else if(head1.value<=head2.value){
    		   tail.next=head1;
    		   head1=head1.next;
    		}
    		else if(head2.value<head1.value) {
    			tail.next=head2;
    			head2=head2.next;
    		}
    		tail=tail.next;
    	}
    	
    }
    
    public void checkIfLoop(SingleLinkedList sll) {
    	//use two pointer aproach .....if faster pointer catches slower again than it meanns there is a loop
    	
    	Node temp1= sll.head;
    	Node temp2= sll.head;
    	do {
    		temp1= temp1.next;
    		temp2= temp2.next;
    		temp2=temp2!=null?temp2.next:temp2;
    	}while(temp1!=null && temp2!=null && temp1!=temp2);
    	
    	if(temp1==temp2) {
    		System.out.println("Loop detected");
    	}
    		
    	else
    		System.out.println("No loop");
    	
    }
    public static void create(int a[]) {
    	Node head=null;
    			
    	for(int i=0; i<a.length;i++) {
    		head=insert(head,a[i]);
    		
    	}
    	while(head!=null) {
    		System.out.print(head.value+" ");
    		head=head.next;
    	}
    }
    
    private static Node insert(Node head, int item) {
    	SingleLinkedList sll = new SingleLinkedList();
    	Node newHead= sll.new Node(item);
    	Node temp;
    	
    	if(head==null) {
    		head=newHead;
    	}
    	else {
    		temp=head;
    		while(temp.next!=null) {
    			temp=temp.next;
    		}
    		temp.next=newHead;
    	}
		return head;
	}

    
    public void deleteEntireLinkedList(SingleLinkedList sll){
    //to delete entire linkedlist just delte head and tail references then garbage collector will dlete all the memory allcation for nodes
    	
    	sll.head= null;
    	sll.tail=null;
    	
    	
    }
	public void display() {
    	Node current = head;
    	while(current!=null) {
    		System.out.print(current.value+" ");
    		current= current.next;
    	}
    }
    
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SingleLinkedList sll = new SingleLinkedList();
        //SingleLinkedList.Node nodeToInsert = sll.new Node(10);
        sll.addNode(1);
        sll.addNode(5);
        sll.addNode(6);
        sll.addNode(8);
        sll.addNode(14);
        //sll.display();
       // sll.lastDelete();
        //sll.firstDelete();
        //sll.keyDelete(8);
        //sll.keyInsertAtHead(10);
        //sll.keyInsertAtHead(10);
        //sll.keyInsert(nodeToInsert);
        //sll.keyInsetAtLast(nodeToInsert);
       // sll.keyInsetAtRandom(nodeToInsert,3);
        //sll.checkIfSorted(sll);
       // sll.countingAndSumOfNodes(sll);
       // sll.reverseLinkedList(sll);
//        SingleLinkedList sll2 = new SingleLinkedList();
//        sll2.addNode(3);
//        sll2.addNode(4);
//        sll2.addNode(11);
//        sll2.addNode(18);
//        sll2.addNode(22);
//        sll2.addNode(24);
//        sll2.addNode(28);
        //sll2.concatTwoLinkedList(sll,sll2);
       // sll.mergeTwoLinkedList(sll.head ,sll2.head);
//        Node t1= sll.head.next.next;
//        Node t2= sll.head.next.next.next.next;
       // t2.next=t1;
        //sll.checkIfLoop(sll);
        //int a[]= {3,5,7,8,9};
        //create(a);
        sll.deleteEntireLinkedList(sll);

        sll.display();
        

	}

}
