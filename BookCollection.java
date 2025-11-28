package behavioral.iterator.iterator;

import java.util.List;

public class BookCollection implements IterableCollection<String> {

  private final List<String> books;

  public BookCollection(List<String> books) {
    this.books = books;
  }

  @Override
  public Iterator<String> createIterator(IteratorType iteratorType) {

    switch(iteratorType) {
      case BACKWARD -> {
        return new BackwardIterator(this);

      } case FORWARD -> {
        return new ForwardIterator(this);

      } default -> {
        return new SkipIterator(this, 2);
      }

    }

  }

  public String getBook(int index) {
    return books.get(index);
  }

  public int getBookCollectionSize() {
    return books.size();
  }

}
