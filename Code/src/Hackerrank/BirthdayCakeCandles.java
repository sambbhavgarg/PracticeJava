package bin.hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class BirthdayCakeCandles {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
      int max = 0, flag = 0;
      for(int i=0; i<ar.length; i++){
        System.out.println(max);
        if(max<ar[i]){
          max = ar[i];
          if(flag>1){
            flag++;
          }
          else
            System.out.println("Entered");
            flag = 1;
        }
      }
      return flag;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        //
        // int arCount = scanner.nextInt();
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //
        // int[] ar = new int[arCount];
        //
        // String[] arItems = scanner.nextLine().split(" ");
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //
        // for (int i = 0; i < arCount; i++) {
        //     int arItem = Integer.parseInt(arItems[i]);
        //     ar[i] = arItem;
        // }
        int [] ar = {18,90,90,13,90,75, 90, 8, 90, 43};
        int result = birthdayCakeCandles(ar);
        System.out.println(result);
        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();
        //
        // bufferedWriter.close();
        //
        // scanner.close();
    }
}
