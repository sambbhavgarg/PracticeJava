package bin.projecteuler;
import java.lang.Math;

class Problem4{
  public static void main(String[] args) {
    int max = 0;
    for(int i=100; i<=999; i++){
      for(int j=100; j<=999; j++){
        int palindrome = 0;
        int product = i*j;
        // System.out.println(product);
        int temp = product;
        while(temp>0){
          int rem = temp % 10;
          palindrome = palindrome * 10 + rem;
          temp /= 10;
        }
        // System.out.println(palindrome);
        if(palindrome == product && max<palindrome){
          max = palindrome;
        }
      }
    }
    System.out.println(max);

  }
}
