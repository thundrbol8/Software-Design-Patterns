package behavioral.iterator.iterator;

public class BackwardIterator extends Iterator<String> {

  public BackwardIterator(BookCollection bookCollection) {
    this.bookCollection = bookCollection;
    this.index = bookCollection.getBookCollectionSize() - 1;
  }

  @Override
  public boolean hasNext() {
    return index >= 0;
  }

  @Override
  public String getNext() {
    return bookCollection.getBook(index--);
  }

}
