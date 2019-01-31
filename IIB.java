//instance initializer block

class A{
A(){
System.out.println("parent class constructor invoked");
}
}

class IIB extends A{
IIB(){
super();
System.out.println("child class constructor invoked");
}

IIB(int a){
super();
System.out.println("child class constructor invoked "+a);
}

{System.out.println("instance initializer block is invoked");}

public static void main(String args[]){
IIB b1=new IIB();
IIB b2=new IIB(10);  
}
}
