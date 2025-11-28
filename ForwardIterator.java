package behavioral.iterator.iterator;

public class ForwardIterator extends Iterator<String> {

  public ForwardIterator(BookCollection bookCollection) {
    this.bookCollection = bookCollection;
    this.index = 0;
  }

  @Override
  public boolean hasNext() {
    return index < bookCollection.getBookCollectionSize();
  }

  @Override
  public String getNext() {
    return bookCollection.getBook(index++);
  }

}
