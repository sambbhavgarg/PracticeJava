import java.util.*;
class calcie{
 void facto(int n)
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
class anonobj{
 public static void main(String []args)
 {
   Scanner scan=new Scanner(System.in);
   System.out.print("Enter a number: ");
   int num=scan.nextInt();
   new calcie().facto(num);//anonymous object
 }
}
