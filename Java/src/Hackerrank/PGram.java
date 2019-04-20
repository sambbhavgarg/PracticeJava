package bin.hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class OutOfHereException extends Exception{
   OutOfHereException(String s){
   }
}

public class PGram{
  static int B, H;
  static{
    Scanner scan = new Scanner(System.in);
    B = scan.nextInt();
    H = scan.nextInt();
    if (B<=100 && H<=100 && B>0 && H>0)
      throw OutOfHereException("Breadth and height must be positive.");
  }


  public static void main(String[] args){
    try{
      int area = B*H;
  		System.out.print(area);
    }
    catch(OutOfHereException I){
      System.out.println("java.lang.Exception: ");
    }

  }//end of main
}//end of class
