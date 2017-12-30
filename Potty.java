class Animal {
Animal()
 {
System.out.print("BIGBOOP!\n");
 }
}
class Doggo extends Animal{
Doggo()
{
 System.out.print("BOOP!\n");
}
}

class Potty extends Doggo{
  Potty()
  {
    System.out.print("PUT PUT PUTTT!\n");
  }
  Potty(int n){
    System.out.print("entered: "+n+"\n");
  }
public static void main(String args[])
{
Animal b= new Animal();//sirf animal hoga
Potty a=new Potty();//saare honge
Potty a1= new Potty(5);//saare honge
}
}
//example of single inheritance, similary multilevel inheritance has 3 classes.
//hierarchal inheritance has three classes too, 2 subclasses(disconnected) and one super class or parent classes
//java does not support multiple inheritance due to fn call ambiguity
