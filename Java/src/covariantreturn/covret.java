package bin.covarientret;
//covariant return type
class A{
 A get(){
 System.out.print("World\n");
 return this;
 }
}
class covret extends A{
  covret get(){
    System.out.print("Hello\n");
    return this;//returns object of class get,
                //as object of this class is returned, A get() is also called because covret extends A.
  }
  void message(){
    System.out.print("World\n");
  }
  public static void main(String args[])
  {
    A obj = new covret();
    obj.get();
    //agar return type class name hai toh . operator se access karlo koi bhi method
  }
}
/*
Return types may vary among methods that override each other
if the return types are reference types.

The notion of return-type-substitutability supports covariant returns,
that is, the specialization of the return type to a subtype.
A method declaration d1 with return type R1 is return-type-substitutable
for another method d2 with return type R2, if and only if the following conditions hold:
  If R1 is void then R2 is void.
  If R1 is a primitive type, then R2 is identical to R1.
  If R1 is a reference type then:
    R1 is either a subtype of R2 or R1 can be converted to a subtype of R2 by unchecked conversion (§5.1.9), or
    R1 = |R2|

*/
