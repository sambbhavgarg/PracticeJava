package bin.covret;
public class C extends A{
  public static void funA(){
    System.out.println("funA from C");
  }

  public static void funC(){
    System.out.println("funA from C");
  }

  public static void main(String[] args) {
    A obj = new C();
    C obj1 = new C();
    obj.funA();
    //obj.funC(); throws an error. cannot find funC.
    obj1.funA();
    obj1.funC();
  }
}

//covarient return type interface ka karne se
//sirf woh function implement karne hote hain
//jo dono mein common ho.
