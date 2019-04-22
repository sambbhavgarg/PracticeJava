package bin.strings;
import java.lang.String;
import java.util.Scanner;

class SubSearch{

  Scanner scan = new Scanner(System.in);
  final char C;
  String str = new String();

  SubSearch(){
    System.out.print("Enter a String: ");
    str = scan.next();
    System.out.print("Which character must you look for?: ");
    C = scan.next().charAt(0);
    int[] indexes = searchMe(C);
    System.out.println("First Occurrence: "+(indexes[0]+1));
    System.out.println("Last Occurrence: "+(indexes[1]+1));
  }

  public int[] searchMe(char ch){
    int[] ar = new int[2];
    for(int i=0; i<2; i++){
      ar[0] = str.indexOf(ch);
      ar[1] = str.lastIndexOf(ch);
    }
    return ar;
  }
  public static void main(String[] args) {
    SubSearch ss = new SubSearch();
  }
}
