import java.util.Scanner;
public class refinitobj{
  int grade;
  String name;//instance variables
 public static void main(String args[])//main can be outside the class in another class too
 {
   Scanner scan=new Scanner(System.in);
   Test t1=new Test();
   Test t2=new Test();
   System.out.print("Enter name: ");
   t1.name=scan.next();
   System.out.print("Enter grade: ");
   t1.grade=scan.nextInt();
   System.out.print("Enter name: ");
   t2.name=scan.next();
   System.out.print("Enter grade: ");
   t2.grade=scan.nextInt();
   System.out.print("\nname: "+t1.name+"\ngrade: "+t1.grade+"\n");//initializing object through reference
   System.out.print("\nname: "+t2.name+"\ngrade: "+t2.grade+"\n");//initializing object through reference
 }
};
//heap memory allocation, stacking
