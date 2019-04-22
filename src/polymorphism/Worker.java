package bin.polymorphism;
import java.util.Scanner;

public class Worker {
  String name;
  float sal_rate;
  Scanner scan = new Scanner(System.in);
  public Worker(){
    System.out.print("Enter Name: ");
    name = scan.nextLine();
    System.out.print("Enter Salary Rate: ");
    sal_rate = scan.nextFloat();
  }
  public float ComPay(){//to compute weekly pay of every Worker
    return 0;
  }
}
