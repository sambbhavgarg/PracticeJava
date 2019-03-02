class Example1{
final static int data;// final instance can be empty and static too
static {data=50;}
public static void main(String args[]){
System.out.print(data);
}
}
//final parameters once passed cant be changed
//constructor cant be final because its not inherited
