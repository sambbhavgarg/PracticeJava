import java.util.*;
import java.io.*;

/*
class JavaLab
{

    static int checkbig(int a, int b, int c){ //static main ne call kiya hai toh static hoga, if u dont want this to be static
                                      //make an object and phir usse call karo
    if(a>b && a>c)
      System.out.println( a+ " is the greatest");
    else if(b>a)
      System.out.println( b+ " is the greatest");
    else
      System.out.println( c+ " is the greatest");
    }

  public static void main (String args[]){
    int a = 5, b = 6, c = 7;
    checkbig(a,b,c);
    }
}


class JavaLab{

  public static void main(String args[]){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[2]);
    int c;

    if(args[1].equals("+")){//string hai na, heap memory concept
      c = a+b;
      System.out.println("Answer: " + c);
    }
    else if(args[1].equals("-")){// && galat ho raha tha
      c = a-b;
      System.out.println("Answer: " + c);
    }
    else{
      System.out.println ("Wrong Input");
    }
  }
}

class JavaLab{

  static void fibo(int n){
    int sum = 0, cur = 1;
    System.out.println(sum+", "+cur+", ");
    for(int i=0;i<n;i++){
    int temp=sum;
    sum=temp+cur;
    cur=temp;
    System.out.println((sum+cur)+", ");
    }
  }

  public static void main(String[]args){
    fibo(10);
    return;
  }
}

//0,1,1,2,3,5,8...
//iter = prev+cur;


interface contract {
  void makeroad();
  void removetree();
  void getperm();
  void celebrate();
}

public class JavaLab extends contracter implements contract{
  void makeroad(){
    System.out.println("Road is laid");
  }
  void removetree(){
    System.out.println("Tree Removed");
  }
  public static void main(String[] args) {
    JavaLab obj1 = new JavaLab();
    obj1.makeroad();
    obj1.removetree();
    obj1.getperm();
    obj1.celebrate();

  }
}//wrong hai yeh

interface contract {
  void makeroad();
  void removetree();
  void getperm();
  void celebrate();
}

class JavaLab {
  public static void main(String[] args) {
    contracter obj = new contracter();
    obj.getperm();
    obj.removetree();
    obj.makeroad();
    obj.celebrate();
  }
}

class JavaLab {
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    int [] marks = new int[10];
    for(int i=0 ; i<10 ; i++){
      marks[i] = scan.nextInt();
      if(marks[i] > 75 && marks[i] <= 100){
        System.out.printf("DISTINCTION!\n");
      }
      else if(marks[i] <= 75 && marks[i] > 50){
        System.out.printf("MERIT!\n");
      }
      else if(marks[i] <= 50 && marks[i] > 40){
        System.out.printf("PASS!\n");
      }
      else{
        System.out.printf("FAIL!\n");
      }
    }
    Quicksortfunction qs = new Quicksortfunction();
    qs.quickSort(marks, 0, 9);
    System.out.printf("Marks in Sorted order: ");
    qs.printSorted(marks);
  }
}

class Pnc{
  void PnC(int arr[], int low, int high){
    while(low<=high){
      int temp = arr[low];
      arr[low] = arr[high];
      arr[high] = temp;
      PnC(arr,low+1,high-1);
  }
}//permutation using recursion.

class JavaLab {
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.printf("Enter number of digits: ");
    int n = scan.nextInt();
    int [] pnc = new int[n];
    for(int i=0 ; i<n ; i++){
      pnc[i] = scan.nextInt();
    }
    Pnc o = new Pnc();
    o.PnC(pnc,0,n-1);
  }
}


//123, 213,312,231,

class Acceptor{
  Scanner scan = new Scanner(System.in);
  int [] ar10 = new int[10];
  Acceptor(){
    System.out.printf("Enter 10 Numbers: ");
    for(int i=0; i<10; i++){
      ar10[i] = scan.nextInt();
    }
  }

  void square(){
    int [] arsquare = new int[10];
    for(int i =0; i<10; i++){
      arsquare[i] = ar10[i]*ar10[i];
      System.out.println("Square of "+ ar10[i]+" is "+arsquare[i]);
    }
  }

   void sum(){
     int sum = 0;
     for(int i =0; i<10; i++){
       sum+=ar10[i];
     }
     System.out.println("Sum of all numbers: "+sum);
   }
}
class JavaLab {
  public static void main(String [] args){
    Acceptor obj = new Acceptor();
    obj.square();
    obj.sum();
  }
}
//non-static methods sirf object se call honge because static funcs class ke hote hain. aur jo class ka nahi woh object ka.

class divby5{
  void summer(){
    int sum = 0;
    for(int i=41; i<250;i++){
      if(i%5==0)
        sum+=i;
    }
    System.out.println("Sum of all ints div by 5: "+ sum);
  }
}
class JavaLab{
  public static void main(String[] args) {
    divby5 obj = new divby5();
    obj.summer();
  }
}

//pehle command dhundh lo, jaise environment variable set karte hain waise terminal commands se package ko universal set karte hain aur package kahin se bhi accessibl0e
//jo main function mein hai, usko sirf class ka naam batana hai aur sirf uss function ka naam jo object return kar raha hai.

class PrivCons{
  private PrivCons(){
    //this is a private constructor
    System.out.println("I am Priv Con!");
  }
  public void testing(){
    System.out.println("test func!");
  }
  static PrivCons retPrivCons(){
    return new PrivCons();
  }
}
class JavaLab{
  public static void main(String[] args) {
    PrivCons obj = PrivCons.retPrivCons();
    obj.testing();
  }
}

//assume: class ka naam sabko pata hai
//jisko class ka naam pata hai woh, agar
//constructor private nahi hai, toh sab hila dega
//but agar private constructor hai, toh kuch nahi hila sakta.
//hence jisko class ke naam ke saath uss function ka name pata hain
//jis function mein constructor return ho raha hai, wohi hila sakta hai.

class PrivCons{
  private PrivCons(){
    //this is a private constructor
    System.out.println("I am Priv Con!");
  }
  public void testing(){
    System.out.println("test func!");
  }
//  static PrivCons retPrivCons(){
//    return new PrivCons();
//  }
}
class JavaLab{
  public static void main(String[] args) {
    PrivCons obj = new PrivCons();
    obj.testing();
  }
}
//assume: class ka naam sabko pata hai
//jisko class ka naam pata hai woh, agar
//constructor private nahi hai, toh sab hila dega
//but agar private constructor hai, toh kuch nahi hila sakta.
//hence jisko class ke naam ke saath uss function ka name pata hain
//jis function mein constructor return ho raha hai, wohi hila sakta hai.


class JavaLab{
  final void run(){
    System.out.println("Running!");
  }
}

class FastRunner extends JavaLab{
  void run(){
    System.out.println("Run faster!");
  }
}

class Caller{
  public static void main(String[] args) {
    FastRunner obj = new FastRunner();
    obj.run();
  }
}

//cannot override final method by making an object of parent class
//if class is made private, we violate its reusability, we cannot inherit it.
//each entity of parent class is part of child class
//has-a: generalization eg object bana ke use karna
//is-a: specialization eg inheritance



class A{
  public static void fun1(){
    System.out.println("static");
  }
}

class B extends A{
  public static void fun1(){
    System.out.println("hiding");
  }
}

class JavaLab{
  public static void main(String[] args) {
    A.fun1();
    B.fun1();
  }
}


class JavaLab{
  private int a= 1999;
  private void testing(int a){
    System.out.println("Hello, "+a);
  }
}

class privacc extends JavaLab{
  public static void main(String[] args) {
    privacc obj = new privacc();
    int a = obj.a;
    obj.testing();
  }
}



class Player{
  void plays(){
    System.out.printf("Player is playing ");
  }
}

class Cricket_Player extends Player{
  void plays_cricket(){
    System.out.println("Cricket");
  }
}

class Football_Player extends Player{
  void plays_football(){
    System.out.println("Football");
  }
}

class Hockey_Player extends Player{
  void plays_hockey(){
    System.out.println("Hockey");
  }
}

class JavaLab{
  public static void main(String[] args) {
    Hockey_Player obj = new Hockey_Player();
    obj.plays(); obj.plays_hockey();
  }
}



class Worker{
  String name;
  float sal_rate;
  Scanner scan = new Scanner(System.in);
  float ComPay(int hours){//to compute weekly pay of every Worker

  }
}

class DailyWorker extends Worker{//gets paid on the basis of number of days worked
  float ComPay(int hours){
    System.out.println("Enter number of days worked: ");
    int Days = scan.nextInt();
    System.out.print("Paycheck: "+(Days*200)+"Rupees.");
  }

}

class SalariedWorker extends Worker{//gets paid for 40 hours a week
  float ComPay(int hours)
}

//HAS-A, IS-A, upcasting

*/



class JavaLab{
  Scanner scan = new Scanner(System.in);
  public static void main(String[] args) {
    MakeString obj = new MakeString(); //function ke andar scanner nahi define hoga
    int stringResult = obj.stringTests("Hello World!");
    System.out.println("Difference between Strings: "+stringResult);
  }
}

class MakeString extends JavaLab{
  protected int stringTests(String str1){
    String str = scan.nextLine();
    str = str.trim();
    str = str.replace('s','f');
    System.out.println(str);
    if(str1 == "fameer")
      System.out.println("foodie");
    else
      System.out.println("Go Java!");
    return str.compareTo("Hello World!");
  }
}
