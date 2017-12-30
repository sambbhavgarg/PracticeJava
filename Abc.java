class argThis{
void n(argThis obj){
System.out.print("objectified!");
}
void m(){
n(this);
}
public static void main(String []args)
{
argThis a=new argThis();
a.m();
}
}
//doubts
