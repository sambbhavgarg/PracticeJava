package bin.hackerrank;
//// import java.io.*;
// import java.lang.Math;
//
// class GP{
//     public static void main(String []argh){
//         Scanner in = new Scanner(System.in);
//         int t = in.nextInt();
//         double itr = 0;
//         for(int i=0;i<t;i++){
//             int a = in.nextInt();
//             int b = in.nextInt();
//             int n = in.nextInt();
//             GP.iter(n,a,b);
//         }
//
//         in.close();
//
//     }
//     static void iter(int n, int a, int b){
//       double tot = 0;
//       for(int i=0; i<n; i++){
//         double pow = Math.pow(2,i);
//         tot = tot+(pow*b);
//         if(i==0) tot += a;
//         System.out.println(tot+" ");
//       }
//     }
//
// }

import java.util.*;
import java.io.*;
import java.lang.Math;

class GP{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        double itr = 0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            GP.iter(n,a,b);
        }

        in.close();

    }
    static void iter(int n, int a, int b){
      double tot = 0;
      for(int i=0; i<n; i++){
        double pow = Math.pow(2,i);
        tot = tot+(pow*b);
        if(i==0) tot += a;
        int fin = int(tot);
        System.out.print(fin+" ");
      }
    }

}
