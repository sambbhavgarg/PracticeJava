import java.util.Scanner;
class Acclat{
  Scanner scan=new Scanner(System.in);
  int acnum;
  String emp;
  float balan;
  void insert(int acno, String name, float cbal)
  {
    acnum=acno;
    emp=name;
    balan=cbal;
  }
  void depAcc()
  {
   System.out.print("Enter amount: ");
   float d=scan.nextFloat();
   balan+=d;
   System.out.print("deposited: "+d+"\n");
  }
  void withAcc()
  {
    System.out.print("Enter amount: ");
    float d=scan.nextFloat();
    balan-=d;
    System.out.print("withdrawn: "+d+"\n");
  }
  void checkBal()
  {
    System.out.print("Balance: "+balan+"\n");
  }
};
class BankAccount{
 public static void main(String []args)
 {
  int c1,c2;
  Acclat a1=new Acclat();
  Acclat a2=new Acclat();
  int acno;
  float cbal;
  String name;
  Scanner scan=new Scanner(System.in);
  System.out.print("Enter Acc number 1: ");
  acno=scan.nextInt();
  System.out.print("Enter name 1: ");
  name=scan.next();
  System.out.print("Enter first withdrawal 1: ");
  cbal=scan.nextFloat();
  a1.insert(acno,name,cbal);
  System.out.print("Enter Acc number 2: ");
  acno=scan.nextInt();
  System.out.print("Enter name 2: ");
  name=scan.next();
  System.out.print("Enter first withdrawal 2: ");
  cbal=scan.nextFloat();
  a2.insert(acno,name,cbal);
  do{
    System.out.print("1."+a1.emp+", 2."+a2.emp+", 3.exit\n");
    c1=scan.nextInt();
    switch(c1)
    {
      case 1: do
              {
              System.out.print("1, deposit, 2. withdraw, 3. check bal, 4. exit\n");
              c2=scan.nextInt();
              switch(c2)
                {
                case 1: a1.depAcc();break;
                case 2: a1.withAcc();break;
                case 3: a1.checkBal();break;
                }
              }
              while(c2!=4);
              break;
      case 2: do
                {
                System.out.print("1, deposit, 2. withdraw, 3. check bal, 4. exit\n");
                c2=scan.nextInt();
                switch(c2)
                  {
                  case 1: a2.depAcc();break;
                  case 2: a2.withAcc();break;
                  case 3: a2.checkBal();break;
                  }
                }
                while(c2!=4);
                break;

    }
  }
  while(c1!=3);
 }
}
