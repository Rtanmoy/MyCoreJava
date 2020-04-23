package List;

public class CircularLinkedListEx1 {
	// Represents the node of list.
	public class Node {
		private int data;
		private Node next;

		public Node(int data) {
			super();
			this.data = data;
		}

	}

//Declaring head and tail pointer as null.  
	public Node head = null;
	public Node tail = null;

//This function will add the new node at the end of the list.  
	public void add(int data) {
		// create a new node
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			tail.next = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}

	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("List is Null");
		} else {
			System.out.println("The element of the list");
			do {
				System.out.println(current.data);
				current = current.next;
			} while (current != head);
			System.out.println();

		}
	}
	public static void main(String[] args) {
		CircularLinkedListEx1 cl=new CircularLinkedListEx1();
		cl.add(2);
		cl.add(4);
		cl.add(32);
		cl.add(6);
		cl.display();
	}
}
