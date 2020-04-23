package DataStructure.LinkedList.tp;

public class InsertMiddle {

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public int size;
	public Node head = null;
	public Node tail = null;

	public void insert(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
		size++;
	}

	public void show() {
		Node n = head;
		if (n == null) {
			System.out.println("List is empty");
			return;
		} else {
			while (n != null) {
				System.out.print(n.data + " ");
				n = n.next;
			}
			System.out.println();
		}
	}

	public void insertAt(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			Node n = head;
			int mid = (size % 2 == 0) ? (size / 2) : (size + 1 / 2);
			for (int i = 0; i < mid - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
		size++;
	}

	public void addInMid(int data) {
		// Create a new node
		Node newNode = new Node(data);

		// Checks if the list is empty
		if (head == null) {
			// If list is empty, both head and tail would point to new node
			head = newNode;
			tail = newNode;
		} else {
			Node temp, current;
			// Store the mid position of the list
			int count = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
			// Node temp will point to head
			temp = head;
			current = null;
			// Traverse through the list till the middle of the list is reached
			for (int i = 0; i < count; i++) {
				// Node current will point to temp
				current = temp;
				// Node temp will point to node next to it.
				temp = temp.next;
			}
			// current will point to new node
			current.next = newNode;
			// new node will point to temp
			newNode.next = temp;
		}
		size++;
	}

	public static void main(String[] args) {
		InsertMiddle im = new InsertMiddle();
		// im.insert(6);
		// im.insert(5);
		im.insert(3);
		im.insert(2);
		im.show();
		System.out.println(im.size);
		im.insertAt(4);
		im.show();
	}
}
