package DataStructure.LinkedList.tp;

public class MinMax {
	
	class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
		
	}
	public int size;
	public Node head=null;
	public Node tail=null;
	
	public void insert(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=node;
			tail=node;
		}else {
			tail.next=node;
			tail=node;
		}
		size++;
	}

	public void show() {
		Node n=head;
		if(head==null) {
			System.out.println("List is empty");
		}
		while(n!=null) {
			System.out.println(n.data+" ");
			n=n.next;
		}
		System.out.println();
	}
	public void minNode() {
		Node n=head;
		int min;
		if(n==null) {
			System.out.println("List is Empty");
			return;
		}else {
			min=head.data;
			while(n!=null) {
				if(n.data<min) {
					min=n.data;
				}
				n=n.next;
			}
			System.out.println("Min Node : "+min);
		}
	}
	public void maxNode() {
		Node n=head;
		int max;
		if(n==null) {
			System.out.println("List is empty");
			return;
		}else {
			max=head.data;
			while(n!=null) {
			if(n.data>max) {
				max=n.data;
			}
			n=n.next;
			}
		System.out.println("Max Node : "+max);
		}
	}
	public static void main(String[] args) {
		MinMax mm=new MinMax();
		mm.insert(3);
		mm.insert(4);
		mm.insert(5);
		mm.insert(6);
		mm.insert(7);
		System.out.println("Size of the list "+mm.size);
		mm.show();
		mm.maxNode();
		mm.minNode();

	}
}
