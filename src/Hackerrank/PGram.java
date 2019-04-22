package bin.hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// class OutOfHereException extends Exception{
//    OutOfHereException(String s){
//      super(s);
//    }
// }

public class PGram{
  static int B, H;
  static boolean flag;
  static{
    Scanner scan = new Scanner(System.in);
    B = scan.nextInt();
    H = scan.nextInt();
    flag = true;
    try{
      if (B>=100 || B<0 || H>=100 || H<0){
        flag = false;
        throw new Exception("Breadth and height must be positive");
      }
    }catch(Exception e){
      System.out.println(e);
    }
  }
  public static void main(String[] args){
      if(flag){
        int area = B*H;
    		System.out.println(area);
      }
  }//end of main
}//end of class
