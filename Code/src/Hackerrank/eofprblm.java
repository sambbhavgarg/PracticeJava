package bin.hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class eofprblm {

  public static void main(String[] args) {
    int i=1;//if java has default value 0 for int, why do i have to initialize?
    Scanner scan = new Scanner(System.in);
    while(scan.hasNext()){
    System.out.println(i+" "+scan.nextLine());
    ++i;
    }
  }
}
