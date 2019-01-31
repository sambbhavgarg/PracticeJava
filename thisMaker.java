import java.util.Scanner;
class evethin{
int id;
String name;
float fee;
evethin(int id,String name)
{
this.id=id;
this.name=name;
}//this keyword is used when theres a dispute between the instances and arguments
evethin(int id, String name, float fee)
{
  this(id,name);//reusing this constructor, this() must always be the first statement
  this.fee=fee;//
}

void display()
{
 System.out.print("id: "+id+"name: "+name+"fees: "+fee);
}
}
class thisMaker{
static public void main(String []args)
{
 int id;
 String name;
 float fee;
 Scanner scan=new Scanner(System.in);
 System.out.print("Enter ID: ");
 id=scan.nextInt();
 System.out.print("Enter name: ");
 name=scan.next();
 System.out.print("Enter fees: ");
 fee=scan.nextFloat();
 evethin e1=new evethin(id,name);
 System.out.print("Enter ID: ");
 id=scan.nextInt();
 System.out.print("Enter name: ");
 name=scan.next();
 System.out.print("Enter fees: ");
 fee=scan.nextFloat();
 evethin e2=new evethin(id,name,fee);
 e1.display();
 e2.display();
}
}
