package bin.exceptions;
import java.util.Scanner;

class StudentDB{
  Scanner scan = new Scanner(System.in);
  String[] name = new String[3];
  int[] rno = new int[3];
  public void storeDetails(){
    try{
        for(int i=0; i<=3; i++){
          System.out.print("Enter name of student "+(i+1)+": ");
          name[i] = scan.next();
          System.out.print("Enter roll no. of student "+(i+1)+": ");
          rno[i] = scan.nextInt();
        }
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Please check array. Something's not right.");
    }
    finally{
      System.out.println("Terminating Program.");
    }
  }
  public static void main(String[] args) {
    StudentDB sdb = new StudentDB();
    sdb.storeDetails();
  }
}
