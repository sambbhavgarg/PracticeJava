package bin.hackerrank;
import java.io.*;
import java.util.*;

public class StringsIntro {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();



        System.out.println((A.length()+B.length()));
        if(A.compareTo(B)>0)
          System.out.println("Yes");
        else
          System.out.println("No");

        A = StringsIntro.convertToTitleCaseIteratingChars(A);
        B = StringsIntro.convertToTitleCaseIteratingChars(B);

        System.out.println(A+" "+B);
    }
    public static String convertToTitleCaseIteratingChars(String text) {
    if (text == null || text.isEmpty()) {
        return text;
    }

    StringBuilder converted = new StringBuilder();

    boolean convertNext = true;
    for (char ch : text.toCharArray()) {
        if (Character.isSpaceChar(ch)) {
            convertNext = true;
        } else if (convertNext) {
            ch = Character.toTitleCase(ch);
            convertNext = false;
        } else {
            ch = Character.toLowerCase(ch);
        }
        converted.append(ch);
    }

    return converted.toString();
}
}
