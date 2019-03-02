class ThisAsArgs{

  void n(ThisAsArg obj){
    System.out.print("objectified!");
  }

  void m(){
    n(this);
  }

  public static void main(String []args)
  {
    ThisAsArg a = new ThisAsArg();
    a.m();
  }
}
//doubts
