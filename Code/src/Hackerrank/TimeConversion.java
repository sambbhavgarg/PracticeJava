package bin.hackerrank;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    static String timeConversion(String s) {
      String str = s.replaceAll("[^(A-Z)]", "");
      // System.out.println(str);
      if(str.equalsIgnoreCase("PM")){
        s = s.replaceAll(str, "");
        String[] splitted = s.split(":",3);
        int parsedZero = Integer.parseInt(splitted[0]);
        if(parsedZero<12)
          parsedZero+=12;
        splitted[0] = Integer.toString(parsedZero);
        s = String.join(":",splitted);
        return s;
      }
      else if(str.equalsIgnoreCase("AM")){
        s = s.replaceAll(str, "");
        String[] splitted = s.split(":",3);
        int parsedZero = Integer.parseInt(splitted[0]);
        if(parsedZero == 12)
          parsedZero = 0;
        splitted[0] = 0+Integer.toString(parsedZero);
        s = String.join(":",splitted);
        return s;
      }
      return "NULL";
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        //
        // String s = scan.nextLine();
        String s = "06:40:03AM";
        String result = timeConversion(s);
        System.out.println(result);
    //     bw.write(result);
    //     bw.newLine();
    //
    //     bw.close();
    }
}
