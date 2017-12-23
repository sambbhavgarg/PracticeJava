class Dog
{
  String Name();
  int Age();
  public Dog(String Name,int age)
  {
    this.name=Name;
    this.age=Age;
  }
  public String getName()
  {
    return Name;
  }
  public String getAge()
  {
    return age;
  }
  @Override
  public String toString()
  {
    return ("Name: "+this.getName()+"\nAge: "+this.getAge());
  }
  public static void main(String args[])
  {
    Dog tuffy=new Dog("magik",9);
    System.out.println(tuffy.toString());
  }

}
