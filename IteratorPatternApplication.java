package behavioral.iterator;

import behavioral.iterator.iterator.BookCollection;
import behavioral.iterator.iterator.Iterator;
import behavioral.iterator.iterator.IteratorType;

import java.util.List;

public class IteratorPatternApplication {

  public static void  main(String[] args) {
    BookCollection collection = new BookCollection(
      List.of(
        "Clean Code",
        "Head First Design Patterns",
        "Design data Intensive Applications",
        "Redis Tutorial",
        "Distributed Systems",
        "Introduction to Spring MVC Framework"
      )
    );

    Iterator<String> iterator = collection.createIterator(IteratorType.FORWARD);

    while (iterator.hasNext()) {
      System.out.println(iterator.getNext());
    }

  }

}
