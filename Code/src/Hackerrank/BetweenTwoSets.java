package bin.hackerrank;
import java.io.*;
import bin.customath.LCMGCD;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static void getTotalX(List<Integer> a, List<Integer> b) {
      // Iterator<Integer> ai = a.iterator();
      // Iterator<Integer> bi = b.iterator();
      int LCM = LCMGCD.forList(a, false);
      int GCD = LCMGCD.forList(b, true);
      System.out.println(LCM+" "+GCD);
    }
}

public class BetweenTwoSets {
    public static void main(String[] args) throws IOException {
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();
        l1.add(2);
        l1.add(4);
        l2.add(16);
        l2.add(32);
        l2.add(96);

        Result.getTotalX(l1, l2);

        // bufferedWriter.write(String.valueOf(total));
        // bufferedWriter.newLine();
        //
        // bufferedReader.close();
        // bufferedWriter.close();
    }
}
