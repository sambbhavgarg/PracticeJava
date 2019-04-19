package bin.hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//class IdharSeBaharException extends Exception{
//  IdharSeBaharException(String s){
//  }
//}

public class PGram {
  Scanner scan = new Scanner(System.in);
  int B = scan.nextInt();
  int H = scan.nextInt();
  //if (B>=100 && B<=-100 && H>=100 && H<=-100)
    //if(B<0 && H<0)
      //throw IdharSeBaharException("Breadth and height must be positive.");
  public static void main(String[] args){
    PGram pg = new PGram();
		int area=PGram.B*PGram.H;
		System.out.print(area);
  }//end of main
}//end of class

//try{
//
//}catch(IdharSeBaharException I){
//   System.out.println("java.lang.Exception: "+I);
// }
