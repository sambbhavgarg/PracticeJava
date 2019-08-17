package bin.collections;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

class ListsPractice{
  public static void main(String[] args) {
    List<String> s = new ArrayList<String>();
    s.add("Sambbhav");
    s.add("Ambika");
    s.add("Samarth");
    s.add("Shambhavi");
    s.add("Aaryash");
    System.out.println(s.get(2)+"\n");
    for(String ps: s)
      System.out.println(ps);
    System.out.println();
    ListIterator<String> li = s.listIterator();
    System.out.println("Forward");
    while(li.hasNext()){
      System.out.println("Index: "+li.nextIndex()+" Value: "+li.next());
    }
    System.out.println("Backward");
    while(li.hasPrevious()){
      System.out.println("Index: "+li.previousIndex()+" Value: "+li.previous());
    }
  }
}
