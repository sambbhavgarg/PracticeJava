//covariant return type
class A{
 A get(){
 System.out.print("Hello\n");
 return this;
 }
}
class covret extends A{
  covret get(){
    return this;
  }
  void message(){
    System.out.print("World\n");
  }
  public static void main(String args[])
  {
    new A().get();//agar return type class name hai toh . operator se access karlo koi bhi method
  }
}
