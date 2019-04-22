package bin.basics;
import java.util.Scanner;
class grades{
 static public void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter name: ");
  String name=sc.next();
  System.out.println("Enter your marks: ");
  int marks=sc.nextInt();
  System.out.println("Name: "+name+"\nMarks: "+marks);
  if(marks>80)
  System.out.println("Grade: A");
  else if(marks>60 && marks<=80)
  System.out.println("Grade: B");
  else if(marks>40 && marks<=60)
  System.out.println("Grade: C");
  else
  System.out.println("Sorry, you failed. \nTry again next year.");
  sc.close();
}
}
