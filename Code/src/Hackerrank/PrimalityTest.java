package bin.hackerrank;
import java.io.*;
import java.math.BigInteger;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class PrimalityTest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        // long num = Integer.parseInt(n);
        BigInteger a = new BigInteger(n);
        if(a.isProbablePrime(1))
          System.out.println("prime");
        else
        System.out.println("not prime");
        scanner.close();
    }
}
