package DataStructure.LinkedList.tp;

public class CircularLinkedList {
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node head = null;
	public Node tail = null;

	public void insert(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
			node.next = head;
		} else {
			tail.next = node;
			tail = node;
			tail.next = head;
		}
	}

	public void dispaly() {
		Node current = head;
		if (head == null) {
			return;
		} else {
			System.out.println("Nodes of the circular linked list: ");
			do {
				// Prints each node by incrementing pointer.
				System.out.print(" " + current.data);
				current = current.next;
			} while (current != head);
			System.out.println();
		}
	}

	public void countNodes() {
		Node n = head;
		int count = 0;
		if (head == null) {
			System.out.println("List is empty");
		} else {
			do {
				n = n.next;
				count++;
			} while (n != head);
			System.out.println();
			System.out.println(count);
		}
	}

	public void reverse(Node n) {
		if (n.next == head) {
			System.out.println(n.data);
			return;
		}
		reverse(n.next);
		System.out.println(n.data);
	}
	public void deleteFirst() {
		if(head==null) {
			return ;
		}else {
			if(head!=tail) {
				head=head.next;
				tail.next=head;
			}
		}
	}

	public static void main(String[] args) {
		CircularLinkedList cll = new CircularLinkedList();
		cll.insert(4);
		cll.insert(5);
		cll.insert(6);

		cll.dispaly();
		cll.countNodes();
		System.out.println("==============");
		cll.reverse(cll.head);
		System.out.println("==============");
		cll.deleteFirst();
		cll.dispaly();
	}
}
