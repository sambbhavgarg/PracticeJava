import java.util.Scanner;

public class StdII {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();//Sometimes you have to clear the buffer to
                        //print the strings by command  sc.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
