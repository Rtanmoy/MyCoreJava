package DataStructure.LinkedList.tp;

public class RemoveDuplicate {
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
		if (head == null) {
			System.out.println("List is empty");
		} else {
			Node n = head;
			while (n != null) {
				System.out.println(n.data + " ");
				n = n.next;
			}
		}
	}

	public void deleteDuplicate() {
		Node n = head;
		Node temp = null, index = null;
		if (n == null) {
			return;
		} else {
			while (n != null) {
				temp = n;
				index = n.next;
				while (index != null) {
					if (n.data == index.data) {
						temp.next = index.next;
					} else {
						temp = n;
					}
					index = index.next;
				}
				n = n.next;
			}
		}
	}

	void removeDuplicates() {
		/* Another reference to head */
		Node curr = head;

		/* Traverse list till the last node */
		while (curr != null) {
			Node temp = curr;
			/*
			 * Compare current node with the next node and keep on deleting them until it
			 * matches the current node data
			 */
			while (temp != null && temp.data == curr.data) {
				temp = temp.next;
			}
			/*
			 * Set current node next to the next different element denoted by temp
			 */
			curr.next = temp;
			curr = curr.next;
		}
	}

	public static void main(String[] args) {
		RemoveDuplicate rd = new RemoveDuplicate();
		rd.insert(3);
		rd.insert(4);
		rd.insert(4);
		rd.insert(5);
		rd.insert(6);
		rd.insert(7);

		rd.show();
		rd.deleteDuplicate();
		System.out.println("===================");
		rd.show();
	}
}
