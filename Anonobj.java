import java.util.Scanner;
class Calcie{
 void factorialRet(int n)
 {
  if(n==0)
  System.out.print("Factorial: 1\n");
  else
  {
  int fact=1;
  for(int i=2;i<=n;i++)
  fact*=i;
  System.out.print("Factorial: "+fact+"\n");
  }
 }
}
class Anonobj{
 public static void main(String []args)
 {
   Scanner scan=new Scanner(System.in);
   System.out.print("Enter a number: ");
   int num=scan.nextInt();
   //calcie obj = new calcie();
   //obj.facto(num);
   new Calcie().facto(num);//anonymous object
 }
}
