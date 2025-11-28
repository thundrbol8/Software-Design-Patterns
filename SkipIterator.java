package behavioral.iterator.iterator;

public class SkipIterator extends Iterator<String> {
  private final int skip;


  public SkipIterator(BookCollection bookCollection, int skip) {
    this.bookCollection = bookCollection;
    this.index = 0;
    this.skip = skip;
  }

  @Override
  public boolean hasNext() {
    return bookCollection.getBookCollectionSize() > index;
  }

  @Override
  public String getNext() {
    String book =  bookCollection.getBook(index);
    index += skip;
    return book;
  }

}
