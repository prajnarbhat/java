package linkedlist;
class Node{
	int data;
	Node next;
	Node(int x){
		data=x;
		next=null;
	}
}

public class LL1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node(10);
		//Node temp1=new Node(20);
		//Node temp2=new Node(30);
		head.next=new Node(20);
		head.next.next=new Node(30);
		print(head);

	}
	public static void print(Node head) {
		Node curr=head;
		while(curr!=null) {
			System.out.println(curr.data+" ");
			curr=curr.next;
		}
	}

}
