// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
package hackerrank;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class BiggerIsGreater {
	public static void main(String args[]){ //throws NumberFormatException, IOException
    Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(; t>0; t--) {
			String w = scan.next();
			if(w.length() == 1) {
				System.out.println("no answer");
				continue;
			}

			int i;
			List<Character> list = new ArrayList<Character>();
			list.add(w.charAt(w.length()-1));

			for(i=w.length()-2; i>=0; i--) {
				if(w.charAt(i) < w.charAt(i+1))
					break;
				list.add(w.charAt(i));
			}

			if(i == -1) {
				System.out.println("no answer");
				continue;
			}

			Character[] arr = list.toArray(new Character[list.size()]);
			Arrays.sort(arr);
			String ret = w.substring(0,i);
			int j;
			for(j = 0; j < arr.length; j++) {
				if(arr[j] > w.charAt(i))
					break;
			}
			ret += arr[j];
			arr[j] = w.charAt(i);
			Arrays.sort(arr);
			for(Character c : arr)
				ret += c;
			System.out.println(ret);
		}
	}
}
