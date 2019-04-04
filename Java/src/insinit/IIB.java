package bin.instanceinitializer;
//instance initializer block

class A{
A(){
System.out.println("parent class constructor invoked");//1st//1st
}
}

class IIB extends A{
IIB(){
super();
System.out.println("child class constructor invoked");//3rd
}

IIB(int a){
super();
System.out.println("child class parameterized constructor invoked: "+a);//3rd
}

{System.out.println("instance initializer block is invoked");}//2nd//2nd

public static void main(String args[]){
IIB b1=new IIB();
IIB b2=new IIB(10);
}
}
