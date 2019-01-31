class Student{
float getfees(){return 0.0f;}

}
class Sam extends Student{
float getfees(){return 9.34f;}
}
class Manuel extends Student{
float getfees(){return 8.4f;}
}
class Philip extends Student{
float getfees(){
return 6.7f;
}
}
class Tester{
public static void main(String args[]){
Student s=new Student();
System.out.print("Default fees: "+s.getfees());
s=new Sam();
System.out.print("Sams fees: "+s.getfees());
s=new Manuel();
System.out.print("Manuel fees: "+s.getfees());
s=new Philip();
System.out.print("Philip fees: "+s.getfees());
}
}
