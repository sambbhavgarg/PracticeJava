
package bin.polymorphism;
import java.util.Scanner;

public class DailyWorker extends Worker{//gets paid on the basis of number of days worked
  @Override
  public float ComPay(){
    System.out.println("Enter number of days worked: ");
    int days = scan.nextInt();
    System.out.print("Paycheck: "+(days*200)+" Rupees.\n");
    return 0;
  }

}
