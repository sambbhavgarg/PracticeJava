package basics;
class Dog
{
  String Name;
  int Age;
  public Dog(String Name,int Age)
  {
    this.Name=Name;
    this.Age=Age;
  }
  public String getName()
  {
    return Name;
  }
  public int getAge()
  {
    return Age;
  }
  @Override
  public String toString()
  {
    return ("Name: "+this.getName()+"\nAge: "+this.getAge());
  }
  public static void main(String args[])
  {
    Dog tuffy=new Dog("Magik",9);
    System.out.println(tuffy.toString());
  }

}
