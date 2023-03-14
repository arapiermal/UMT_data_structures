package ermaldsh;

public class Main {

	public static void main(String[] args) {
		LinkedList test = new LinkedList();
		test.addNode(10);
		test.addNode(20);
		test.addNode(15);
		test.printList();
		System.out.println(test.findAvg());
		System.out.println(test.findMax());
		
	}

}
