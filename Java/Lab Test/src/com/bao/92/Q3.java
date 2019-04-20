package bin.com.bao.ninetytwo;
import bin.com.bao.ninetytwo.InOrderEqual;

import java.util.Scanner;

class Q3 extends InOrderEqual{
  Scanner in = new Scanner(System.in);
  Q3(){
    System.out.println("Enter three numbers(smallest to largest) and if you want strict increasing or not(true/false): ");
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    boolean equalOk = in.nextBoolean();
    InOrderEqual ioe = new InOrderEqual();
    boolean fin = ioe.inOrderEqual(a,b,c,equalOk);
    System.out.println(fin);
  }
  public static void main(String[] args) {
    Q3 q = new Q3();
  }

}
