package bin.hackerrank;
import java.util.Scanner;

public class FormatOutput {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1 = sc.next();
                int x = sc.nextInt();
                String str1 = String.format("%03d",x);
                int len = s1.length();
                int sp = 15-len;
                for(int j=0; j<sp; j++)
                  s1=s1+" ";
                System.out.println(s1+str1);
            }
            System.out.println("================================");

    }
}
