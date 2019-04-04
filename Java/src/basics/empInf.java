package bin.basics;
import java.util.Scanner;
class Dept{
  String stream, spec;
  Scanner scan=new Scanner(System.in);
  public Dept()
  {
  System.out.print("Enter stream: ");
  stream=scan.next();
  System.out.print("Enter specialization: ");
  spec=scan.next();
  }
}

public class empInf{
  int id;
  String name;
  Dept dept;//instances hain yeh, dept is an object of empinf
public empInf(Dept dept)
{
  Scanner scan=new Scanner(System.in);
  System.out.print("Enter ID: ");
  id=scan.nextInt();
  System.out.print("Enter name: ");
  name=scan.next();
  this.dept=dept;
}
void display()
{
  System.out.print("ID: "+id+" Name: "+name+" Stream: "+dept.stream+" Specialization: "+dept.spec+"\n");
}

  public static void main(String []args)
  {
    Dept dep=new Dept();
    empInf e1=new empInf(dep);

    Dept dep1=new Dept();
    empInf e2=new empInf(dep1);

    e1.display();
    e2.display();
  }
}
//Aggregation of a class in java.
