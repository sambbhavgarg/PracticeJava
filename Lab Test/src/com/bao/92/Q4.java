package bin.com.bao.ninetytwo;
import bin.com.bao.ninetytwo.MakeBricks;
import java.util.Scanner;

class Q4 extends MakeBricks{
  Scanner in = new Scanner(System.in);
  Q4(){
    System.out.println("Enter three numbers:");
    final int SMALL = in.nextInt();
    final int BIG = in.nextInt();
    final int GOAL = in.nextInt();
    MakeBricks mb = new MakeBricks();
    boolean fin = mb.makeBricks(SMALL, BIG, GOAL);
    System.out.println(fin);
  }
  public static void main(String[] args) {
    Q4 q = new Q4();
  }
}
