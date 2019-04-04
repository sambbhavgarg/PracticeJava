package bin.basics;
class Bike{
final void run(){System.out.print("biker\n");}
}
class Example extends Bike{
public static void main(String... args){
new Example().run();
}
}
