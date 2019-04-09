package bin.threads;

public class ThreadRunn implements Runnable{
  ThreadRunn(){
    System.out.println("Hi World");
  }
  public void run(){
    System.out.println("Hello World");
  }
  public static void main(String[] args) {
    ThreadRunn t1 = new ThreadRunn();
    Thread t = new Thread(t1);
    t.start();
  }
}
