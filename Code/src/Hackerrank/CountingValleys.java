package bin.hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {

    // Complete the countingValleys function below.
    static void countingValleys(int n, String s) {
      int c = 0, v = 0;
        StringBuilder str = new StringBuilder(s);
        for(int i=0; i<str.length(); i++){
            if(str.charAt(0) == 'U'){
                if(str.charAt(i) == 'U')
                    c++;
                else c--;
                if(c==0){
                    str.delete(0, i);
                }
            }
            else if(str.charAt(0) == 'D'){
                if(str.charAt(i) == 'U')
                    c++;
                else c--;
                if(c==0){
                    v++;
                    str.delete(0, i);

                }
            }
        }
        return v;
    }

    // private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();
        // int n = 12;
        // String s = "DDUUDDUDUUUD";

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
