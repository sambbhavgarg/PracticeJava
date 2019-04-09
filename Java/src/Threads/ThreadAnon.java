package bin.threads;

public class ThreadAnon{
  ThreadAnon(){
    System.out.println("Hi World");
  }
    public static void main(String[] args) {
      ThreadAnon t1 = new ThreadAnon();
      Thread t = new Thread(){
        public void run(){
          System.out.println("Hello World");
        }
      };
      t.start();
    }
}
