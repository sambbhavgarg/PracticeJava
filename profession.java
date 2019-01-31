/*
    The super keyword in java is a reference variable which is used to refer immediate parent class object.
    1.super can be used to refer immediate parent class instance variable.
    2.super can be used to invoke immediate parent class method.
    3.super() can be used to invoke immediate parent class constructor.
*/
class human{
int id;
String name;
human(int id, String name){
this.id=id;
this.name=name;
}
}
class profession extends human{
float salary;
profession(int id,String name, float salary){
super(id,name);
this.salary=salary;
}
void display(){
System.out.print("ID: "+id+"\nName: "+name+"\nSalary: "+salary+"\n");
}
public static void main(String... args){
profession p1=new profession(1,"Sam",34.54f);
profession p2=new profession(2,"Nak",45.87f);
profession p3=new profession(3,"Sum",100f);
p1.display();
p2.display();
p3.display();

}
}
