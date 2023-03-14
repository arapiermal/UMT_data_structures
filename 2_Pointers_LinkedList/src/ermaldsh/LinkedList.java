package ermaldsh;

public class LinkedList {
	private Node head;

	public LinkedList() {
		this.head = null;
	}

	public void addNode(int data) {
		Node node = new Node(data);
		if (head == null)
			head = node;
		else {
			Node current = head;
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(node);
		}	
	}
	
	public void printList() {
		Node current = head;
		System.out.print("[ ");
		while(current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNext();
		}
		System.out.println("]");
	}
	
	public boolean contains(int data) {
		Node current = head;
		while(current != null) {
			if(current.getData() == data)
				return true;
			current = current.getNext();
		}
		return false;
	}
	
	public int findMax() {
		if(head == null)
			return Integer.MIN_VALUE;
		Node current = head;
		int max = current.getData();
		current = current.getNext();
		while(current != null) {
			if(current.getData() > max)
				max = current.getData();
			current = current.getNext();
		}
		return max;
	}
	public double findAvg() {
		Node current = head;
		int sum = 0;
		int count = 0;
		while(current != null) {
			sum += current.getData();
			count++;
			current = current.getNext();
		}
		return (double) sum / count;
	}
}
