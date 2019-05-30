package bin.hackerrank;
import java.io.*;
import java.util.regex.*;
import java.util.Scanner;
import java.lang.String;


public class StringTokens {

  public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        String [] arrOfStr = str.split("\\W[^ ]",-1);
        System.out.println(arrOfStr.length);

        for(int i=0; i<arrOfStr.length; i++)
                  System.out.println(arrOfStr[i]);

    }
}
