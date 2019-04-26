import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
      int [] x = new int[26];
      int [] y = new int[26];

      for(int i=0,j=0; i<a.length(); i++){
         int pos = (int)a.charAt(i);
      }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
