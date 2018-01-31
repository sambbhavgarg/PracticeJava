class thismethod{
void n(thismethod obj){
System.out.print("fn n\n");
}
void m(){
//n(this);
System.out.print("function m\n");//is not printed
n(this);//this works just fine when it behaves as a method after n commands.
}
public static void main(String []args)
{
thismethod a=new thismethod();
a.m();
}
}
//doubts
