package bin.hackerrank;
import java.util.*;
class BracketStack{

	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input=sc.next();
      if(input == "\\U+007B")
        System.out.println(input);
      else
        System.out.println("no");
		}

	}
}
