package bin.threads;

public class ThreadExtend extends Thread{
  void printNow(){
    System.out.println("Hi World!");
  }
    public void run(){
      for (int i=0; i<=10; i++) {
        System.out.println("Num: "+i);
      }
    }
    void printThen(){
      System.out.println("Bi World!");
    }
    public static void main(String[] args) {

      ThreadExtend t = new ThreadExtend();
      t.start();
      t.printNow();
      t.printThen();
    }
}
