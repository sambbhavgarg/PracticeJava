
public class C extends B{
  public static void funA(){
    System.out.println("funA from C");
  }
  public static void main(String[] args) {
    A obj = new C();
    obj.funA();
  }
}
