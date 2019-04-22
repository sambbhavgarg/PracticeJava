package bin.practice;
interface Divmo{
  public void division(int a);
  public void modulus(int b);
}

class Stud implements Divmo{
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

class Supply extends Stud{

  public static void main(String args[])
  {
    Supply s=new Supply();
    s.name = "Rhitik Krishnani";
    s.division(5);
    s.modulus(15);
    s.display();
  }

}
