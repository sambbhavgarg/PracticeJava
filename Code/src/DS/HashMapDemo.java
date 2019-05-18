package datastructs;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("Sambbhav","Garg");
		hm.put("Samarth","Singh");
		hm.put("Sumer","Chandra");
		hm.put("Ansh","Agrawal");
		hm.put("Suvrat","Jain");
		hm.put("Saurabh","Aggarwal");
		hm.put("Aaryash","Raj Sinha");
		System.out.println(hm.keySet());
		System.out.println(hm.get("Sambbhav"));
		System.out.println(hm.get("Samarth"));
		System.out.println(hm.get("Sumer"));
		System.out.println(hm.get("Ansh"));
		System.out.println(hm.get("Suvrat"));
		System.out.println(hm.get("Saurabh"));
		System.out.println(hm.get("Aaryash"));
	}

}
