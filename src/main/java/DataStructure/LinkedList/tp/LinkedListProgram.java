package DataStructure.LinkedList.tp;

public class LinkedListProgram {
	Node head;
	int size;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
		size++;
	}

	public void show() {
		Node node = head;
		while (node.next!= null) {
			System.out.println(node.data + "\n");
			node = node.next;
		}
		System.out.println(node.data);
	}

	public void insertFirst(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}

	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (index == 0) {
			insertFirst(data);
		} else {

			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node n = head;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			System.out.println("n1 " + n1.data);
			n1 = null;
		}
	}

	public int countNodes() {
		int count = 0;
		Node node = head;

		while (node != null) {
			count++;
			node = node.next;
		}

		return count;
	}

	public void reverse(Node node) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else {

			if (node.next == null) {
				System.out.println(node.data + " ");
				return;
			}
			reverse(node.next);
			System.out.println(node.data);
		}

	}

	public Node reverseList(Node temp) {
		Node current = temp;
		Node prevNode = null, nextNode = null;

		// Swap the previous and next nodes of each node to reverse the direction of the
		// list
		while (current != null) {
			nextNode = current.next;
			current.next = prevNode;
			prevNode = current;
			current = nextNode;
		}
		return prevNode;
	}

	public void deleteFromStart() {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			head = head.next;
		}
	}

	public void deleteExceptFirst(int index) {
		Node n = head;
		Node n1 = null;
		for (int i = 0; i < index - 1; i++) {
			n = n.next;
		}
		n1 = n.next;
		n.next = n1.next;
		System.out.println("n1 " + n1.data);
		n1 = null;
	}

	public Node removeLastNode(Node head) {
		if (head == null || head.next == null) {
			return null;
		} else {
			// Find the second last node
			Node second_last = head;
			while (second_last.next.next != null)
				second_last = second_last.next;

			// Change next of second last
			second_last.next = null;

			return head;
		}
	}

	public void deleteFromEnd(Node head) {
		if (head == null) {
			System.out.println("List is empty");
		} else if (head.next == null) {
			System.out.println("List is null");
		} else {
			Node second_last_node = head;
			while (second_last_node.next.next != null) {
				second_last_node = second_last_node.next;
				second_last_node.next = null;
			}
		}
	}

	/*
	 * public void isPalimdrom() { boolean flag = true; Node node = head; int mid =
	 * (size % 2 == 0) ? (size / 2) : (size + 1 / 2); for (int i = 0; i < mid; i++)
	 * { node = node.next; } Node revHead = reverseList(node.next);
	 * 
	 * while (head != null && revHead != null) { if (head.data != revHead.data) {
	 * flag = false; break; } head = head.next; revHead = revHead.next; }
	 * 
	 * if (flag) System.out.println("Given singly linked list is a palindrome");
	 * else System.out.println("Given singly linked list is not a palindrome"); }
	 */

	public static void main(String[] args) {
		LinkedListProgram list = new LinkedListProgram();
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(3);
		list.insert(2);
		//list.insertFirst(5);
		//list.insertAt(0, 7);

		//list.deleteAt(0);
		list.show();
		System.out.println("==================================");
		System.out.println(list.countNodes());
		System.out.println("==================================");
		list.reverse(list.head);
		System.out.println("==================================");
		//list.deleteFromStart();
		list.show();
		System.out.println("==================================");
		//list.deleteExceptFirst(1);
		list.show();
		System.out.println("=================deleteFromEnd=================");
		Node n = list.removeLastNode(list.head);
		list.show();
		
		//list.isPalimdrom();
		
	}
}
