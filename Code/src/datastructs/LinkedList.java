package datastructs;

public class LinkedList {
	Node head;

	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}

	void push(int new_data){
		Node new_node = new Node(new_data);
		head = new_node;
		new_node = head;
	}

	void insertAfter(Node prev_node, int new_data){
		if(prev_node == null){
			System.out.println("Previous node can't be null");
			return;
		}

		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}

	void insertEnd(int new_data){

		Node new_node = new Node(new_data);

		if(head == null){
			head.next = new_node;
			new_node.next = null;
			return;
		}

		Node temp = head;
		while(temp.next!=null){
			temp = temp.next;
		}
		temp.next = new_node;
	}

	void printList(){
		Node temp = head;
		if(head == null){
			System.out.println("List Empty.");
			return;
		}
		while(temp.next!=null){
			System.out.println("list: "temp.data+" ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.push(5);
		list.printList();
	}
}
