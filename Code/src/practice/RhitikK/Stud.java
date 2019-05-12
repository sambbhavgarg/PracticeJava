package bin.practice;

public class Stud implements Divmo{
  String name;
  int div, mod;

  void name(String n){
    name = n;
  }

  public void division(int a){
    div = a;
  }

  public void modulus(int b){
    mod = b;
  }

  void display(){

    System.out.println("Division :" + div);
    System.out.println("Modulus :" + mod);
    System.out.println("Name: "+ name);
  }
}
