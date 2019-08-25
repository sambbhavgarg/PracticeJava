package bin.projecteuler;

class Problem2{
  public static void main(String[] args) {
    int a = 0, b = 1, c = 0, n = 4000000, sum = 0;
    System.out.print("0 1 ");
    for(int i=2; c<n; i++){
      c = a + b;
      a = b;
      b = c;
      if(c%2 == 0){
        sum += c;
      }
    }
    System.out.println(sum);
  }
}
