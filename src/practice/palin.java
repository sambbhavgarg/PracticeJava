import java.util.Scanner;
class palin{
  public static void main(String [] args)
  {
    Scanner scan=new Scanner(System.in);
    System.out.println("enter a number: ");
    int num=scan.nextInt();
    int rem, temp=num,new1=0;
    while(num>0)
    {
      rem=num%10;
      new1=new1*10+rem;
      num/=10;
    }
    if(new1==temp)
    System.out.println("Palindrome!");
    else
    System.out.println("Not Palindrome");
  }
};
