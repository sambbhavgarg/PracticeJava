class person{
 int id;
 String name;
 void input()
 {
   System.out.print("Enter name: ");
   name=scan.next();
   System.out.print("Enter ID: ");
   id=scan.nextInt();
 }
}
class superuse extends person{
  float salary;
  void input()
  {

  }
  superuse(int id,String name,float salary)
  {
    super(id,name);
    this.salary=salary;
  }
  void display(){
    System.out.print(name+id+salary);
  }
  public static void main(String []args)
  {
    superuse su=new superuse();
    su.display();
  }
}
