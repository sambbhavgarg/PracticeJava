package bin.hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Kangaroo {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
      if(v1>v2 && x2>x1){
        float n = (float)(x2-x1)/(v1-v2);
        int wholeN = (int)n;
        System.out.println(n);
        if (n%1 == 0)
          return "YES";
        else
          return "NO";
      }
      else return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        //
        // String[] x1V1X2V2 = scanner.nextLine().split(" ");
        //
        // int x1 = Integer.parseInt(x1V1X2V2[0]);
        //
        // int v1 = Integer.parseInt(x1V1X2V2[1]);
        //
        // int x2 = Integer.parseInt(x1V1X2V2[2]);
        //
        // int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(6644, 5868, 8349, 3477);
        System.out.println(result);

        // bufferedWriter.write(result);
        // bufferedWriter.newLine();
        //
        // bufferedWriter.close();
        //
        // scanner.close();
    }
}
