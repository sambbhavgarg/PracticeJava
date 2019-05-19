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
		new_node.next = head;
		head = new_node;
	}

	void insertBefore(int value, int new_data){
		if(head == null){
			System.out.println("Head can't be null");
			return;
		}
		
		Node new_node = new Node(new_data);

		Node temp = head;
		System.out.println("Outside while");
		while(temp.next.next != null) {
			temp = temp.next;
			System.out.println("Inside while");
			if(temp.next.data == value) {
				new_node.next = temp.next;
				temp.next = new_node;
				return;
			}
			else {
				System.out.println("Entered Node does not exist");
			}
		}
	}
	
	void insertAfter(int value, int new_data){
		if(head == null){
			System.out.println("Head can't be null");
			return;
		}
		
		Node new_node = new Node(new_data);

		Node temp = head;
		System.out.println("Outside while");
		int flag = 0;
		while(temp.next.next != null) {
			temp = temp.next;
//			System.out.println("Inside while");
			if(temp.next.data == value) {
				new_node.next = temp.next;
				temp.next = new_node;
				return;
			}
			flag++;
		}
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
		// if(head == null){
		// 	System.out.println("List Empty.");
		// 	return;
		// }
		System.out.print("list: ");
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.push(5);
		list.push(6);
		list.push(54);
		list.push(90);
		list.push(56);
		list.push(34);
		list.push(50);
		list.insertAfter(5, 20);
		list.insertEnd(67);
		list.push(6);
		list.printList();
	}
}
