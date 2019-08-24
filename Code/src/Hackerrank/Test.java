package bin.hackerrank;
import java.util.*;

class Test{
  // public static void main(String[] args) {
  //
  //   // int n = -100;
  //   // if(n <=  -100 && n>= -100){
  //   //   System.out.println("hello");
  //   // }
  //   //-------------------------------------
  //   // Scanner in = new Scanner(System.in);
  //   // int n = in.nextInt();
  //   // in.close();
  //   // //String s=???; Complete this line below
  //   // Integer i = new Integer(n);
  //   // String s = i.toString();
  //   // System.out.println(s+i);
  //   //-------------------------------------
  //   // Calendar c = Calendar.getInstance();
  //   // System.out.println("The Current Date is:" + c.getTime());
  //   // Calendar c = Calendar.getInstance();
  //   // c.setTime(yourDate);
  //   // int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
  //   // new SimpleDateFormat("EE").format(date);
  //   //-----------------------------------------
  //
  //   int n = scanner.nextInt();
  //
  //   String[] arr = new String[n];
  //
  //   for (int i = 0; i < n; i++) {
  //       String arrItem = scanner.nextLine();
  //       arr[i] = arrItem;
  //   }
  //   int result = gemstones(arr);
  // }
    // static int gemstones(String[] arr) {
    //   int [] valar = new int[26];
    //
    //   Arrays.fill(valar, 1);
    //
    //   for(int i=0; i<arr[i].length; i++){
    //     for(int j=0; j<valar.length(); j++){
    //       int a = arr[i].indexOf(arr[i].charAt(j);
    //     }
    //   }
    // }
//--------------------------------------------------------
 public static void main(String[] args) {
   String str = "DDUUDDUDUUUD";
   int n = 12,
   int flag, c = 0, cacheStart = 0, v = 0;
   for(int i=0; i<n; i++){
     if(str.charAt(i) == 'D'){
       c--;
     }
     else if(str.charAt(i) == 'U'){
       c++;
     }
     if(c == 0){
       StringBuilder s = new StringBuilder(str.substring(cacheStart,i+1));
       flag = (s.toString().startsWith("D") && s.toString().endsWith("U")) ? 1 : 0;
       cacheStart = i+1;
       if(flag == 1){
          v++;
        }
     }
   }
   System.out.println(v);
 }
}
