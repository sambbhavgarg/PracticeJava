package bin.hackerrank;
import java.util.Scanner;
// import bin.sorting.BubbleSort;

public class LexicSub1 {

    public static void bubble(String[] a){
      // System.out.println(a.length+"\n");
      for(int i=0;i<a.length-1;i++){
        for(int j=i+1;j<a.length;j++){
          if(a[i].compareTo(a[j])>0){
            String temp = a[i];
            a[i] = a[j];
            a[j] = temp;
          }
        }
      }
      // for(int i=0; i<a.length; i++){
      //   System.out.println(a[i]);
      // }

      // System.out.println();
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";


        int n = s.length();
        int ar_len = n-k+1;
        String[] st_ar = new String[ar_len];


        for(int i=0; i<ar_len; i++){
          st_ar[i] = s.substring(i,i+k);
          // System.out.println(st_ar[i]);
        }
        LexicSub1 ls = new LexicSub1();
        // System.out.println();
        ls.bubble(st_ar);
        // BubbleSort bs = new BubbleSort(st_ar);

        smallest = st_ar[0];
        largest = st_ar[ar_len-1];
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
