package bin.hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class CamelCase {

    // Complete the camelcase function below.
    static int camelcase(String s) {
      int flag = 1;
      for(int i=0; i<s.length(); i++){
        if(Character.isUpperCase(s.charAt(i)))
          flag++;
      }
      System.out.println(flag);
      return flag;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = "saveChangesInTheEditor";
        // scanner.nextLine();

        int result = camelcase(s);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();
        //
        // bufferedWriter.close();
        //
        // scanner.close();
    }
}
