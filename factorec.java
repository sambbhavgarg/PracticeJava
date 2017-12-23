import java.util.Scanner;
class factorec{
  public static void main(String []args)
  {
    System.out.println("enter number: ");
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int facto=factorial(num);
    System.out.println("factorial: "+facto);
  }
  static int factorial(int n)
  {
    if(n==0)
    return 1;
    else
    return n*factorial(n-1);
  }
}
