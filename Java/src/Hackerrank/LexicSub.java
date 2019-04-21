package bin.hackerrank;
import java.util.Scanner;

public class LexicSub {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest;
        String largest;
        int n = s.length();
        int ar_len = n-k+1;
        String[] st_ar = new String[ar_len];


        for(int i=0; i<ar_len; i++){
          st_ar[i] = s.substring(i,i+k);
          System.out.println(st_ar[i]);
        }

        int max=0, min=0, flag1=0, flag2=0;

        max = st_ar[0].compareTo(st_ar[1]);
        System.out.println(max);
        min = st_ar[0].compareTo(st_ar[1]);
        System.out.println(min);

        for(int i=1; i<ar_len-1;i++){
          if(max > st_ar[i].compareTo(st_ar[i+1])){
            max = st_ar[i].compareTo(st_ar[i+1]);
            System.out.println(max);
            flag1 = i;
            System.out.println(flag1);
          }

          if(min < st_ar[i].compareTo(st_ar[i+1])){
            min = st_ar[i].compareTo(st_ar[i+1]);
            System.out.println(min);
            flag2 = i;
            System.out.println(flag2);
          }
        }

        largest = st_ar[flag1];
        System.out.println(flag1);
        smallest = st_ar[flag2];
        System.out.println(flag2);

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
//
// helloworld
// n = 10.
