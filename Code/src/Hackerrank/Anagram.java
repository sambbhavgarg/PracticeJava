package bin.hackerrank;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class Anagram {

    static void isAnagram(String a, String b) {
      Map<Character, Integer> countCheck = new HashMap<Character, Integer>();
      for(int i=0; i<a.length(); i++){
        countCheck.put(a.charAt(i), 0);
        Character currentLetter = a.charAt(i);
        Integer val = countCheck.get(currentLetter);
        if(val == null)
          countCheck.put(currentLetter, 1);
        else
          countCheck.put(currentLetter, val+1);
      }
      countCheck.forEach((k,v) -> System.out.println(k+v));
      // System.out.println(countCheck);

    }

    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      String a = scan.next();
      String b = scan.next();
      scan.close();
      // boolean ret =
      isAnagram(a, b);
      // System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
