//method override in java
class ABC{
 void printer(){
  System.out.print("ABC!\n");
 }
}
class BCD {
void printer(){
 System.out.print("BCD!\n");
 }
}
class CDE{
void printer(){
 System.out.print("CDE!\n");
}
}
class overrider{
 public static void main(String []args)
 {
   ABC abc=new ABC();
   BCD bcd=new BCD();
   CDE cde=new CDE();
   abc.printer();
   bcd.printer();
   cde.printer();
 }
}
