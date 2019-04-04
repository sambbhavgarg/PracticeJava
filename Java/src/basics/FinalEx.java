package bin.basics;
class Bike{
  final void run(){//cannot be overriden because final
    System.out.print("Bike starts...\n");}
  }
class Activa extends Bike {
  void run(){
    System.out.println("Activa starts...");
  }
}
class FinalEx{
public static void main(String... args){
    Activa A = new Activa();
  //System.out.print(h.run());
  }
}
