import java.util.Scanner;
class prime{
  static public void main(String []args)
  {
    int count=0;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num=scan.nextInt();
    for(int i=2;i<num;i++)
    {
      if(num%i==0)
      count++;
    }
    if(count!=0)
    System.out.println("Composite number!");
    else
    System.out.println("Prime number!");
  }
};
