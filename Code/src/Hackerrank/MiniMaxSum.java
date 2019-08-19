package bin.hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MiniMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
      Integer[] arrInteger = new Integer[arr.length];
      for (int i=0; i<arr.length; i++) {
         arrInteger[i] = Integer.valueOf(arr[i]);
      }
      int min = 0, max = 0;
      long sum = 0;
      for(int i=0; i<arr.length; i++)
        sum += (long)arr[i];
      int minArray = Collections.min(Arrays.asList(arrInteger));
      int maxArray = Collections.max(Arrays.asList(arrInteger));
      System.out.println((sum-(long)maxArray)+" "+(sum-(long)minArray));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
