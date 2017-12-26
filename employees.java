import java.util.Scanner;
class insert{
  int id;
  String name;
  float sal;
  void insertRec(int ID,String n,float s)
  {
    id=ID;
    name=n;
    sal=s;
  }
  void dispRec()
  {
    System.out.print("\n"+id+" "+name+" "+sal+"\n");
  }
}
class employees{
  public static void main(String []args)
  {
    Scanner scan=new Scanner(System.in);
    insert i1=new insert(),i2=new insert(),i3=new insert();
    System.out.print("Enter ID: ");
    int ID=scan.nextInt();
    System.out.print("Enter name: ");
    String Name=scan.next();
    System.out.print("Enter BS: ");
    float Salary=scan.nextFloat();
    i1.insertRec(ID,Name,Salary);
    System.out.print("Enter ID: ");
    ID=scan.nextInt();
    System.out.print("Enter name: ");
    Name=scan.next();
    System.out.print("Enter BS: ");
    Salary=scan.nextFloat();
    i2.insertRec(ID,Name,Salary);
    System.out.print("Enter ID: ");
    ID=scan.nextInt();
    System.out.print("Enter name: ");
    Name=scan.next();
    System.out.print("Enter BS: ");
    Salary=scan.nextFloat();
    i3.insertRec(ID,Name,Salary);
    i1.dispRec();
    i2.dispRec();
    i3.dispRec();
  }
}
