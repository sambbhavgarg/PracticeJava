package bin.sorting;
import java.util.Scanner;

public class BubbleSort{
  public BubbleSort(String[] a){
    System.out.println(a.length+"\n");
    for(int i=0;i<a.length;i++){
      for(int j=i+1;j<a.length-1;j++){
        if(a[i].compareTo(a[j])>0){
          String temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
    for(int i=0; i<a.length; i++){
      System.out.println(a[i]);
    }
  }
//   public static void main(String...args){
//     Scanner scan=new Scanner(System.in);
//     System.out.print("Enter array size: ");
//     int n=scan.nextInt();
//     int a[]=new int[n];
//     System.out.print("Enter an array ");
//     for(int i=0;i<a.length;i++){
//       a[i]=scan.nextInt();
//     }
//     bubble(a);
//     for(int i=0;i<a.length;i++){
//       System.out.print(a[i]+" ");
//     }
//   }
}
