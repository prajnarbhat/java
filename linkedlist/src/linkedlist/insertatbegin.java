package linkedlist;
class Node1{
	int data;
	Node next;
	Node1(int x){
		data=x;
		next=null;
	}
}

public class insertatbegin {
	static linkedlist.Node insert(Node head,int x) {
		Node temp=new Node(x);
		temp.next=head;
		return temp;
	}
	public static void main(String[] args) {
		Node head=null;
		head=insert(head,30);
		head=insert(head,20);
		head=insert(head,10);
	
	Node current = head;
	while (current != null) {
		System.out.println(current.data+" ");
		current=current.next;
	}
	}
	
	
	
	//private static linkedlist.Node insert(linkedlist.Node head, int i) {
		// TODO Auto-generated method stub
	//	return null;
	//}
	
}
