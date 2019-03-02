package com.garg.covarient_return_type;
import com.garg.covarient_return_type.A;
public class C extends A{
  public static void funA(){
    System.out.println("funA from C");
  }
  public static void main(String[] args) {
    A obj = new C();
    obj.funA();
  }
}
