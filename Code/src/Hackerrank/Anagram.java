package bin.hackerrank;
import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
      boolean fin = true;
      int [] x = new int[26];
      int [] y = new int[26];
      if(a.length() == b.length()){
        for(int i=0; i<a.length(); i++){

           int posa = (int) a.charAt(i);
           int posb = (int) b.charAt(i);

           if(posa>=97 && posb>=97){
            ++x[posa-97];
            ++y[posb-97];
           }

           else if(posa>=65 && posb>=65){
            ++x[posa-65];
            ++y[posb-65];
          }
        }

        int flag = 0;

        for(int i=0; i<x.length-1; i++)
          if(x[i]==y[i]) ++flag;

        if (flag == 26) fin = true;
        else fin = false;
      }
      else
          fin = false;
      return fin;
    }
    //do with hashmaps

    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      String a = scan.next();
      String b = scan.next();
      scan.close();
      boolean ret = isAnagram(a, b);
      System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
