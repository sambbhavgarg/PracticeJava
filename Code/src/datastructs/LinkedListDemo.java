package datastructs;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("1");
		ll.add("2");
		ll.add("3");
		ll.add("4");
		Iterator<String>i = ll.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
