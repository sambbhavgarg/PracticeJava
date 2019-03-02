class Bike{
final void run(){System.out.print("biker\n");}
}
class finalEx extends Bike{
public static void main(String... args){
  finalEx h=new finalEx();
//System.out.print(h.run());
}
}
