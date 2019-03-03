import java.util.Scanner;
class facto{
 public static void main(String []args)
 {
  System.out.println("Enter number(factorial): ");
  Scanner scan=new Scanner(System.in);
  int num=scan.nextInt();
  if(num!=0)
  {
  int fact=1;
  for(int i=2;i<=num;i++)
   {
     fact*=i;
   }
  System.out.println("factorial: "+fact);
  }
  else
  System.out.println("factorial: 1");
 }
};
