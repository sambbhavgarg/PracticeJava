package bin.collections;
import java.util.*;

class Book{
  int id, quantity;
  String name, author, publisher;

  public Book(int id, String name, String author, String publisher, int quantity){
    this.id = id;
    this.quantity = quantity;
    this.name = name;
    this.author = author;
    this.publisher = publisher;
  }
}

public class ListIteratorBook{
  public static void main(String[] args) {
    List<Book> list = new ArrayList<Book>();

    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);

    list.add(b1);
    list.add(b2);
    list.add(b3);

    for(Book b: list){
      System.out.println(b.id+"-"+b.name+"-"+b.author+"-"+b.publisher);
    }
  }
}
