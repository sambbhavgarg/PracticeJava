class Bike{
  int data=50;
void run(){
System.out.print("RUNNING\n");
}
}
class Upcast extends Bike{
  int data=90;
void run(){System.out.print("running nicely\n");}
public static void main(String []args){
Bike b=new Upcast();
b.run();
System.out.print(obj.data);
}
}
//splendar extends bike and overrides its run
//calling run by ref var of parent class
//ref var of parent class refers to subclass object and subclass method overrides parent method
//subclass method is invoked
//while on the other hand data members are not overridden
