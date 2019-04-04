
package bin.polymorphism;
import java.util.Scanner;

public class SalariedWorker extends Worker{//gets paid for 40 hours a week
  @Override
  public float ComPay(){
    System.out.println("Enter number of weeks worked: ");
    int weeks = scan.nextInt();
    System.out.println("Paycheck: "+(weeks*20000)+" Rupees\n");
    return 0;
  }
}
