package bin.customath;
import java.util.List;
import java.util.Iterator;

public class LCMGCD{
  public static int GCD(int a, int b){
    if(b == 0) return a;
    return GCD(b, a%b);
  }

  public static int forArr(int[] a, int n, boolean flag){
    int resGCD = 1, resLCM = 1, i;
    for(i=0; i<n; i++){
      resGCD = GCD(resGCD, a[i]);
      resLCM = (resLCM*a[i])/GCD(resLCM,a[i]);
    }
    if(flag == true)
      return resGCD;
    return resLCM;
  }

  public static int forList(List<Integer> x, boolean flag){
    int resGCD = x.get(0), resLCM = 1, i;
    Iterator<Integer> xi = x.iterator();
    for(i=0; i<x.size(); i++){
      resGCD = GCD(resGCD, x.get(i));
      resLCM = (resLCM*x.get(i))/GCD(resLCM,x.get(i));
    }
    if(flag == true)
      return resGCD;
    return resLCM;
  }
  // public static void main(String[] args) {
  //   int [] arr = new int[]{5, 16, 19, 38, 65};
  //   final int LCM = lcm(arr, 5);
  //   System.out.println(LCM);
  // }
}
