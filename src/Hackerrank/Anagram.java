package bin.hackerrank;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
      int [] x = new int[26];
      int [] y = new int[26];
      if(a.length() == b.length()){
        for(int i=0, j=0; i<a.length(); i++){

           int posa = (int) a.charAt(i);
           int posb = (int) b.charAt(j);

           if(pos>90){
            ++x[posa-97];
            ++y[posb-97];
           }

           else{
            ++x[posa-65];
            ++y[posb-97];
          }
        }
      }
      else return false;
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
