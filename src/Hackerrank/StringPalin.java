package bin.hackerrank;
import java.io.*;
import java.util.*;

public class StringPalin {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder sb = new StringBuilder();
        sb.append(A);
        sb = sb.reverse();
        System.out.println("reversed: "+sb);
        System.out.println("A: "+A);
        if(A.equals(sb.toString())==0)
            System.out.println("Yes");
        else
            System.out.println("No");


        }
    }
