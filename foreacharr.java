import java.util.Scanner;
class foreacharr{
  public static void main(String []args)
  {
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter 10 elements: ");
    int arr[]=new int[10];
    //int i=0;
    for(int i=0;i<10;i++)//cant use for each to feed values, it only extracts
    {
      arr[i]=scan.nextInt();
    }
    for(int i:arr)
    {
      System.out.print(i+" ");//not arr[i]!
    }
  }
}
//for each extracts the values in the i variable.
