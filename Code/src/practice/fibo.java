import java.util.Scanner;
class fibo{
 public static void main(String []args)
 {
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter number of elements in fibo series: ");
  int range=scan.nextInt();
  int nxt,a=0,b=1;
  System.out.println(a+"\n"+b);
  for(int i=0;i<range;i++)
  {
    nxt=a+b;
    a=b;
    b=nxt;
    System.out.println(""+nxt);
  }
 }
};
