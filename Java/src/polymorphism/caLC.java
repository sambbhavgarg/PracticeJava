//method overloading with type promotion
public class caLC{
  void multi(int l, short m){System.out.print(l*m+"\n");}
  void multi(int m, double n){System.out.print(m+n+"\n");}
  //void multi(int a, long b){System.out.print(a/b+"\n");}
  public static void main(String []args)
  {
   caLC c=new caLC();
   c.multi((short)5,(short)5);

  }
}
//since there is a type mismatch int is promoted to double and then executed
