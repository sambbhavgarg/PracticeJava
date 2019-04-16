package bin.q3;
import java.util.Scanner;

public class Q3{
  Scanner in = new Scanner(System.in);
  Q3(){
    System.out.print("Enter three numbers(smallest to largest) and if you want strict increasing or not(true/false): ");
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    boolean equalOk = in.nextBoolean();
    System.out.println("/n");
    boolean fin = q.inOrderEqual(a,b,c,equalOk);
    System.out.println(fin);
  }
  public static void main(String[] args) {
    Q3 q = new Q3();

  }
}
