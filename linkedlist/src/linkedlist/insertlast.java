package linkedlist;
class Node3{
	int data;
	Node next;
	Node3(int x){
		data=x;
		next=null;
	}
}


public class insertlast {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=null;
		head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		int x = 40;
		Node temp=new Node(x);
		if(head==null) {
			head=temp;
		}
		else {
		
		Node curr=head;
		while(curr.next != null) {
			curr=curr.next;
		}
		curr.next=temp;
		}
		Node current = head;
		while (current != null) {
			System.out.println(current.data+" ");
			current=current.next;
		


	}

	}
}
