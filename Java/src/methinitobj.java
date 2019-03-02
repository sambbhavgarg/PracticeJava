import java.util.Scanner;
class info{
  int mark;
  String names;
  void insertRec(int m, String n)
  {
    mark=m;
    names=n;
  }
  void displayRec()
  {
    System.out.print(mark+" "+names);
  }
};
class methinitobj{
  public static void main(String []args)
  {
    Scanner scan=new Scanner(System.in);
    info i1=new info();
    info i2=new info();
    System.out.print("Enter marks: ");
    int marks=scan.nextInt();
    System.out.print("Enter name: ");
    String name=scan.next();
    i1.insertRec(marks,name);
    System.out.print("Enter marks: ");
    marks=scan.nextInt();
    System.out.print("Enter name: ");
    name=scan.next();
    i2.insertRec(marks,name);
    i1.displayRec();
    i2.displayRec();
  }
};
