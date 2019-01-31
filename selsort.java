import java.util.Scanner;
class selsort{
  static void selesort(int a[]){
    for(int i=0;i<a.length;i++){
      temp=i;
      for(int j=i+1;j<a.length;j++){
        if(a[temp]>a[j])
        temp=j;
        if(temp!=i){
          a[i]=a[i]^a[temp];
          a[temp]=a[temp]^a[i];
          a[i]=a[i]^a[temp];
        }
      }
    }
  }
  static void insort(int a[]){

  }
  public static void main(String... args){
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int n=scan.nextInt();
    new a[n];
    System.out.print("Enter array elements: ");
    for(int i=0;i<n;i++){
      a[i]=nextInt();
    }
    selesort(a);
    for(int i=0;i<n;i++){
      System.out.print(a[i]+" ");
    }
  }
}
