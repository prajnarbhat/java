package linkedlist;

public class traversingll {
	static int search(Node head,int x) {
		int pos=1;
		Node curr=head;
		if(curr != null) {
			if(curr.data == x) 
				return pos;
			else {
				pos++;
				curr=curr.next;
			}
			
		}
		return pos;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=60;
		Node head=new Node(60);
		head.next=new Node(10);
		head.next.next=new Node(40);
		
		//System.out.println(search(head.next,x));
		int position=search(head,x);
		if (position != -1) {
			System.out.println("element found"+position);
		}
		else {
			System.out.println("element not found");
		
		}

	}

}
